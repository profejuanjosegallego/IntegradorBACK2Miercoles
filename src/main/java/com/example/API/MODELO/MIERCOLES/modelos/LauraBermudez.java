package com.example.API.MODELO.MIERCOLES.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "LauraBermudez")
public class LauraBermudez {

    // attributes

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "adress", length = 80)
    private String adress;

    @Column(name = "isHincha")
    private Boolean isVerdolaga;

    // constructors

    public LauraBermudez() {
    }

    public LauraBermudez(String adress, Boolean isVerdolaga, Integer id) {
        this.adress = adress;
        this.isVerdolaga = isVerdolaga;
        this.id = id;
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
}
