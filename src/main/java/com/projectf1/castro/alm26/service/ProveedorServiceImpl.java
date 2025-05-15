package com.projectf1.castro.alm26.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectf1.castro.alm26.model.entity.Proveedor;
import com.projectf1.castro.alm26.model.repository.ProveedorRepository;


@Service
public class ProveedorServiceImpl implements ProveedorService{

    
    @Autowired
    private ProveedorRepository proveedorRepository;

    @Override
    public Proveedor guardar(Proveedor proveedor) {
        return proveedorRepository.save(proveedor);
    }

    @Override
    public Optional<Proveedor> obtenerPorId(Long id) {
        return proveedorRepository.findById(id);
    }

    @Override
    public List<Proveedor> obtenerTodos() {
        return proveedorRepository.findAll();
    }

    @Override
    public void eliminar(Long id) {
        proveedorRepository.deleteById(id);
    }

    @Override
    public Proveedor actualizar(Proveedor proveedor) {
        return proveedorRepository.save(proveedor);
    }
}
