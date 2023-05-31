using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace c_;

public class LDobleUniversidad
{
    private NodoUni p;
    public LDobleUniversidad()
    {
        p=null;
    }

    public NodoUni getP() {
        return p;
    }

    public void setP(NodoUni p) {
        this.p = p;
    }
    public void adicionar(Universidad universidad){
        NodoUni nue=new NodoUni();
        nue.setUniversidad(universidad);
        
        if(getP()==null)
            setP(nue);
        else {
            NodoUni r=getP();
            while(r.getSig()!=null)
                r=r.getSig();
            r.setSig(nue);
            nue.setAnt(r);
        }
    }
    public void mostrar()
    {
        int i=1;
        NodoUni o=getP();
        while(o!=null)
        {
            Console.WriteLine(i+")---------\n");
            i++;
            o.getUniversidad().mostrar();
            o=o.getSig();
        }
    }
    public void leer(){
		do {
			Universidad ux=new Universidad();
			ux.leer();
			this.adicionar(ux);
			Console.WriteLine(">>>>>> Desea seguir añadiendo Universidades? (s/n) => ");
        }while(Console.ReadKey().KeyChar=='s');
	}  
    
}
