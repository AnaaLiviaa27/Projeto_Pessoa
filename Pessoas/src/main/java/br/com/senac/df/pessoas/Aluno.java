/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.df.pessoas;

/**
 *
 * @author ana62216106
 */
public class Aluno extends Pessoa {
    private double nota;
    private double media;
    
     public double getNota(){
        return this.nota;
    }    
    public void setNota(double nota){
        this.nota = nota;
    }
    
     public double getMedia(){
        return this.media;
    }    
    public void setMedia(double media){
        this.media = media;
    }
    
    public Aluno(double nota,double media,String nome,int telefone,String endereço ){
        super(nome,telefone,endereço);
        this.nota = nota;
        this.media = media;
}
    
}

