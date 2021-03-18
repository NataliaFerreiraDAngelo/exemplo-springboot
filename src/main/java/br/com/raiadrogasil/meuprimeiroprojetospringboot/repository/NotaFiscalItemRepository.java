package br.com.raiadrogasil.meuprimeiroprojetospringboot.repository;

import br.com.raiadrogasil.meuprimeiroprojetospringboot.model.entity.TbNfItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface NotaFiscalItemRepository extends JpaRepository<TbNfItem, BigInteger> {
}
