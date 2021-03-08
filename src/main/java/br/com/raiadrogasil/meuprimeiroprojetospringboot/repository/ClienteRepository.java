package br.com.raiadrogasil.meuprimeiroprojetospringboot.repository;

import br.com.raiadrogasil.meuprimeiroprojetospringboot.model.entity.TbCliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClienteRepository extends JpaRepository<TbCliente, Long> {

    List<TbCliente> findByNmClienteContaining(String nome);
}
