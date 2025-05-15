package com.projectf1.castro.alm26.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectf1.castro.alm26.model.entity.Usuario;
import com.projectf1.castro.alm26.model.repository.UsuarioRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImp implements UsuarioService {

    
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario guardar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Optional<Usuario> obtenerPorId(Long id) {
        return usuarioRepository.findById(id);
    }

    @Override
    public List<Usuario> obtenerTodos() {
        return usuarioRepository.findAll();
    }

    @Override
    public void eliminar(Long id) {
        usuarioRepository.deleteById(id);
    }

    @Override
    public Usuario actualizar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Optional<Usuario> buscarPorUsername(String username) {
        return Optional.ofNullable(usuarioRepository.findByUsername(username));
    }

}
