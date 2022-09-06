package br.com.rssystem.ecommerce.service;

import br.com.rssystem.ecommerce.model.Departamento;

import java.util.ArrayList;

public interface IDepartamentoService {
    public Departamento criarNovo (Departamento novo);
    public Departamento atualizarDados (Departamento dados);
    public ArrayList<Departamento> buscarTodos();
    public Departamento buscarPeloId(Integer id);
    public void excluirDepartamento(Integer id);
}
