package br.com.raiadrogasil.meuprimeiroprojetospringboot.controller;

import br.com.raiadrogasil.meuprimeiroprojetospringboot.model.entity.TbProduto;
import br.com.raiadrogasil.meuprimeiroprojetospringboot.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/produto")
    public ResponseEntity listarProdutos(){

        List<TbProduto> produtos = produtoService.listarProdutos();

        if(produtos.isEmpty()){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(produtos);
        }
        return ResponseEntity.status(HttpStatus.OK).body(produtos);

    }

    @GetMapping("produto/filtro")
    public ResponseEntity buscarProdutoPorNome(@PathParam("nome") String nome){

        List<TbProduto> produto = produtoService.buscarProdutoPorNome(nome);

        return ResponseEntity.status(HttpStatus.OK).body(produto);

    }

}
