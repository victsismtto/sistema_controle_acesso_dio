package com.dio.sistemadecontrole.model;

import lombok.*;
import org.hibernate.envers.Audited;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter     //já faz os getters da classe
@Setter     //já faz os setters da classe
@AllArgsConstructor     //gera o construtor da classe
@NoArgsConstructor      //gera construtor sem argmentos
@EqualsAndHashCode      //cria o equals(Object o) e o hasCode()
@Builder    //serve para pegar elementos dto de outras classes e selecionar/pegar elas sem instanciar classe
@Entity
@Audited
public class JornadaTrabalho {
    @Id
    @GeneratedValue
    private long id;
    private String descricao;


}
