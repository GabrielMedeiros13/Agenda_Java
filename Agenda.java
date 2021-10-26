/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo;

/**
 *
 * @author Gabriel Medeiros
 */
public class Agenda {
    private String nome;
    private String telefone;
    private String detalhes;
    
    public Agenda(){
       
    }
    
    public Agenda(String nome, String telefone, String detalhes){
        this.nome = nome;
        this.telefone = telefone;
        this.detalhes = detalhes;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getTelefone(){
        return telefone;
    }
    
    public String getDetalhes(){
        return detalhes;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public void setDetalhes(String detalhes){
        this.detalhes = detalhes;
    }
    
   
}
