package com.examen2.examen2.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="cuota")
public class Cuota {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="codigocuota")
    private int codigoCuota;

    private int mes;

    @ManyToOne
    @JoinColumn(name="codigoPrestamo", referencedColumnName = "codigoPrestamo")
    @JsonIgnore
    private Prestamo codigoPrestamo;

    private double interes;

    private double capital;

    private double decimal;

}
