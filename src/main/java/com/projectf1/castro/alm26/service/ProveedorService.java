package com.projectf1.castro.alm26.service;

import java.util.List;
import java.util.Optional;

import com.projectf1.castro.alm26.model.entity.Proveedor;

public interface ProveedorService {

    Proveedor guardar(Proveedor proveedor);
    Optional<Proveedor> obtenerPorId(Long id);
    List<Proveedor> obtenerTodos();
    void eliminar(Long id);
    Proveedor actualizar(Proveedor proveedor);

}
