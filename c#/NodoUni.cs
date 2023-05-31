using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace c_;

public class NodoUni
{
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



}
