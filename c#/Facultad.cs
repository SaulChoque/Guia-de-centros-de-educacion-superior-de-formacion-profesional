using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using System.IO;

namespace c_;
[Serializable]

public class Facultad
{
    private string nombre;
    private Queue<int> carreras;


    public Facultad() {
        this.nombre = "";
        carreras=new Queue<int>();
    }
    
    public Facultad(string nombre, Queue<int> carreras) {
        this.nombre = nombre;
        this.carreras = carreras;
    }
    
    public bool addCarrera(CCCarreras a, string x){
        bool sw=false;
        int n=a.nroelem();
        for (int i=0; i<n; i++) {
            Carrera cx=a.eliminar();
            if(cx.getNombre()==(x) && !sw){
                carreras.Append(cx.getIdCarrera());
                sw=true;
            }
            a.adicionar(cx);
        }
        return sw;
    }
    
    public void mostrarCarreras(CCCarreras a){

        IEnumerator<int> r=carreras.GetEnumerator();
        int i=1;
        while(r.MoveNext()){
            int cx=r.Current;
            Console.WriteLine("\t"+i+")\t"+buscarCarreraID(a, cx));
            i++;
        }
    }

    private Carrera buscarCarreraID(CCCarreras a, int id){
        int n=a.nroelem();
        Carrera rs=new Carrera();
        for (int i = 0; i<n; i++) {
            Carrera cx=a.eliminar();
            if(cx.getIdCarrera()==id){
                rs=cx;
            }
            a.adicionar(cx);
        }
        return rs;
    }
    /*
     
    public new void leer(){
        Console.WriteLine("\n- Lectura Carrera: ");
        Console.Write("\t>> Inserte nombre => ");
        this.nombre=Leer.Cadena;
        Console.Write("\t>> Inserte año plan de estudios => ");
        this.planEstudios=Leer.Integer;
        Console.Write("\t>> Inserte idCarrera => ");
        this.idCarrera=Leer.Integer;
    } 
    */
    public void leer(CCCarreras carreras){
        Console.WriteLine("\n- Lectura Facultad: ");
        Console.Write("\t>> Inserte nombre => ");
        this.nombre=Leer.Cadena;
        Console.WriteLine("-Adicion carreras (!!! recuerde que la carrera a añador tiene que\nhaber sido adicionada previamente en el apartado de lectura carreras !!!)");
		do {
            Console.Write("\t\t>> Inserte nombre de la carrera a adicionar => ");
            string nomcarr=Leer.Cadena;
            addCarrera(carreras, nomcarr);
			Console.WriteLine(">>>>>> Desea seguir a d i c i o n a n d o Carreras? (s/n) => ");
		}while(Console.ReadKey().KeyChar=='s');
        
        
    } 

    public string getNombre() {return this.nombre;}
    public void setNombre(string nombre) {this.nombre = nombre;}
    public Queue<int> getCarreras() {return this.carreras;}
    public void setCarreras(Queue<int> carreras) {this.carreras = carreras;}
    
    
    //@Override
    public override string ToString() {
        return "{" +
        " nombre='" + getNombre() + "'" +
        "}";
    }
    
}
