package java;
import java.util.Objects;

public class Universidad extends InstitucionEducacion{
    private LDobleFacultad facultades;
    private CCCarreras carreras;
    

    public Universidad() {
        this.facultades = new LDobleFacultad();
        this.carreras = new CCCarreras();
    }

    public Universidad(LDobleFacultad facultades, CCCarreras carreras) {
        this.facultades = facultades;
        this.carreras = carreras;
    }

    public void addCarreraFacultad(String x,String y){
        boolean sw=false;
        NodoFacultad r=facultades.getP();
        while(r!=null){
            if(r.getFacultad().getNombre().equals(x)){
                sw=true;
                if(r.getFacultad().addCarrera(carreras, y))
                    System.out.println(">>> Carrera Añadida !!");
                else
                    System.out.println(">>> No se pudo encontrar la carrera");
            }
            r=r.getSig();
        }
        if(!sw)
            System.out.println("No se encuentra la facultad con nombre "+x);
    } 

    public LDobleFacultad getFacultades() {return this.facultades;}
    public void setFacultades(LDobleFacultad facultades) {this.facultades = facultades;}
    public CCCarreras getCarreras() {return this.carreras;}
    public void setCarreras(CCCarreras carreras) {this.carreras = carreras;}


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Universidad)) {
            return false;
        }
        Universidad universidad = (Universidad) o;
        return Objects.equals(facultades, universidad.facultades) && Objects.equals(carreras, universidad.carreras);
    }

    public void mostrar() {
        System.out.println(super.toString());
        if(facultades.getP()!=null){
            System.out.println("- Facultades: ");
            facultades.mostrar(carreras);
        }
        else{
            System.out.println("- Carreras: ");
            carreras.mostrar();
        }
    }

    
}
