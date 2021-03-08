package br.com.raiadrogasil.meuprimeiroprojetospringboot.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class TbCliente {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(sequenceName = "SQ_ID_CLIENTE", name = "SEQUENCE_ID_CLIENTE")
    private Long idCliente;

    @Column(name = "NM_CLIENTE")
    private String nmCliente;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dtNascto;

    private Integer cdEmpresa;

    private Integer cdGrupoCliente;

    private String nrRg;

    private Long cdCliente;


}
