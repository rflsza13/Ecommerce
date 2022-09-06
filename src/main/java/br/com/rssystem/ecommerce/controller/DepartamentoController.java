package br.com.rssystem.ecommerce.controller;

import br.com.rssystem.ecommerce.dao.DepartamentoDAO;
import br.com.rssystem.ecommerce.model.Departamento;
import br.com.rssystem.ecommerce.service.IDepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

@RestController
public class DepartamentoController {

    @Autowired
    private IDepartamentoService service;

    @GetMapping("/departamentos")
    public ArrayList<Departamento> recuperarTodos(){
        return service.buscarTodos();
    }

    @PostMapping("/departamentos")
    public ResponseEntity<Departamento> incluirNovo (@RequestBody Departamento novo){
        Departamento res = service.criarNovo(novo);
        if (res != null){
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.badRequest().build();
    }

    @PutMapping("/departamentos")
    public ResponseEntity<Departamento> alterar(@RequestBody Departamento dados){
        Departamento res = service.atualizarDados(dados);
        if (dados != null){
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.badRequest().build();
    }

    @DeleteMapping("/departamentos/{id}")
    public ResponseEntity<Departamento> excluirDepartamento (@PathVariable Integer id){
        service.excluirDepartamento(id);
        return ResponseEntity.ok(null);
    }

    @GetMapping("/departamentos/{id}")
    public ResponseEntity<Departamento> buscarPeloId(@PathVariable Integer id){
        Departamento res = service.buscarPeloId(id);
        if(res != null){
            System.out.println(res.getCodigo() + " - " + res.getNome() + " - " + res.getDescricao());
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.notFound().build();
    }
}
