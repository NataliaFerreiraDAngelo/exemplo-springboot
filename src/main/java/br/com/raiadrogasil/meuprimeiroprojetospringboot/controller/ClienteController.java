package br.com.raiadrogasil.meuprimeiroprojetospringboot.controller;

import br.com.raiadrogasil.meuprimeiroprojetospringboot.model.dto.ClienteDTO;
import br.com.raiadrogasil.meuprimeiroprojetospringboot.model.entity.TbCliente;
import br.com.raiadrogasil.meuprimeiroprojetospringboot.repository.ClienteRepository;
import br.com.raiadrogasil.meuprimeiroprojetospringboot.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;

@RestController
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/cliente")
    public ResponseEntity listar(){

        List<TbCliente> clientes = clienteService.listarClientes();

        if(clientes.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(clientes);
        }else{
            return ResponseEntity.status(HttpStatus.OK).body(clientes);
        }
    }

    @GetMapping("/cliente/{id}")
    public ResponseEntity buscarPorId(@PathVariable("id") Long id){
        Optional<TbCliente> cliente = clienteService.buscarPorId(id);

        if(cliente.isPresent())
            return ResponseEntity.ok().body(cliente.get());
        else
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Cliente não encontrado");
    }

    @GetMapping("/cliente/filtro")
    public ResponseEntity buscarPorParametro(@PathParam("nome") String nome){

        List<TbCliente> clientes = clienteService.buscarPorNome(nome);

        return ResponseEntity.ok().body(clientes);
    }

    @PostMapping("/cliente")
    public ResponseEntity salvar(@RequestBody ClienteDTO cliente){

        if(cliente.getNome() == null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Campo nome é Obrigatório");
        }
        if(cliente.getDtNascto() == null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Campo nome é Obrigatório");
        }

        if(cliente.getNrRg() == null || cliente.getNrRg().isEmpty()){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Campo nrRg é Obrigatório");
        }

        TbCliente clienteEntity = clienteService.salvar(cliente);

        return ResponseEntity.status(HttpStatus.CREATED).body("Cliente salvo com sucesso: " + clienteEntity);
    }

    @PutMapping("/cliente/{id}")
    public ResponseEntity atualizar(@RequestBody ClienteDTO cliente, @PathVariable("id") Long id){
        Boolean retorno = clienteService.atualizar(cliente, id);

        if(retorno)
            return ResponseEntity.status(HttpStatus.OK).body("Cliente atualizado com sucesso");

        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Cliente não encontrado");
    }

    @DeleteMapping("/cliente/{id}")
    public ResponseEntity excluir(@PathVariable("id") Long id){
        Boolean retorno = clienteService.excluir(id);
        if(retorno)
            return ResponseEntity.status(HttpStatus.OK).body("Cliente excluido com sucesso");

        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Cliente não encontrado");
    }
}
