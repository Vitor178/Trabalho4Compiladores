package br.ufscar.dc.compiladores.trabalho4compiladores;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TabelaDeSimbolos {
    public enum Tipo {
        IDENTIFICADOR,
        PERGUNTA,
        OPCAO,
        INVALIDO
    }
    
    class EntradaTabelaDeSimbolos {
        String nome;
        Tipo tipo;

        private EntradaTabelaDeSimbolos(String nome, Tipo tipo) {
            this.nome = nome;
            this.tipo = tipo;
        }
    }
    
    private final Map<String, EntradaTabelaDeSimbolos> tabela;
    
    public TabelaDeSimbolos() {
        this.tabela = new HashMap<>();
    }
    
    public void adicionar(String nome, Tipo tipo) {
        tabela.put(nome, new EntradaTabelaDeSimbolos(nome, tipo));
    }
    
    public boolean existe(String nome) {
        return tabela.containsKey(nome);
    }
    
    public Tipo verificar(String nome) {
        return tabela.get(nome).tipo;
    }
    
    public ArrayList<String> returnStartEqual(String nome){
       ArrayList<String> lista = new ArrayList<>();
        for(String i : tabela.keySet()){
            if(i.startsWith(nome + ".")){
                //System.out.println(i);
                lista.add(i);
            } else if(i.startsWith(nome + "[")){
                lista.add(i);
            }
        }
        return lista;
    }
}