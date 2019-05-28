/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao2;

/**
 *
 * @author ifnmg
 */
public class Professor_Integral extends Professor{
    private double Salario_Professor_Integral;
    
    public double getSalario_Professor_Integral(){
        return this.Salario_Professor_Integral;
    }
    
    public void setSalario_Professor_Integral(double s){
        this.Salario_Professor_Integral = s;
    }
    
    public Professor_Integral(String n, int i, int m, double s){
        super(n, i, m);
        this.setSalario_Professor_Integral(s);
    }
    
 
}
