package com.projectf1.castro.alm26.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projectf1.castro.alm26.model.entity.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository <Cliente,Long>{

}
