
package model.bean;

public class Exercicios {
    
    private int idExercicios;
    private String desc;
    private GruposMusculares idGruposMusculares;

    public Exercicios() {
    }

    public Exercicios(String desc, GruposMusculares idGruposMusculares) {
        
        this.desc = desc;
        this.idGruposMusculares = idGruposMusculares;
    }

    public int getIdExercicios() {
        return idExercicios;
    }

    public void setIdExercicios(int idExercicios) {
        this.idExercicios = idExercicios;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public GruposMusculares getIdGruposMusculares() {
        return idGruposMusculares;
    }

    public void setIdGruposMusculares(GruposMusculares idGruposMusculares) {
        this.idGruposMusculares = idGruposMusculares;
    }
    
}
