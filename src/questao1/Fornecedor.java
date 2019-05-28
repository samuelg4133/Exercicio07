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
public class Fornecedor extends pessoa{
    private double valorCredito;
    private double valorDebito;
    
     public double getCredito(){
    return this.valorCredito;
    }
    
      public double getDebito(){
    return this.valorDebito;
    }
      
       
       public void setCredito(double c){
       this.valorCredito=c;

       }
       
        public void setDebito(double d){
       this.valorDebito=d;

       }
        
        public Fornecedor(String n, String e, String t, double c, double d){
       super(n,e,t);
       this.setCredito(c);
       this.setDebito(d);
       
        }
}
