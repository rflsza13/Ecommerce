package br.com.rssystem.ecommerce.model;

import javax.persistence.*;

@Entity
@Table(name = "departamento")
public class Departamento {
    @Column(name = "numero")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;

    @Column(name = "nome", length = 30, nullable = false)
    private String nome;

    @Column(name = "descricao", length = 30, nullable = true)
    private String descricao;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
