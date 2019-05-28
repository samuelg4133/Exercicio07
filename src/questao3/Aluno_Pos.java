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
public class Aluno_Pos extends Aluno {
  
    
    private String disciplina_PosGraduacao;
    
    public String getDisciplina_PosGraduacao() {
        return this.disciplina_PosGraduacao;
    }

    public void setDisciplina_PosGraduacao(String p) {
        this.disciplina_PosGraduacao = p;
    }
    
    private Aluno_Pos(int m, String n, int i, String p){
        super(m, n, i);
        this.setDisciplina_PosGraduacao(p);
    }
    
}

