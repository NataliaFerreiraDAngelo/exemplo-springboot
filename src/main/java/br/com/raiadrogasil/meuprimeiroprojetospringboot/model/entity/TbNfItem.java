package br.com.raiadrogasil.meuprimeiroprojetospringboot.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

@Entity
@Data
public class TbNfItem implements Serializable {

    @Id
    @Column(name = "NR_NF_ITEM")
    private BigInteger nrNfItem;

    @Column(name = "ID_NF")
    private BigInteger idNf;

    @Column(name = "QT_ITEM")
    private Integer qtItem;

    @ManyToOne
    @JoinColumn(name = "CD_PRODUTO")
    private TbProduto cdProduto;

    @Column(name = "VL_UNITARIO")
    private BigDecimal vlUnitario;

    @Column(name = "VL_TOTAL_ITEM")
    private BigDecimal vlTotalItem;
}
