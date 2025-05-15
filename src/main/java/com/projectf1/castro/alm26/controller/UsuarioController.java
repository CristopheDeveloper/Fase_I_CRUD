package com.projectf1.castro.alm26.controller;

import com.projectf1.castro.alm26.model.entity.Usuario;
import com.projectf1.castro.alm26.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public Usuario crear(@RequestBody Usuario usuario) {
        return usuarioService.guardar(usuario);
    }

    @GetMapping
    public List<Usuario> listar() {
        return usuarioService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Optional<Usuario> obtenerPorId(@PathVariable Long id) {
        return usuarioService.obtenerPorId(id);
    }

    @GetMapping("/buscar/{username}")
    public Optional<Usuario> buscarPorUsername(@PathVariable String username) {
        return usuarioService.buscarPorUsername(username);
    }

    @PutMapping
    public Usuario actualizar(@RequestBody Usuario usuario) {
        return usuarioService.actualizar(usuario);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        usuarioService.eliminar(id);
    }
}

