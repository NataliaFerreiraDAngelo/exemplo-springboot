package br.com.raiadrogasil.meuprimeiroprojetospringboot.service;

import br.com.raiadrogasil.meuprimeiroprojetospringboot.model.entity.TbProduto;
import br.com.raiadrogasil.meuprimeiroprojetospringboot.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<TbProduto> listarProdutos(){
        return produtoRepository.findAll();
    }

    public List<TbProduto> buscarProdutoPorNome(String nome){
        return produtoRepository.findByDsProdutoContaining(nome);
    }

}
