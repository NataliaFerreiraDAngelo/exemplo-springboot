package br.com.raiadrogasil.meuprimeiroprojetospringboot.service;

import br.com.raiadrogasil.meuprimeiroprojetospringboot.model.entity.TbNf;
import br.com.raiadrogasil.meuprimeiroprojetospringboot.repository.NotaFiscalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.websocket.server.PathParam;
import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@Service
public class NotaFiscalService {

    @Autowired
    private NotaFiscalRepository notaFiscalRepository;

    public List<TbNf> listarNfs(){
        return notaFiscalRepository.findAll();
    }

    public Optional<TbNf> buscarNfPorId(@PathParam("id") Long id){
        return notaFiscalRepository.findById(id);
    }
}
