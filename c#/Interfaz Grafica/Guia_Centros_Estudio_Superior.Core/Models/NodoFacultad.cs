using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;


using System.IO;
namespace Guia_Centros_Estudio_Superior.Core.Models;
[Serializable]

public class NodoFacultad
{
    private Facultad facultad;
    private NodoFacultad sig,ant;

    public Facultad Facultad
    {
        get => facultad;
        set => facultad = value;
    }
    public NodoFacultad Sig
    {
        get => sig;
        set => sig = value;
    }
    public NodoFacultad Ant
    {
        get => ant;
        set => ant = value;
    }

    public NodoFacultad() {
        this.Sig = null;
        this.Ant = null;
    }

    public Facultad getFacultad() {
        return this.Facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.Facultad = facultad;
    }

    public NodoFacultad getSig() {
        return this.Sig;
    }

    public void setSig(NodoFacultad sig) {
        this.Sig = sig;
    }

    public NodoFacultad getAnt() {
        return this.Ant;
    }

    public void setAnt(NodoFacultad ant) {
        this.Ant = ant;
    }





}
