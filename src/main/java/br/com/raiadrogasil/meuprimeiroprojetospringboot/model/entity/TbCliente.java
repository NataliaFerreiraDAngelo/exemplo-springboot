package br.com.raiadrogasil.meuprimeiroprojetospringboot.model.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class TbCliente {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(sequenceName = "SQ_ID_CLIENTE", name = "SEQUENCE_ID_CLIENTE")
    private Long idCliente;

    @Column(name = "NM_CLIENTE")
    private String nmCliente;

    private Date dtNascto;

    private Integer cdEmpresa;

    private Integer cdGrupoCliente;

    private String nrRg;

    private Long cdCliente;

}
