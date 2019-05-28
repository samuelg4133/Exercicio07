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
public class Professor_Horrista extends Professor{
    
    private double SalarioBase_Professor_Horista;
    private int HorasAula;
    
    public double getSalarioBase_Professor_Integral(){
        return this.SalarioBase_Professor_Horista;
    }
    
    public int getHorasAula(){
        return this.HorasAula;
    }
    
    public void setSalarioBase_Professor_Integral(double b){
        this.SalarioBase_Professor_Horista = b;
    }
    
    public void setHorasAula(int h){
        this.HorasAula = h;
    }
    
    public double SalarioProfessor_Horista(double s){
        s = this.getHorasAula() * this.getSalarioBase_Professor_Integral();
        return s;
    }
    
    public Professor_Horrista(String n, int i, int m, int h,double b){
        super(n, i, m);
        this.setHorasAula(h);
        this.setSalarioBase_Professor_Integral(b);
    }
    
}
