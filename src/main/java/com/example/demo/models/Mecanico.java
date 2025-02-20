package com.example.demo.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "mecanicos")
public class Mecanico {
    @Id
    @Column(nullable = false, length = 100)
    private Long docuento;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(nullable = false, length = 100)
    private String profesion;

    public Long getDocuento() {
        return docuento;
    }

    public void setDocuento(Long docuento) {
        this.docuento = docuento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
}
