
package model.bean;

import java.sql.Date;


public class Avaliação {
    
    private int idAvaliacao;
    private Date data;
    private double peso;
    private double altura;
    private double gorduraCorporal;
    
    public Avaliação(){
        
    }

    public Avaliação(Date data, double peso, double altura, double gorduraCorporal) {
        this.data = data;
        this.peso = peso;
        this.altura = altura;
        this.gorduraCorporal = gorduraCorporal;
    }
    

    public int getIdAvaliacao() {
        return idAvaliacao;
    }

    public void setIdAvaliacao(int idAvaliacao) {
        this.idAvaliacao = idAvaliacao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double getGorduraCorporal() {
        return gorduraCorporal;
    }


    public void setGorduraCorporal(double gorduraCorporal) {
        this.gorduraCorporal = gorduraCorporal;
    }

    
}
