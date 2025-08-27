package com.example.API.MODELO.MIERCOLES.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "TatianaRu8bio")
public class TatianaRubio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "direcion", length = 80)
    private String direccion;

    @Column(name = "hincha")
    private  Boolean esHinchaVerdolaga;

    public TatianaRubio() {
    }

    public TatianaRubio(Integer id, String direccion, Boolean esHinchaVerdolaga) {
        this.id = id;
        this.direccion = direccion;
        this.esHinchaVerdolaga = esHinchaVerdolaga;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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
