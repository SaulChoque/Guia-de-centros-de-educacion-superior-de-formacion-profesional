package CodigoJava;

public class LDobleFacultad {
    private NodoFacultad p;
    LDobleFacultad()
    {
        p=null;
    }

    public NodoFacultad getP() {
        return p;
    }

    public void setP(NodoFacultad p) {
        this.p = p;
    }
    public void adicionar(Facultad facultad){
        NodoFacultad nue=new NodoFacultad();
        nue.setFacultad(facultad);        
        if(getP()==null)
            setP(nue);
        else {
            NodoFacultad r=getP();
            while(r.getSig()!=null)
                r=r.getSig();
            r.setSig(nue);
            nue.setAnt(r);
        }
    }
    public void mostrar(CCCarreras a)
    {
        NodoFacultad o=getP();
        while(o!=null)
        {
            System.out.println(o.getFacultad());
            System.out.println("- Carreras: ");
            o.getFacultad().mostrarCarreras(a);
            o=o.getSig();
        }
    }

    public void leer(CCCarreras carreras){
		char condition=' ';
		do {
			Facultad fx=new Facultad();
			fx.leer(carreras);
			this.adicionar(fx);
			System.out.println(">>>>>> Desea seguir añadiendo Facultades? (s/n) => ");
			String g =Leer.dato();
			condition= g.charAt(0);
		} while (condition=='s');
	}  
    
}
