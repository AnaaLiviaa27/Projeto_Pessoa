/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.df.pessoas;

/**
 *
 * @author ana62216106
 */
public class Pessoa {
    private String nome;
    private int telefone;
    private String endereço;
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
          this.nome = nome;
}
    
    public int getTelefone(){
        return this.telefone;
    }
    
     public void setTelefone(int telefone){
          this.telefone = telefone;
}
    public String getEndereço(){
        return this.endereço;
    }
    
    public void setEndereço(String endereço){
          this.endereço = endereço;
}
    public Pessoa(String nome,int telefone,String endereço){
        this.nome = nome;
        this.telefone = telefone;
        this.endereço = endereço;
 }       
    public void apresentar(){}
    
    
}

