package CodigoJava;

import java.util.*;


public class Facultad {
    private string nombre;
    private Queue<Integer> carreras;


    public Facultad() {
        carreras=new LinkedList<Integer>();
    }
    
    public Facultad(string nombre, Queue<Integer> carreras) {
        this.nombre = nombre;
        this.carreras = carreras;
    }
    
    public bool addCarrera(CCCarreras a, string x){
        bool sw=false;
        Integer n=a.nroelem();
        for (Integer i=0; i<n; i++) {
            Carrera cx=a.eliminar();
            if(cx.getNombre().equals(x) && !sw){
                carreras.add(cx.getIdCarrera());
                sw=true;
            }
            a.adicionar(cx);
        }
        return sw;
    }
    
    public void mostrarCarreras(CCCarreras a){
        Iterator<Integer> r=carreras.iterator();
        Integer i=1;
        while(r.hasNext()){
            Integer cx=r.next();
            Console.WriteLine("\t"+i+")\t"+buscarCarreraID(a, cx));
            i++;
        }
    }

    private Carrera buscarCarreraID(CCCarreras a, Integer id){
        Integer n=a.nroelem();
        Carrera rs=new Carrera();
        for (Integer i = 0; i<n; i++) {
            Carrera cx=a.eliminar();
            if(cx.getIdCarrera()==id){
                rs=cx;
            }
            a.adicionar(cx);
        }
        return rs;
    }
    /*
     
    public void leer(){
        Console.WriteLine("\n- Lectura Carrera: ");
        Console.Write("\t>> Inserte nombre => ");
        this.nombre=Leer.Cadena;
        Console.Write("\t>> Inserte año plan de estudios => ");
        this.planEstudios=Leer.Integereger;
        Console.Write("\t>> Inserte idCarrera => ");
        this.idCarrera=Leer.Integereger;
    } 
    */
    public void leer(CCCarreras carreras){
        Console.WriteLine("\n- Lectura Facultad: ");
        Console.Write("\t>> Inserte nombre => ");
        this.nombre=Leer.Cadena;
        char condition=' ';
        Console.WriteLine("-Adicion carreras (!!! recuerde que la carrera a añador tiene que\nhaber sido adicionada previamente en el apartado de lectura carreras !!!)");
		do {
            Console.Write("\t\t>> Inserte nombre de la carrera a adicionar => ");
            string nomcarr=Leer.Cadena;
            addCarrera(carreras, nomcarr);
			Console.WriteLine(">>>>>> Desea seguir a d i c i o n a n d o Carreras? (s/n) => ");
			string g =Leer.Cadena;
			condition= g.charAt(0);
		} while (condition=='s');
        
        
    } 

    public string getNombre() {return this.nombre;}
    public void setNombre(string nombre) {this.nombre = nombre;}
    public Queue<Integer> getCarreras() {return this.carreras;}
    public void setCarreras(Queue<Integer> carreras) {this.carreras = carreras;}
    
    
    public bool equals(Object o) {
        if (o == this)
        return true;
        if (!(o instanceof Facultad)) {
            return false;
        }
        Facultad facultad = (Facultad) o;
        return Objects.equals(nombre, facultad.nombre) && Objects.equals(carreras, facultad.carreras);
    }
    
    
    //@Override
    public string tostring() {
        return "{" +
        " nombre='" + getNombre() + "'" +
        "}";
    }
    
}
