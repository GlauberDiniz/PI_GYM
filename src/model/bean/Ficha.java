
package model.bean;


public class Ficha {
    
    private int IdFicha;
    private Exercicios IdExercicios;
    private double carga;
    private int repeticao;
    private int serie;

    public Ficha() {
    }

    public Ficha(int IdFicha, Exercicios IdExercicios, double carga, int repeticao, int serie) {
        this.IdFicha = IdFicha;
        this.IdExercicios = IdExercicios;
        this.carga = carga;
        this.repeticao = repeticao;
        this.serie = serie;
    }


    public int getIdFicha() {
        return IdFicha;
    }

    public void setIdFicha(int IdFicha) {
        this.IdFicha = IdFicha;
    }

    public Exercicios getIdExercicios() {
        return IdExercicios;
    }

    public void setIdExercicios(Exercicios IdExercicios) {
        this.IdExercicios = IdExercicios;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public int getRepeticao() {
        return repeticao;
    }

    public void setRepeticao(int repeticao) {
        this.repeticao = repeticao;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }
    
    
    
}
