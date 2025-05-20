package com.projectf1.castro.alm26.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "proveedores")
public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_proveedores")
    @SequenceGenerator(name = "sequence_proveedores", sequenceName = "sequence_proveedores", allocationSize = 1)
    private Long id;

     @Column(nullable = false)
    private String nombreEmpresa;
     @Column(nullable = false)
    private String nombreContacto;
     @Column(nullable = false)
    private String correo;
     @Column(nullable = false)
    private String telefono;
     @Column(nullable = false)
    private String direccion;
}
