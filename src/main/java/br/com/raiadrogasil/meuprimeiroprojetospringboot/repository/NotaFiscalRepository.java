package br.com.raiadrogasil.meuprimeiroprojetospringboot.repository;

import br.com.raiadrogasil.meuprimeiroprojetospringboot.model.entity.TbNf;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface NotaFiscalRepository extends JpaRepository<TbNf, Long> {
}
