package com.projectf1.castro.alm26.model.entity;

import jakarta.persistence.Column;
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
   
    @Column(nullable = false)
    private String username;
     @Column(nullable = false)
    private String password;
     @Column(nullable = false)
    private String correo;
     @Column(nullable = false)
    private String rol; // me baso en que tipo sera el usuario como administrador o cliente o proveedor 
     @Column(nullable = false)  
    private boolean activo;
}
