/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.juan.objetos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SATC
 */
public class Aluno {

    private String nome;
    private int matricula;
    private List<Nota> notas;

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = new ArrayList<>();
    }

    public float calcularMedia() {
        float media = 0;
        return media;
  

    }

    @Override
    public String toString() {
        
       
        for (Nota nota : notas) {
        
        String notas = "";
            notas+= nota.getNota();
        }
            
            
 
        
        return "Aluno: " + nome + "\n Matricula:" + matricula+"\n " + notas;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }

}
