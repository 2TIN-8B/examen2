package com.examen2.examen2.modelos;

import java.sql.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="prestamo")
public class Prestamo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="codigoprestamo")
    private int codigoPrestamo;

    @Column(name="fechaApertura")
    private Date fechaApertura;

    private double monto;

    // private double cuota;

    private int plazo;

    @ManyToOne
    @JoinColumn(name="dni", referencedColumnName = "dni")
    @JsonIgnore
    private Cliente cliente;

    @OneToMany(mappedBy = "prestamo", cascade = CascadeType.ALL)
    private List<Cuota>cuota;

}
