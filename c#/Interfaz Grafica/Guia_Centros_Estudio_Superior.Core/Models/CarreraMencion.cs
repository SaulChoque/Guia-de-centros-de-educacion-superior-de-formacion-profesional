using System;
using System.Collections;
using System.Linq;
using System.Threading.Tasks;


using System.IO;
namespace Guia_Centros_Estudio_Superior.Core.Models;
[Serializable]

public class CarreraMencion: Carrera
{
    private Stack<string> menciones;

    public Stack<string> Menciones
    {
        get => menciones;
        set => menciones = value;
    }

    public CarreraMencion() {
        Menciones=new Stack<string>();
    }

    public CarreraMencion(string nombre, int planEstudios, int idCarrera, Stack<string> menciones): base(nombre, planEstudios, idCarrera) {
        this.Menciones = menciones;
    }
    
    public Stack<string> getA() {return this.Menciones;}
    public void setA(Stack<string> menciones) {this.Menciones = menciones;}

    public CarreraMencion a(Stack<string> a) {
        setA(a);
        return this;
    }
    public new void leer(){
        base.leer();
        Console.WriteLine("- Lectura Menciones");
		do {
            Console.Write("\t>> Inserte mencion => ");
            string men=Leer.Cadena;
            Menciones.Append(men);
			Console.WriteLine(">>>>>> Desea seguir añadiendo menciones? (s/n) => ");
    	}while(Console.ReadKey().KeyChar=='s');
    } 

    public void mostrarMenciones(){
        IEnumerator<string> r=Menciones.GetEnumerator();
        while(r.MoveNext()){
            Console.WriteLine("\t-"+r.Current);
        }
    } 

    //@Override
    /*
    public bool equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CarreraMencion)) {
            return false;
        }
        CarreraMencion carreraMencion = (CarreraMencion) o;
        return Objects.equals(menciones, carreraMencion.menciones);
    }
    */

        
}
