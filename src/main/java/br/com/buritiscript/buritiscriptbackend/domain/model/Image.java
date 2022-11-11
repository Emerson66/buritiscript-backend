package br.com.buritiscript.buritiscriptbackend.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "image_table")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Image {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @NotBlank
    private String nameImage;
    @NotBlank
    private String linkImage;

    @OneToOne
    private User user;
    @OneToOne
    private Post post;

}
