using System;
using System.Collections;
using System.Linq;
using System.Threading.Tasks;


using System.IO;
namespace c_;
[Serializable]

public class CarreraMencion: Carrera
{
    private Stack<string> menciones;

    public CarreraMencion() {
        menciones=new Stack<string>();
    }

    public CarreraMencion(string nombre, int planEstudios, int idCarrera, Stack<string> menciones): base(nombre, planEstudios, idCarrera) {
        this.menciones = menciones;
    }
    
    public Stack<string> getA() {return this.menciones;}
    public void setA(Stack<string> menciones) {this.menciones = menciones;}

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
            menciones.Append(men);
			Console.WriteLine(">>>>>> Desea seguir añadiendo menciones? (s/n) => ");
    	}while(Console.ReadKey().KeyChar=='s');
    } 

    public void mostrarMenciones(){
        IEnumerator<string> r=menciones.GetEnumerator();
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
