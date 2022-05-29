package com.any.Any.Model;

import javax.persistence.*;

@Entity
@Table(name = "jobsInfo", schema = "public")
public class AddingQuestions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nick;
    private String password;
    private String country;
    private String language;
    private String age;

    public AddingQuestions() {}

    public AddingQuestions(String nick, String password, String country, String language, String age) {
        this.nick = nick;
        this.password = password;
        this.country = country;
        this.language = language;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}