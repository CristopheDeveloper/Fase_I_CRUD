package com.projectf1.castro.alm26.service;

import java.util.List;
import java.util.Optional;

import com.projectf1.castro.alm26.model.entity.Producto;


public interface ProductoService {

    Producto guardar(Producto producto);
    List<Producto>guardarTodo(List<Producto> productos);
    Optional<Producto> obtenerPorId(Long id);
    List<Producto> obtenerTodos();
    void eliminar(Long id);
    Producto actualizar(Producto producto);
    

}
