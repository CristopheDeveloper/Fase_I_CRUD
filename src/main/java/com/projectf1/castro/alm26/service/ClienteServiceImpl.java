package com.projectf1.castro.alm26.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectf1.castro.alm26.model.entity.Cliente;
import com.projectf1.castro.alm26.model.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService{
    
    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente guardar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }


    @Override
    public List<Cliente> guardarTodos(List<Cliente> clientes) {
       return clienteRepository.saveAll(clientes);
    }


    @Override
    public Optional<Cliente> obtenerPorId(Long id) {
        return clienteRepository.findById(id);
    }

    @Override
    public List<Cliente> obtenerTodos() {
        return clienteRepository.findAll();
    }

    @Override
    public void eliminar(Long id) {
        clienteRepository.deleteById(id);
    }

    @Override
    public Cliente actualizar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

}
