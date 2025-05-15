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
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_Usuarios")
    @SequenceGenerator(name = "sequence_Usuarios", sequenceName = "sequence_Usuarios", allocationSize = 1)
    private Long id;

    private String username;
    private String password;
    private String correo;
    private String rol;   // me baso en que tipo sera el usuario como administrador o cliente o proveedor 
    private boolean activo;
}
