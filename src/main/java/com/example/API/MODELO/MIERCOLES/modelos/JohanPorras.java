package com.example.API.MODELO.MIERCOLES.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "JohanPorras")
public class JohanPorras {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "direccion", length = 80)
    private String direccion;

    @Column(name = "hincha")
    private Boolean esHinchaVerdolaga;

    public JohanPorras() {
    }

    public JohanPorras(Integer id, String direccion, Boolean esHinchaVerdolaga) {
        this.id = id;
        this.direccion = direccion;
        this.esHinchaVerdolaga = esHinchaVerdolaga;
    }
    
}
