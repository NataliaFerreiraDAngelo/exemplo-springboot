package br.com.raiadrogasil.meuprimeiroprojetospringboot.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "TB_NF")
public class TbNf implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_NF")
    private Long idNF;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dtEmissao;

    private BigDecimal vlNf;

    @ManyToOne
    @JoinColumn(name = "ID_CLIENTE")
    private TbCliente cliente;

    @ManyToOne
    @JoinColumn(name = "CD_FILIAL")
    private TbFilial filial;

    @OneToMany
    @JoinColumn(name = "ID_NF")
    private List<TbNfItem> produtos;

}
