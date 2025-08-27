package com.example.API.MODELO.MIERCOLES.modelos;

import jakarta.persistence.*;

@Entity
@Table (name = "JuanRendon")

public class JuanRendon {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)



    private  Integer id;

    @Column (name =  "direccion", length = 80)
    private String direccion;

    @Column(name = "hincha")
    private Boolean esHinchaverdo;



    public JuanRendon(Integer id, String direccion, Boolean esHinchaverdo) {
        this.id = id;
        this.direccion = direccion;
        this.esHinchaverdo = esHinchaverdo;
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

    public Boolean getEsHinchaverdo() {
        return esHinchaverdo;
    }

    public void setEsHinchaverdo(Boolean esHinchaverdo) {
        this.esHinchaverdo = esHinchaverdo;
    }
}
