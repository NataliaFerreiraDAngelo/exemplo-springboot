package br.com.raiadrogasil.meuprimeiroprojetospringboot.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.util.Date;

@Data
public class ClienteDTO {

    private String nome;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dtNascto;

    private String nrRg;

}
