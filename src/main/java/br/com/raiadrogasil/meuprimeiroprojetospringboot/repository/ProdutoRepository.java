package br.com.raiadrogasil.meuprimeiroprojetospringboot.repository;

import br.com.raiadrogasil.meuprimeiroprojetospringboot.model.entity.TbProduto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<TbProduto, Integer> {

    List<TbProduto> findByDsProdutoContaining(String nome);

}
