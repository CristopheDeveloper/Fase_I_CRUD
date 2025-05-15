package com.projectf1.castro.alm26.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectf1.castro.alm26.model.entity.Producto;
import com.projectf1.castro.alm26.model.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService{

    
    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public Producto guardar(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Optional<Producto> obtenerPorId(Long id) {
        return productoRepository.findById(id);
    }

    @Override
    public List<Producto> obtenerTodos() {
        return productoRepository.findAll();
    }

    @Override
    public void eliminar(Long id) {
        productoRepository.deleteById(id);
    }

    @Override
    public Producto actualizar(Producto producto) {
        return productoRepository.save(producto);
    }

}
