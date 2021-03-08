package br.com.raiadrogasil.meuprimeiroprojetospringboot.service;

import br.com.raiadrogasil.meuprimeiroprojetospringboot.model.dto.ClienteDTO;
import br.com.raiadrogasil.meuprimeiroprojetospringboot.model.entity.TbCliente;
import br.com.raiadrogasil.meuprimeiroprojetospringboot.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<TbCliente> listarClientes(){
        return clienteRepository.findAll();
    }

    public Optional<TbCliente> buscarPorId(Long id){
        return clienteRepository.findById(id);
    }

    public List<TbCliente> buscarPorNome(String nome){
        return clienteRepository.findByNmClienteContaining(nome);
    }

    public TbCliente salvar(ClienteDTO cliente){
        TbCliente clienteEntity = new TbCliente();
        clienteEntity.setNmCliente(cliente.getNome());
        clienteEntity.setDtNascto(cliente.getDtNascto());
        clienteEntity.setNrRg(cliente.getNrRg());
        clienteEntity.setCdEmpresa(0);
        clienteEntity.setCdGrupoCliente(1);
        clienteEntity.setCdCliente(49830453L);

        return clienteRepository.save(clienteEntity);
    }

    public Boolean atualizar(ClienteDTO cliente, Long id){
        Optional<TbCliente> clienteOptional = clienteRepository.findById(id);
        if(clienteOptional.isPresent()){
            TbCliente clienteEntity = clienteOptional.get();
            clienteEntity.setNmCliente(cliente.getNome());
            clienteEntity.setDtNascto(cliente.getDtNascto());
            clienteEntity.setNrRg(cliente.getNrRg());

            clienteRepository.save(clienteEntity);

            return true;
        }

        return false;
    }

    public Boolean excluir(Long id){
        Optional<TbCliente> clienteOptional = clienteRepository.findById(id);
        if(clienteOptional.isPresent()) {
            clienteRepository.deleteById(id);
            return true;
        }

        return false;
    }
}
