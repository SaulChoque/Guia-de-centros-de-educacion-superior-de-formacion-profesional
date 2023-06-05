package CodigoJava;
import java.util.Iterator;
import java.util.Objects;
import java.util.Stack;

public class CarreraMencion extends Carrera{
    private Stack<string> menciones;


    public CarreraMencion() {
        menciones=new Stack<string>();
    }

    public CarreraMencion(string nombre, int planEstudios, int idCarrera, Stack<string> menciones) {
        base(nombre, planEstudios, idCarrera);
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
        char condition=' ';
		do {
            Console.Write("\t>> Inserte mencion => ");
            string men=Leer.Cadena;
            menciones.add(men);
			Console.WriteLine(">>>>>> Desea seguir añadiendo menciones? (s/n) => ");
			string g =Leer.Cadena;
			condition= g.charAt(0);
		} while (condition=='s');
        
        
    } 

    public void mostrarMenciones(){
        Iterator<string> r=menciones.iterator();
        while(r.hasNext()){
            Console.WriteLine("\t-"+r.next());
        }
    } 

    //@Override
    public bool equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CarreraMencion)) {
            return false;
        }
        CarreraMencion carreraMencion = (CarreraMencion) o;
        return Objects.equals(menciones, carreraMencion.menciones);
    }




}
