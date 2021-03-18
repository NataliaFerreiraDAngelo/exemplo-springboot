package br.com.raiadrogasil.meuprimeiroprojetospringboot.service;

import br.com.raiadrogasil.meuprimeiroprojetospringboot.model.entity.TbFilial;
import br.com.raiadrogasil.meuprimeiroprojetospringboot.repository.FilialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilialService {

    @Autowired
    private FilialRepository filialRepository;

    public List<TbFilial> lisarFiliais(){
        return filialRepository.findAll();
    }

    public List<TbFilial> buscarFilialPorNome(String nome){
        return filialRepository.findByNmFantasiaContaining(nome);
    }

}
