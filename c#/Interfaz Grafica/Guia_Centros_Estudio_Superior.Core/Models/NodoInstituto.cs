using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;


using System.IO;
namespace Guia_Centros_Estudio_Superior.Core.Models;
[Serializable]

public class NodoInstituto
{
    private Instituto instituto;
    private NodoInstituto sig,ant;

    public Instituto Instituto
    {
        get => instituto;
        set => instituto = value;
    }
    public NodoInstituto Sig
    {
        get => sig;
        set => sig = value;
    }
    public NodoInstituto Ant
    {
        get => ant;
        set => ant = value;
    }

    public NodoInstituto() {
        this.Sig = null;
        this.Ant = null;
    }

    public NodoInstituto(Instituto instituto) {
        this.Instituto = instituto;
    }

    public Instituto getInstituto() {return this.Instituto;}
    public void setInstituto(Instituto instituto) {this.Instituto = instituto;}
    public NodoInstituto getSig() {return this.Sig;}
    public void setSig(NodoInstituto sig) {this.Sig = sig;}
    public NodoInstituto getAnt() {return this.Ant;}
    public void setAnt(NodoInstituto ant) {this.Ant = ant;}



}
