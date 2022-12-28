package com.example.demo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.springframework.data.util.Lazy;
import jakarta.persistence.*;
import static jakarta.persistence.GenerationType.IDENTITY;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Subpost {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    @NotBlank(message ="Community name is required ")
    private String name;
    @NotBlank(message="Descriptioin is required")
    private String description;
    @OneToMany(fetch= Lazy)
    private List<Post> posts;
    private Instant createdDate;
    @ManyToOne(fetch = Lazy)
    private User user;

}
