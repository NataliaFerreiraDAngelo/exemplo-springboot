package br.com.raiadrogasil.meuprimeiroprojetospringboot.repository;

import br.com.raiadrogasil.meuprimeiroprojetospringboot.model.entity.TbFilial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FilialRepository extends JpaRepository<TbFilial, Integer> {

    List<TbFilial> findByNmFantasiaContaining(String nome);

}
