package com.projectf1.castro.alm26.service;


import java.util.List;
import java.util.Optional;

import com.projectf1.castro.alm26.model.entity.Usuario;


public interface UsuarioService {

    Usuario guardar(Usuario usuario);
    Optional<Usuario> obtenerPorId(Long id);
    List<Usuario> obtenerTodos();
    void eliminar(Long id);
    Usuario actualizar(Usuario usuario);
    Optional<Usuario> buscarPorUsername(String username);

}
