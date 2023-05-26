/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java;

/**
 *
 * @author Carmen Huanca
 */
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
    public void adiFinal(Instituto instituto){
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
