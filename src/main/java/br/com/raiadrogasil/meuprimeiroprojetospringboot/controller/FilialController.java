package br.com.raiadrogasil.meuprimeiroprojetospringboot.controller;

import br.com.raiadrogasil.meuprimeiroprojetospringboot.model.entity.TbFilial;
import br.com.raiadrogasil.meuprimeiroprojetospringboot.service.FilialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class FilialController {

    @Autowired
    private FilialService filialService;

    @GetMapping("/filial")
    public ResponseEntity listarFiliais(){

        List<TbFilial> filiais = filialService.lisarFiliais();

        if(filiais.isEmpty()){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(filiais);
        }
        return ResponseEntity.status(HttpStatus.OK).body(filiais);
    }

    @GetMapping("/filial/filtro")
    public ResponseEntity buscarPorParametro(@PathParam("nome") String nome){

        List<TbFilial> filial = filialService.buscarFilialPorNome(nome);

        return ResponseEntity.status(HttpStatus.OK).body(filial);
    }

}
