package com.dio.sistemadecontrole.model;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter     //já faz os getters da classe
@Setter     //já faz os setters da classe
@AllArgsConstructor     //gera o construtor da classe
@NoArgsConstructor      //gera construtor sem argmentos
@EqualsAndHashCode      //cria o equals(Object o) e o hasCode()
@Builder    //serve para pegar elementos dto de outras classes e selecionar/pegar elas sem instanciar classe
@Entity
public class Movimentacao {

    @AllArgsConstructor     //gera o construtor da classe
    @NoArgsConstructor      //gera construtor sem argmentos
    @EqualsAndHashCode
    @Embeddable             //recebe atributação do id composto da declaração
    public class MovimentacaoId implements Serializable {
        private long idMovimento;
        private long idUsuario;

    }

    @Id
    @EmbeddedId         //referencia como id composto a classe MovimentacaoId
    private MovimentacaoId id;
    private LocalDateTime dataEntrada;
    private LocalDateTime dataSaida;
    private BigDecimal periodo;
    @ManyToOne
    private Ocorrencia ocorrencia;
    @ManyToOne
    private Calendario calendario;
}
