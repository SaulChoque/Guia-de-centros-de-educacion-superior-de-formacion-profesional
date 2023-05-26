package CodigoJava;
import java.util.Iterator;
import java.util.Objects;
import java.util.Stack;

public class CarreraMencion extends Carrera{
    private Stack<String> menciones;


    public CarreraMencion() {
    }

    public CarreraMencion(String nombre, int planEstudios, int idCarrera, Stack<String> menciones) {
        super(nombre, planEstudios, idCarrera);
        this.menciones = menciones;
    }
    
    public Stack<String> getA() {return this.menciones;}
    public void setA(Stack<String> menciones) {this.menciones = menciones;}

    public CarreraMencion a(Stack<String> a) {
        setA(a);
        return this;
    }
    public void leer(){
        super.leer();
        System.out.println("- Lectura Menciones");
        char condition=' ';
		do {
            System.out.print("\t>> Inserte mencion => ");
            String men=Leer.dato();
            menciones.add(men);
			System.out.println(">>>>>> Desea seguir añadiendo menciones? (s/n) => ");
			String g =Leer.dato();
			condition= g.charAt(0);
		} while (condition=='s');
        
        
    } 

    public void mostrarMenciones(){
        Iterator<String> r=menciones.iterator();
        while(r.hasNext()){
            System.out.println("\t-"+r.next());
        }
    } 

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CarreraMencion)) {
            return false;
        }
        CarreraMencion carreraMencion = (CarreraMencion) o;
        return Objects.equals(menciones, carreraMencion.menciones);
    }




}
