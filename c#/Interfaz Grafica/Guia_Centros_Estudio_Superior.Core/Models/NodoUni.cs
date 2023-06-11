using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;


using System.IO;
namespace Guia_Centros_Estudio_Superior.Core.Models;
[Serializable]

public class NodoUni
{
    private Universidad universidad;
    private NodoUni sig, ant;

    public Universidad Universidad
    {
        get => universidad;
        set => universidad = value;
    }
    public NodoUni Sig
    {
        get => sig;
        set => sig = value;
    }
    public NodoUni Ant
    {
        get => ant;
        set => ant = value;
    }

    public NodoUni() {
        this.Sig = null;
        this.Ant = null;
    }

    public NodoUni(Universidad universidad) {
        this.Universidad = universidad;
    }
    
    public Universidad getUniversidad() {return this.Universidad;}
    public void setUniversidad(Universidad universidad) {this.Universidad = universidad;}
    public NodoUni getSig() {return this.Sig;}
    public void setSig(NodoUni sig) {this.Sig = sig;}
    public NodoUni getAnt() {return this.Ant;}
    public void setAnt(NodoUni ant) {this.Ant = ant;}



}
