
package model.bean;

public class GruposMusculares {
    
    private int IdGrupos;
    private String Desc;

    public GruposMusculares() {
    }

    public GruposMusculares(String Desc) {
        this.Desc = Desc;
    }
  
    public int getIdGrupos() {
        return IdGrupos;
    }
 
    public void setIdGrupos(int IdGrupos) {
        this.IdGrupos = IdGrupos;
    }
 
    public String getDesc() {
        return Desc;
    }

    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    @Override
    public String toString() {
        return getDesc(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
