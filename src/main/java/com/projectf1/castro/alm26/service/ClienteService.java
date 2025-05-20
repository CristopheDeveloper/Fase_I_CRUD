package com.projectf1.castro.alm26.service;

import java.util.List;
import java.util.Optional;


import com.projectf1.castro.alm26.model.entity.Cliente;

public interface ClienteService {

    Cliente guardar(Cliente cliente);
    List<Cliente> guardarTodos(List<Cliente> cliente);
    Optional<Cliente> obtenerPorId(Long id);
    List<Cliente> obtenerTodos();
    void eliminar(Long id);
    Cliente actualizar(Cliente cliente);
    

}
