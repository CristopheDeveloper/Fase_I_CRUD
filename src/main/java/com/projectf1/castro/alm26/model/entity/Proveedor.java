package com.projectf1.castro.alm26.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
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
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_Proveedores")
    @SequenceGenerator(name = "sequence_Proveedores", sequenceName = "sequence_Proveedores", allocationSize = 1)
    private Long id;

    private String nombreEmpresa;
    private String nombreContacto;
    private String correo;
    private String telefono;
    private String direccion;
}
