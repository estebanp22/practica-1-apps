package com.example.demo.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "vehiculos")
public class Vehiculo {

    @Id
    @Column(nullable = false, length = 6)
    private String placa;

    @Column(nullable = false, length = 100)
    private String nombrePropietario;

    @Column(unique = true, nullable = false, length = 50)
    private String telefono;


    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}