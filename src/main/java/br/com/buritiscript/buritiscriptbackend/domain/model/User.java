package br.com.buritiscript.buritiscriptbackend.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "user_table")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String username;
    @NotBlank
    private String password;
    @NotBlank
    private String name;
    private String about;
    private char sexo;
    @Email
    @NotBlank
    private String email;
    private String website;

    
    public User(@NotBlank String username, @NotBlank String password, @NotBlank String name, String about, char sexo,
            @Email @NotBlank String email, String website, String github, String telegram, String twitter,
            String instagram, String linkedin) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.about = about;
        this.sexo = sexo;
        this.email = email;
        this.website = website;
        this.github = github;
        this.telegram = telegram;
        this.twitter = twitter;
        this.instagram = instagram;
        this.linkedin = linkedin;
    }
    private String github;
    private String telegram;
    private String twitter;
    private String instagram;
    private String linkedin;
    
    
}
