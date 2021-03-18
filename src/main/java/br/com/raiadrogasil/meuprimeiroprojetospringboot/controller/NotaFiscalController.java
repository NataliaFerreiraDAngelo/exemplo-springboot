package br.com.raiadrogasil.meuprimeiroprojetospringboot.controller;

import br.com.raiadrogasil.meuprimeiroprojetospringboot.model.entity.TbNf;
import br.com.raiadrogasil.meuprimeiroprojetospringboot.service.NotaFiscalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@RestController
public class NotaFiscalController {

    @Autowired
    private NotaFiscalService notaFiscalService;

    @GetMapping("/nota-fiscal")
    public ResponseEntity listarNf(){

        List<TbNf> notasFiscais = notaFiscalService.listarNfs();

        if(notasFiscais.isEmpty()){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(notasFiscais);
        }
        return ResponseEntity.status(HttpStatus.OK).body(notasFiscais);
    }

    @GetMapping("/nota-fiscal/{id}")
    public ResponseEntity buscarNfPorId(@PathVariable("id") Long id){

        Optional<TbNf> notaFiscal = notaFiscalService.buscarNfPorId(id);

        if (notaFiscal.isPresent()) {
            return ResponseEntity.status(HttpStatus.OK).body(notaFiscal);
        }
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(notaFiscal);

    }
}
