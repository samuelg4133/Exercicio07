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
public class pessoa {
    private String nome;
    private String endereco;
    private String telefone;
    
    public String getNome(){
    return this.nome;
    }
    
      public String getEndereco(){
    return this.endereco;
    }
      
       public String getTelefone(){
    return this.telefone;
    }
       
       public void setNome(String n){
       this.nome=n;

       }
       
        public void setEndereco(String e){
       this.endereco=e;

       }
        
         public void setTelefone(String t){
       this.telefone=t;

       }
         
         public pessoa(String n, String e, String t){
           this.setNome(n);
       this.setEndereco(e);
       this.setTelefone(t);
         }
        
}

