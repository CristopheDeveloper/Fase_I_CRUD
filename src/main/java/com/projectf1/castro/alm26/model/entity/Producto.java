package com.projectf1.castro.alm26.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_Productos") 
    @SequenceGenerator(name = "sequence_Productos", sequenceName = "sequence_Productos", allocationSize = 1)
    private Long id ;

    private String nombre;
    private String descripcion;
    private double precio;
    private int stock;
    private String categoria;
    private String codigoBarras;

    @ManyToOne
    private Proveedor proveedor;



}
