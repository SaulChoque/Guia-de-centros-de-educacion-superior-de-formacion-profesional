package CodigoJava;
import java.util.Objects;

public class Universidad extends InstitucionEducacion{
    private LDobleFacultad facultades;
    private CCCarreras carreras;
    

    public Universidad() {
        base();
        this.facultades = new LDobleFacultad();
        this.carreras = new CCCarreras();
    }

    public Universidad(string nombre, string departamento, string provincia, string municipio, string direccion, string correo, string dependencia, string documentoLegal, int telefono, int apertura,LDobleFacultad facultades, CCCarreras carreras) {
        base(nombre, departamento, provincia, municipio, direccion, correo, dependencia, documentoLegal, telefono, apertura);
        this.facultades = facultades;
        this.carreras = carreras;
    }

    public void addCarreraFacultad(string x,string y){
        bool sw=false;
        NodoFacultad r=facultades.getP();
        while(r!=null){
            if(r.getFacultad().getNombre().equals(x)){
                sw=true;
                if(r.getFacultad().addCarrera(carreras, y))
                    Console.WriteLine(">>> Carrera Añadida !!");
                else
                    Console.WriteLine(">>> No se pudo encontrar la carrera");
            }
            r=r.getSig();
        }
        if(!sw)
            Console.WriteLine("No se encuentra la facultad con nombre "+x);
    } 

    public LDobleFacultad getFacultades() {return this.facultades;}
    public void setFacultades(LDobleFacultad facultades) {this.facultades = facultades;}
    public CCCarreras getCarreras() {return this.carreras;}
    public void setCarreras(CCCarreras carreras) {this.carreras = carreras;}


    //@Override
    public bool equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Universidad)) {
            return false;
        }
        Universidad universidad = (Universidad) o;
        return Objects.equals(facultades, universidad.facultades) && Objects.equals(carreras, universidad.carreras);
    }

    public void mostrar() {
        Console.WriteLine(base.tostring());
        if(facultades.getP()!=null){
            Console.WriteLine("- Facultades: ");
            facultades.mostrar(carreras);
        }
        else{
            Console.WriteLine("- Carreras: ");
            carreras.mostrar();
        }
    }


    public void leer(){
        Console.WriteLine("- Lectura universidad: ");
        base.leer();
        //carreras con menciones
        carreras.leer(true);
        Console.WriteLine(">>>>>> Desea añadir Facultades? (s/n) => ");
        string g =Leer.Cadena;
        char c = g.charAt(0);
        if(c=='s'){
            facultades.leer(carreras);
        }
        
    } 

    
}
