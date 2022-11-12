package br.com.buritiscript.buritiscriptbackend.controller.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import br.com.buritiscript.buritiscriptbackend.config.validation.annotation.UniqueValue;
import br.com.buritiscript.buritiscriptbackend.domain.model.User;
import lombok.Getter;

@Getter
public class UserForm {

    @UniqueValue(domainClass = User.class, fieldName = "username")
    private String username;
    private String password;
    private String name;
    private String about;
    private char sexo;
    private String email;
    private String website;
    private String github;
    private String telegram;
    private String twitter;
    private String instagram;
    private String linkedin;

    public UserForm(@Size(max = 15) String username, @Size(max = 25) String password,
    @Size(max = 40) String name, @Size(max = 500) String about, @Size(max = 1) char sexo,
    @Email @Size(max = 50) String email, @Size(max = 50) String website,
    @Size(max = 50) String github, @Size(max = 50) String telegram, @Size(max = 50) String twitter,
    @Size(max = 50) String instagram, @Size(max = 50) String linkedin) {
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

    public User userConverterToModel() {
        return new User(this.username, this.password, this.name, this.about, this.sexo, this.email,
        this.website, this.github, this.telegram, this.twitter, this.instagram, this.linkedin);
    }

}
