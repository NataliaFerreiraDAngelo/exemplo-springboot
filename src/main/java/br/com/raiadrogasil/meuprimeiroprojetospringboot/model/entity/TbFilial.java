package br.com.raiadrogasil.meuprimeiroprojetospringboot.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class TbFilial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cdFilial;

    private String nmRazao;

    private String nmFantasia;

    private Integer flBalanco;

    private Integer flFaturamento;

    private Integer flCaminhaoExtra;

    private Integer flPdvNovo;

    private Integer flEtiquetaSemPreco;

    private Integer flContribuinteSt;

    private Integer flEstacionamento;

    @Column(name = "FL_24H")
    private Integer flVinteEQuatrohrs;

    private Integer flFarmaciaPopular;
}
