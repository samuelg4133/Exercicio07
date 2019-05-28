/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao1;

/**
 *
 * @author ifnmg
 */
public class Empregado extends pessoa{
       private String CodigoSetor;
    private double SalarioBase;
    private double Imposto;
    
    public String getCodigoSetor_Empregado(){
        return this.CodigoSetor;
    }
    
    public double getSalarioBase_Empregado(){
        return this.SalarioBase;
    }
    
    public double getImposto_Empregado(){
        return this.Imposto;
    }
    
    public void setCodigoSetor_Empregado(String c){
        this.CodigoSetor = c;
    }
    
    public void setSalarioBase_Empregado(double b){
        this.SalarioBase = b;
    }
    
    public void setImposto_Empregado(double i){
        this.Imposto = i;
    }
    
    public double CalcularSalario(double s){
        s = this.getSalarioBase_Empregado() - (this.getSalarioBase_Empregado() / 100 * this.getImposto_Empregado());
        return s;
    }
    
    public Empregado(String n, String e, String t, String c, double b, double i){
        super(n, e, t);
        this.setCodigoSetor_Empregado(c);
        this.setSalarioBase_Empregado(b);
        this.setImposto_Empregado(i);
    }
}
