package com.projectf1.castro.alm26.controller;

import com.projectf1.castro.alm26.model.entity.Proveedor;
import com.projectf1.castro.alm26.service.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/proveedores")
public class ProveedorController {

    @Autowired
    private ProveedorService proveedorService;

    @PostMapping
    public Proveedor crear(@RequestBody Proveedor proveedor) {
        return proveedorService.guardar(proveedor);
    }

    @GetMapping
    public List<Proveedor> listar() {
        return proveedorService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Optional<Proveedor> obtenerPorId(@PathVariable Long id) {
        return proveedorService.obtenerPorId(id);
    }

    @PutMapping
    public Proveedor actualizar(@RequestBody Proveedor proveedor) {
        return proveedorService.actualizar(proveedor);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        proveedorService.eliminar(id);
    }
}
