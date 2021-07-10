package com.dio.sistemadecontrole.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Getter                 //já faz os getters da classe
@Setter                 //já faz os setters da classe
@AllArgsConstructor     //gera o construtor da classe
@NoArgsConstructor      //gera construtor sem argmentos
@EqualsAndHashCode      //cria o equals(Object o) e o hasCode()
@Builder                //serve para pegar elementos dto de outras classes e selecionar/pegar elas sem instanciar classe
@Entity
public class Localidade {
    @Id
    private long id;
    @ManyToOne                          //varias localidades pertencem a um nivel de acesso (pois estamos dentro da classe localidade)
    private NivelAcesso nivelAcesso;
    private String descricao;
}
