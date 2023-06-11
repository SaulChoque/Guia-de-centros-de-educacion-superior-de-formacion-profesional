using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using System.IO;

namespace Guia_Centros_Estudio_Superior.Core.Models;
[Serializable]

public class Carrera
{

    private string nombre;
    private int idCarrera;
    private int planEstudios;

    public string Nombre
    {
        get => nombre;
        set => nombre = value;
    }
    public int PlanEstudios
    {
        get => planEstudios;
        set => planEstudios = value;
    }
    public int IdCarrera
    {
        get => idCarrera;
        set => idCarrera = value;
    }

    public Carrera() {
        this.Nombre = "";
        this.PlanEstudios = 0;
        this.IdCarrera = 0;
    }

    public Carrera(string nombre, int planEstudios, int idCarrera) {
        this.Nombre = nombre;
        this.PlanEstudios = planEstudios;
        this.IdCarrera = idCarrera;
    }


    public void leer(){
    
        Console.WriteLine("\n- Lectura Carrera: ");
        Console.Write("\t>> Inserte nombre => ");
        this.Nombre=Leer.Cadena;
        Console.Write("\t>> Inserte año plan de estudios => ");
        this.PlanEstudios=Leer.Integer;
        Console.Write("\t>> Inserte idCarrera => ");
        this.IdCarrera=Leer.Integer;
    } 

    

    public string getNombre() {return this.Nombre;}
    public void setNombre(string nombre) {this.Nombre = nombre;}
    public int getPlanEstudios() {return this.PlanEstudios;}
    public void setPlanEstudios(int planEstudios) {this.PlanEstudios = planEstudios;}
    public int getIdCarrera() {return this.IdCarrera;}
    public void setIdCarrera(int idCarrera) {this.IdCarrera = idCarrera;}

    //@Override
    /*
    public bool equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Carrera)) {
            return false;
        }
        Carrera carrera = (Carrera) o;
        return Objects.equals(nombre, carrera.nombre) && planEstudios == carrera.planEstudios && idCarrera == carrera.idCarrera;
    }

    //@Override
    public int hashCode() {
        return Objects.hash(nombre, planEstudios, idCarrera);
    }
    */

    //@Override
    public override string ToString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", planEstudios='" + getPlanEstudios() + "'" +
            ", idCarrera='" + getIdCarrera() + "'" +
            "}";
    }



        
}
