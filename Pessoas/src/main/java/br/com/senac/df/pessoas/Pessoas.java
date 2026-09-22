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
     
        Professor professor = new Professor(2.300,34567,"Luiz",89888900,"QN 410");
        
        professor.apresentar();
        
        Aluno aluno = new Aluno(10,9,"Tatia",9876545,"QS 310");
        
        aluno.apresentar();
        
        
    }
}
