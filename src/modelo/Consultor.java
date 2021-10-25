/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author franc
 */
@Entity
@PrimaryKeyJoinColumn(name="id")
public class Consultor extends Pessoa implements Serializable {

    
    private Integer num_consultor;
    private String especializacao;
    
    @ManyToMany(mappedBy = "consultor")
    private List<Projeto> projetos;
    
    
    public Consultor() {
        super();
    }

    public Integer getNum_consultor() {
        return num_consultor;
    }

    public void setNum_consultor(Integer num_consultor) {
        this.num_consultor = num_consultor;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

}
