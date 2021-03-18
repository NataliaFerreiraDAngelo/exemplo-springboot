package br.com.raiadrogasil.meuprimeiroprojetospringboot.model.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class TbProduto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cdProduto;

    private String cdClasFiscal;

    private Integer cdComercializacao;

    private Integer cdClassifProd;

    private Integer cdGrficha;

    private Integer cdGrcompras;

    private Integer cdGrupo;

    private String dsProduto;

    private Integer flCuponavel;

    private Integer cdCategoria;

    private Integer cdSubgrupo;

    private Integer cdCategoriaMaster;

    private Integer cdSubCategoria;

    private Integer flDeletado;

    private Integer flTransmitido;

    private Integer flCadastroGenerico;

    private Integer flCadastroProvisorio;

    private Integer flLoteFaturamento;

    private Integer flPsicoBalancoContrEsp;

    private Integer flDesativacaoPsico;

    private Integer flEspacoBeleza;
}
