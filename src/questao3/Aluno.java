/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao3;

/**
 *
 * @author ifnmg
 */
public class Aluno {
    
    private int Matricula_Aluno;
    private String Nome_Aluno;
    private int Idade_Aluno;
    
    public int getMatricula_Aluno(){
        return this.Matricula_Aluno;
    }
    
    public String getNome_Aluno(){
        return this.Nome_Aluno;
    }
    
    public int getIdade_Aluno(){
        return this.Idade_Aluno;
    }
    
    public void setMatricula_Aluno(int m){
        this.Matricula_Aluno = m;
    }
    
    public void setNome_Aluno(String n){
        this.Nome_Aluno = n;
    }
    
    public void setIdade_Aluno(int i){
        this.Idade_Aluno = i;
    }
    
    public Aluno(int m, String n, int i){
        this.setMatricula_Aluno(m);
        this.setNome_Aluno(n);
        this.setIdade_Aluno(i);
    }
    
}