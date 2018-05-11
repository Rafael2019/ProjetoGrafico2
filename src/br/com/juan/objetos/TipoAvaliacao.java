/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.juan.objetos;

/**
 *
 * @author SATC
 */
public enum TipoAvaliacao {
    
    PROVA("Avaliação individual"),
    TRABALHO("Trabalho"),
    SEMINARIO("Seminário");
    private String nomeAvaliacao;

    @Override
    public String toString() {
        return "TipoAvaliacao{" + "nome=" + nomeAvaliacao + '}';
    }
    
  
    public String getNome() {
        return nomeAvaliacao;
    }

    private TipoAvaliacao(String nome) {
        nomeAvaliacao = nome;
        
        
        
    }
    
  
    
    

  


    
}
