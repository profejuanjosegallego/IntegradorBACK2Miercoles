package com.example.API.MODELO.MIERCOLES.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "LauraBermudez")
public class LauraBermudez {

    // attributes

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "fullName")
    private String fullName;

    @Column(name = "adress", length = 80)
    private String adress;

    @Column(name = "isHincha")
    private Boolean isVerdolaga;

    @Column(name = "favoriteAnimal")
    private String favoriteAnimal;

    @Column(name = "birthday")
    private LocalDate birthday;

    // constructors

    public LauraBermudez() {
    }

    public LauraBermudez(String adress, Boolean isVerdolaga, Integer id, String fullName, String favoriteAnimal, LocalDate birthday) {
        this.adress = adress;
        this.isVerdolaga = isVerdolaga;
        this.id = id;
        this.fullName = fullName;
        this.favoriteAnimal = favoriteAnimal;
        this.birthday = birthday;
    }

    // getters

    public String getAdress() {
        return adress;
    }

    public Boolean getVerdolaga() {
        return isVerdolaga;
    }

    public Integer getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getFavoriteAnimal() {
        return favoriteAnimal;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    // setters

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setVerdolaga(Boolean verdolaga) {
        isVerdolaga = verdolaga;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setFavoriteAnimal(String favoriteAnimal) {
        this.favoriteAnimal = favoriteAnimal;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
