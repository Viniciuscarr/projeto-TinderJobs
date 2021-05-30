package com.tinderjobs.tinderjobs.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "servico")
public class service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String tipoServico;
    private String descricao;
    private String formaCobranca;
    private String valorServico;
    public service(int id, String tipoServico, String descricao, String formaCobranca, String valorServico) {
        this.id = id;
        this.tipoServico = tipoServico;
        this.descricao = descricao;
        this.formaCobranca = formaCobranca;
        this.valorServico = valorServico;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTipoServico() {
        return tipoServico;
    }
    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getFormaCobranca() {
        return formaCobranca;
    }
    public void setFormaCobranca(String formaCobranca) {
        this.formaCobranca = formaCobranca;
    }
    public String getValorServico() {
        return valorServico;
    }
    public void setValorServico(String valorServico) {
        this.valorServico = valorServico;
    }

    
}
