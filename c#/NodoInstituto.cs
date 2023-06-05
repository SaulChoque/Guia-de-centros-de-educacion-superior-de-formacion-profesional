using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;


using System.IO;
namespace c_;
[Serializable]

public class NodoInstituto
{
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



}
