package CodigoJava;

public class LDobleUniversidad {
    private NodoUni p;
    LDobleUniversidad()
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
            System.out.println(i+")---------\n");
            i++;
            o.getUniversidad().mostrar();
            o=o.getSig();
        }
    }
    public void leer(){
		char condition=' ';
		do {
			Universidad ux=new Universidad();
			ux.leer();
			this.adicionar(ux);
			System.out.println(">>>>>> Desea seguir añadiendo Universidades? (s/n) => ");
			String g =Leer.dato();
			condition= g.charAt(0);
		} while (condition=='s');
	}  
    
}
