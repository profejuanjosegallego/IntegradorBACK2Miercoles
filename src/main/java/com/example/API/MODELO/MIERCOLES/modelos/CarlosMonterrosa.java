package com.example.API.MODELO.MIERCOLES.modelos;

import jakarta.persistence.*;

public class CarlosMonterrosa {
    private Integer id;
    private String direccion;
    private Boolean esHinchaVerdolaga;

    @Entity
    @Table(name="CarlosMonterrosa")

    public CarlosMonterrosa() {
    }
    
    public Integer getId() {
        return id;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public void setId(Integer id) {
        this.id = id;
    }
    @Column(name="direccion", length = 80)
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Boolean getEsHinchaVerdolaga() {
        return esHinchaVerdolaga;
    }

    public void setEsHinchaVerdolaga(Boolean esHinchaVerdolaga) {
        this.esHinchaVerdolaga = esHinchaVerdolaga;
    }
}
