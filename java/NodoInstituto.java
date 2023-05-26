package java;
import java.util.Objects;

public class NodoInstituto {
    private Instituto instituto;
    private NodoInstituto sig,ant;


    public NodoInstituto() {
        this.sig = null;
        this.ant = null;
    }

    public NodoInstituto(Instituto instituto) {
        this.instituto = instituto;
    }

    public Instituto getInstituto() {return this.instituto;}
    public void setInstituto(Instituto instituto) {this.instituto = instituto;}
    public NodoInstituto getSig() {return this.sig;}
    public void setSig(NodoInstituto sig) {this.sig = sig;}
    public NodoInstituto getAnt() {return this.ant;}
    public void setAnt(NodoInstituto ant) {this.ant = ant;}

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof NodoInstituto)) {
            return false;
        }
        NodoInstituto nodoInstituto = (NodoInstituto) o;
        return Objects.equals(instituto, nodoInstituto.instituto) && Objects.equals(sig, nodoInstituto.sig) && Objects.equals(ant, nodoInstituto.ant);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instituto, sig, ant);
    }

    
}
