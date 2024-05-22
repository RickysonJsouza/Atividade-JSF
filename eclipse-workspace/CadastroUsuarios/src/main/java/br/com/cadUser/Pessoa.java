package br.com.cadUser;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import java.util.ArrayList;
import java.util.List;

@Named
@RequestScoped
public class Pessoa {
    private String nome;
    private List<String> nomes = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getNomes() {
        return nomes;
    }

    public void adicionarNome() {
        if (nome != null && !nome.trim().isEmpty()) {
            nomes.add(nome);
            nome = "";
        }
    }
}
