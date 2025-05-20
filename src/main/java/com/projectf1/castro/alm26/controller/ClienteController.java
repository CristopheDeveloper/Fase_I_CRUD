package com.projectf1.castro.alm26.controller;

import com.projectf1.castro.alm26.model.entity.Cliente;
import com.projectf1.castro.alm26.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public Cliente crear(@RequestBody Cliente cliente) {
        return clienteService.guardar(cliente);
    }
    @PostMapping
    public List<Cliente> crearVarios(@RequestBody List<Cliente> clientes) {
      return clienteService.guardarTodos(clientes);
    }
    

    @GetMapping
    public List<Cliente> listar() {
        return clienteService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Optional<Cliente> obtenerPorId(@PathVariable Long id) {
        return clienteService.obtenerPorId(id);
    }

    @PutMapping
    public Cliente actualizar(@RequestBody Cliente cliente) {
        return clienteService.actualizar(cliente);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        clienteService.eliminar(id);
    }
}
