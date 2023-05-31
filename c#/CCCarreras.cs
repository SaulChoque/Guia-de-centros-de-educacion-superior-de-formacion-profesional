using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace c_;

public class CCCarreras
{
    private int max=100;
    private Carrera []v;
    private int ini,fin;
    
	public CCCarreras(){
        ini=fin=0;
        v=new Carrera[max+1];
    }
    
	public int nroelem(){
		return ((max + fin - ini) % max);
    }
    
	public bool esvacia(){
		if (nroelem () == 0)
		    return (true);
		return (false);
    }
    
	public bool esllena(){
		if (nroelem () == max)
		    return (true);
		return (false);
    }

    public void adicionar(Carrera elem){
		//Console.WriteLine(elem.getNombre());
        if (!esllena()){
            //Console.WriteLine("si----");
		    fin = (fin + 1) % max;
		    v [fin] = elem;
		}
		else Console.WriteLine ("Cola circular llena");
    }

    public Carrera eliminar(){
		Carrera elem = null;
		if (!esvacia()){
		    ini = (ini + 1) % max;
		    elem = v [ini];
		    if (nroelem () == 0) 
				ini = fin = 0;
		}
		else
		    Console.WriteLine ("Cola circular vacia");
		return (elem);
    }

    public void mostrar (){
		if (esvacia ())
		    Console.WriteLine ("Cola vacia xxx");
		else{
			int i=1;
		    Console.WriteLine ("\n Carreras de la Cola ");
		    CCCarreras aux = new CCCarreras ();
		    while (!esvacia ()){
				Carrera elem = eliminar ();
				aux.adicionar (elem);
				Console.WriteLine(i+")/t"+elem);
				i++;
		    }
		    vaciar(aux);
		}
    }

	public void leer(){
		do {
			Carrera cx=new Carrera();
			cx.leer();
			this.adicionar(cx);
			Console.WriteLine(">>>>>> Desea seguir añadiendo Carreras? (s/n) => ");
		}while(Console.ReadKey().KeyChar=='s');

	}  
	public void leer(bool a){
		do {
			CarreraMencion cx=new CarreraMencion();
			cx.leer();
			this.adicionar(cx);
			Console.WriteLine(">>>>>> Desea seguir añadiendo Carreras? (s/n) => ");
		}while(Console.ReadKey().KeyChar=='s');
	}  

    public void vaciar (CCCarreras a){
		while (!a.esvacia ())
		    adicionar (a.eliminar ());
    }        
}
