package com.example.demo.models;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "servicios")
public class Servicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private Date fecha;

    @Column(nullable = false, length = 100)
    private String descripcion;

    @OneToOne
    @JoinColumn(name = "mecanico_id")
    private Mecanico mecanico;

    @OneToOne
    @JoinColumn(name = "vehiculo_id")
    private Vehiculo vehiculo;



}