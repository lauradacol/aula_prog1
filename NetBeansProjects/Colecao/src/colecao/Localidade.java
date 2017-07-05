/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecao;

import java.util.ArrayList;

/**
 *
 * @author laura
 */

import java.util.ArrayList;

public class Localidade {
    private String uf;
    private String municipio;
    private String localidade;
    ArrayList<Individuo> individuos;    
        
    public Localidade(String uf, String municipio, String localidade){
       this.uf = uf;
       this.municipio = municipio;
       this.localidade = localidade;                
       individuos = new ArrayList<Individuo>(); 
    }
    
    public String getUf() {
        return this.uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getMunicipio() {
        return this.municipio;
    }
   
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getLocalidade() {
        return this.localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }
    
    public String toString(){
	return this.uf + this.municipio + this.localidade;
    } 
    
}