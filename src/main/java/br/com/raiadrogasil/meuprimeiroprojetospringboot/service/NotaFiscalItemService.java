package br.com.raiadrogasil.meuprimeiroprojetospringboot.service;

import br.com.raiadrogasil.meuprimeiroprojetospringboot.model.entity.TbNfItem;
import br.com.raiadrogasil.meuprimeiroprojetospringboot.repository.NotaFiscalItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotaFiscalItemService {

    @Autowired
    private NotaFiscalItemRepository notaFiscalItemRepository;

    public List<TbNfItem> listarItems(){
        return notaFiscalItemRepository.findAll();
    }

}
