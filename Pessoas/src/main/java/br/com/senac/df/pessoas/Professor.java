/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.df.pessoas;

/**
 *
 * @author ana62216106
 */
public class Professor extends Pessoa {
    private double salario;
    private int ncontrato;
    
     public double getSalario(){
        return this.salario;
    }    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
     public int getNcontrato(){
        return this.ncontrato;
    }    
    public void setNcontrato(int ncontrato){
        this.ncontrato = ncontrato;
    }
    
    public Professor(double salario,int ncontrato,String nome,int telefone,String endereço ){
        super(nome,telefone,endereço);
        this.salario = salario;
        this.ncontrato = ncontrato;
        
    }
}

