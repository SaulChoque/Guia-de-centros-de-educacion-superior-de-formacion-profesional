package CodigoJava;

public class LDobleInstituto {
    private NodoInstituto p;
    LDobleInstituto()
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
		char condition=' ';
		do {
			Instituto ux=new Instituto();
			ux.leer();
			this.adicionar(ux);
			System.out.println(">>>>>> Desea seguir añadiendo institutos? (s/n) => ");
			String g =Leer.dato();
			condition= g.charAt(0);
		} while (condition=='s');
	}  
    
    public void mostrar()
    {
        NodoInstituto o=getP();
        while(o!=null)
        {
            o.getInstituto().mostrar();
            o=o.getSig();
        }
    }
    
}
