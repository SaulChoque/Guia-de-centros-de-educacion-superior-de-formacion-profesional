package java;
import java.util.Objects;

public class NodoFacultad {
    private Facultad facultad;
    private NodoFacultad sig,ant;


    public NodoFacultad() {
        this.sig = null;
        this.ant = null;
    }

    public Facultad getFacultad() {
        return this.facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

    public NodoFacultad getSig() {
        return this.sig;
    }

    public void setSig(NodoFacultad sig) {
        this.sig = sig;
    }

    public NodoFacultad getAnt() {
        return this.ant;
    }

    public void setAnt(NodoFacultad ant) {
        this.ant = ant;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof NodoFacultad)) {
            return false;
        }
        NodoFacultad nodoFacultad = (NodoFacultad) o;
        return Objects.equals(facultad, nodoFacultad.facultad) && Objects.equals(sig, nodoFacultad.sig) && Objects.equals(ant, nodoFacultad.ant);
    }


}
