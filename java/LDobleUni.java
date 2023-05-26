package java;

public class LDobleUni {
    private NodoUni p;
    LDobleUni()
    {
        p=null;
    }

    public NodoUni getP() {
        return p;
    }

    public void setP(NodoUni p) {
        this.p = p;
    }
    public void adiFinal(Universidad universidad){
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
        NodoUni o=getP();
        while(o!=null)
        {
            o.getUniversidad().mostrar();
            o=o.getSig();
        }
    }
    
}
