package com.example.API.MODELO.MIERCOLES.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "JeronimoSuarez")
public class JeronimoSuarez {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = id)
    private Integer id;

    private  String direccion;

    private String Celular;

    private String Cedula;
    private  Boolean eshinchadelverdeono;

    public JeronimoSuarez() {
    }

    public JeronimoSuarez(Integer id, String direccion, String celular, String cedula, Boolean eshinchadelverdeono) {
        this.id = id;
        this.direccion = direccion;
        Celular = celular;
        Cedula = cedula;
        this.eshinchadelverdeono = eshinchadelverdeono;
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

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String celular) {
        Celular = celular;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String cedula) {
        Cedula = cedula;
    }

    public Boolean getEshinchadelverdeono() {
        return eshinchadelverdeono;
    }

    public void setEshinchadelverdeono(Boolean eshinchadelverdeono) {
        this.eshinchadelverdeono = eshinchadelverdeono;
    }
}
