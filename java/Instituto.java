package java;
import java.util.Objects;

public class Instituto extends InstitucionEducacion{
    private String Tipo;
    private CCCarreras carreras;


    public Instituto() {
        this.Tipo = "";
        this.carreras = new CCCarreras();
    }

    public Instituto(String Tipo, CCCarreras carreras) {
        this.Tipo = Tipo;
        this.carreras = carreras;
    }

    public String getTipo() {return this.Tipo;}
    public void setTipo(String Tipo) {this.Tipo = Tipo;}
    public CCCarreras getCarreras() {return this.carreras;}
    public void setCarreras(CCCarreras carreras) {this.carreras = carreras;}


    public void mostrar(){
        System.out.println(super.toString()+" "+this.toString());
        carreras.mostrar();
    } 

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Instituto)) {
            return false;
        }
        Instituto instituto = (Instituto) o;
        return Objects.equals(Tipo, instituto.Tipo) && Objects.equals(carreras, instituto.carreras);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Tipo, carreras);
    }

    @Override
    public String toString() {
        return "{" +
            " Tipo='" + getTipo() + "'" +
            "}";
    }
    
    
}
