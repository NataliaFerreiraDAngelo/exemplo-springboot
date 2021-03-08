package br.com.raiadrogasil.meuprimeiroprojetospringboot.controller;

import br.com.raiadrogasil.meuprimeiroprojetospringboot.model.dto.Cliente;
import br.com.raiadrogasil.meuprimeiroprojetospringboot.model.entity.TbCliente;
import br.com.raiadrogasil.meuprimeiroprojetospringboot.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping("/cliente")
    public ResponseEntity listar(){
        List<TbCliente> clientes = clienteRepository.findAll();

        if(clientes.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(clientes);
        }else{
            return ResponseEntity.status(HttpStatus.OK).body(clientes);
        }
    }

    @GetMapping("/cliente/{id}")
    public ResponseEntity buscarPorId(@PathVariable("id") Long id){
       Optional<TbCliente> cliente = clienteRepository.findById(id);
        if(cliente.isPresent())
            return ResponseEntity.ok().body(cliente.get());
        else
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Cliente não encontrado");
    }

    @GetMapping("/cliente/filtro")
    public ResponseEntity buscarPorParametro(@PathParam("nome") String nome){

        System.out.println(nome);

        Cliente cliente = new Cliente();
        cliente.setNome("Jonathan");
        cliente.setIdade(22);

        return ResponseEntity.ok().body(cliente);
    }

    @PostMapping("/cliente")
    public ResponseEntity salvar(@RequestBody Cliente cliente){
        System.out.println(cliente.getNome());
        System.out.println(cliente.getIdade());
        //TODO salvar registro

        return ResponseEntity.status(HttpStatus.CREATED).body("Cliente salvo com sucesso");
    }

    @PutMapping("/cliente")
    public ResponseEntity atualizar(@RequestBody Cliente cliente){
        System.out.println(cliente.getNome());
        System.out.println(cliente.getIdade());
        //TODO atualizar registro

        return ResponseEntity.status(HttpStatus.OK).body("Cliente atualizado com sucesso");

    }

    @DeleteMapping("/cliente/{id}")
    public ResponseEntity excluir(@PathVariable("id") Integer id){
        //TODO excluir cliente por id

        return ResponseEntity.status(HttpStatus.OK).body("Cliente excluido com sucesso");
    }
}
