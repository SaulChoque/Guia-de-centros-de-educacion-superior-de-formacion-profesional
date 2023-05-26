package java;
import java.util.Objects;

public class NodoUni {
    private Universidad universidad;
    private NodoUni sig, ant;


    public NodoUni() {
        this.sig = null;
        this.ant = null;
    }

    public NodoUni(Universidad universidad) {
        this.universidad = universidad;
    }
    
    public Universidad getUniversidad() {return this.universidad;}
    public void setUniversidad(Universidad universidad) {this.universidad = universidad;}
    public NodoUni getSig() {return this.sig;}
    public void setSig(NodoUni sig) {this.sig = sig;}
    public NodoUni getAnt() {return this.ant;}
    public void setAnt(NodoUni ant) {this.ant = ant;}


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof NodoUni)) {
            return false;
        }
        NodoUni nodoUni = (NodoUni) o;
        return Objects.equals(universidad, nodoUni.universidad) && Objects.equals(sig, nodoUni.sig) && Objects.equals(ant, nodoUni.ant);
    }

    @Override
    public int hashCode() {
        return Objects.hash(universidad, sig, ant);
    }




    
}
