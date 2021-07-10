package com.dio.sistemadecontrole.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter     //já faz os getters da classe
@Setter     //já faz os setters da classe
@AllArgsConstructor     //gera o construtor da classe
@NoArgsConstructor      //gera construtor sem argmentos
@EqualsAndHashCode      //cria o equals(Object o) e o hasCode()
@Builder    //serve para pegar elementos dto de outras classes e selecionar/pegar elas sem instanciar classe
@Entity     //geracao das tabelas junto com as relacoes de dependencias @Id e @ManytoOne e etc...
@Audited
public class Usuario {
    @Id
    private long id;
    private String nome;
    @ManyToOne                                       //varios usuarios podem ser uma categoria (pois estamos dentro da classe usuario, ele vem primeiro)
    private CategoriaUsuario categoriaUsuario;
    @ManyToOne                                       //varios usuarios podem estar em uma mesma empresa e não o contrário
    private Empresa empresa;
    @ManyToOne                                      //varios usuarios podem ter a mesma jornada de trabalho e não um usuario ter varias joarnadas de trabalho
    private JornadaTrabalho jornadaTrabalho;
    @ManyToOne
    private NivelAcesso nivelAcesso;
    private BigDecimal tolerancia;
    private LocalDateTime inicioJornada;
    private LocalDateTime finalJornada;

}
