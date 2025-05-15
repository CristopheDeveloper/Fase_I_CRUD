package com.projectf1.castro.alm26.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectf1.castro.alm26.model.entity.Producto;

public interface ProductoRepository extends JpaRepository <Producto,Long> {

}
