package java;
public class CCCarreras {
    private int max=100;
    private Carrera v[]=new Carrera[max+1];
    private int ini,fin;
    
	public CCCarreras(){
        ini=fin=0;
    }
    
	public int nroelem(){
		return ((max + fin - ini) % max);
    }
    
	public boolean esvacia(){
		if (nroelem () == 0)
		    return (true);
		return (false);
    }
    
	public boolean esllena(){
		if (nroelem () == max)
		    return (true);
		return (false);
    }

    public void adicionar(Carrera elem){
		if (!esllena()){
		    fin = (fin + 1) % max;
		    v [fin] = elem;
		}
		else
		    System.out.println ("Cola circular llena");
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
		    System.out.println ("Cola circular vacia");
		return (elem);
    }

    public void mostrar (){
		if (esvacia ())
		    System.out.println ("Cola vacia xxx");
		else{
		    System.out.println ("\n Carreras de la Cola ");
		    CCCarreras aux = new CCCarreras ();
		    while (!esvacia ()){
				Carrera elem = eliminar ();
				aux.adicionar (elem);
				System.out.println(elem);
		    }
		    vaciar(aux);
		}
    }

    public void vaciar (CCCarreras a){
		while (!a.esvacia ())
		    adicionar (a.eliminar ());
    }
}
