using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace c_;

public class LDobleInstituto
{
    private NodoInstituto p;
    public LDobleInstituto()
    {
        p=null;
    }

    public NodoInstituto getP() {
        return p;
    }

    public void setP(NodoInstituto p) {
        this.p = p;
    }
    public void adicionar(Instituto instituto){
        NodoInstituto nue=new NodoInstituto();
        nue.setInstituto(instituto);
    
        if(getP()==null)
            setP(nue);
        else {
            NodoInstituto r=getP();
            while(r.getSig()!=null)
                r=r.getSig();
            r.setSig(nue);
            nue.setAnt(r);
        }
    }
    public void leer(){
		do {
			Instituto ux=new Instituto();
			ux.leer();
			this.adicionar(ux);
			Console.WriteLine(">>>>>> Desea seguir añadiendo institutos? (s/n) => ");
        }while(Console.ReadKey().KeyChar=='s');
    }  
    
    public void mostrar()
    {
        int i=1;
        NodoInstituto o=getP();
        while(o!=null)
        {    
            Console.WriteLine(i+")---------\n");
            i++;
            o.getInstituto().mostrar();
            o=o.getSig();
        }
    }    
}
