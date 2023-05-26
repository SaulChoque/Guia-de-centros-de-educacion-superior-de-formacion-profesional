package java;

import java.util.Scanner;

public class PilaMencion {
	private int max=100;
    private String v[]=new String[max+1];
    private int tope;
    PilaMencion (){
		tope = 0;
    }


    boolean esvacia (){
		if (tope == 0)
		    return (true);
		return (false);
    }


    boolean esllena (){
		if (tope == max)
		    return (true);
		return (false);
    }


    int nroelem (){
		return (tope);
    }


    void adicionar (String elem){
		if (!esllena ())
		{
		    tope++;
		    v [tope] = elem;
		}
		else
		    System.out.println ("PilaT llena");
    }


    String eliminar (){
		String elem = new String();
		if (!esvacia ())
		{
		    elem = v [tope];
		    tope--;
		}
		else
		    System.out.println ("PilaT vacia");
		return (elem);
    }


    void mostrar (){
		String elem;
		if (esvacia())
		    System.out.println ("PilaT vacia");
		else{
		    System.out.println ("\n Datos Strings ");
		    PilaMencion aux = new PilaMencion ();
		    while (!esvacia ()){
				elem = eliminar ();
				aux.adicionar (elem);
				System.out.println(elem.toString());
			}
		    while (!aux.esvacia ()){
				elem = aux.eliminar ();
				adicionar (elem);
		    }
		}
    }

	
	
	void llenar (int n){
		int i;
		for (i = 1 ; i <= n ; i++){
			String l = new String ();
		    l=Leer.dato();
		    adicionar (l);
		}
	}
	


    void invertir (){
		PilaMencion a = new PilaMencion ();
		PilaMencion b = new PilaMencion ();
		while (!esvacia ())
		    a.adicionar (eliminar ());
		while (!a.esvacia ())
		    b.adicionar (a.eliminar ());
		while (!b.esvacia ())
		    adicionar (b.eliminar ());
    }


    void vaciar (PilaMencion a){
		while (!a.esvacia ())
		    adicionar (a.eliminar ());
    }
}
