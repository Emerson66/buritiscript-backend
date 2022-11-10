package br.com.buritiscript.buritiscriptbackend.domain.model;

import java.time.LocalDate;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.CreationTimestamp;

import lombok.*;



@Entity(name = "post_table")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String title;
    @NotBlank
    private String linkGithub;
    private int views;
    @CreationTimestamp
    private LocalDate createdAt;
    @NonNull
    @ManyToOne
    private User user;

}
