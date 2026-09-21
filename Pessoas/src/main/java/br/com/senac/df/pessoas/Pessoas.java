/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.senac.df.pessoas;

/**
 *
 * @author ana62216106
 */
public class Pessoas {

    public static void main(String[] args) {
        Professor professor = new Professor(12000.5,12345678,"Diego",98677435,"QN 210");
        
        professor.getNome();
        
        Aluno aluno = new Aluno(9.8,8,"Denise",98677234,"QS 215");
        
        aluno.getNome();
        
        
    }
}
