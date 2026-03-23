package com.gerenciamento.clientes.services;


import com.gerenciamento.clientes.models.ClienteModel;
import com.gerenciamento.clientes.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<ClienteModel> findAll(){
        return clienteRepository.findAll();
    }

    public Optional<ClienteModel> findById(Long id){
        return clienteRepository.findById(id);
    }

    public void delete(Long id){
        clienteRepository.deleteById(id);
    }

    public ClienteModel save(ClienteModel clienteModel){
        return clienteRepository.save(clienteModel);
    }
}
