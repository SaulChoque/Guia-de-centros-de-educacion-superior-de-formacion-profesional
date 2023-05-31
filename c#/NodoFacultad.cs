using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace c_;

public class NodoFacultad
{
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





}
