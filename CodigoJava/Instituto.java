package CodigoJava;
import java.util.Objects;

public class Instituto extends InstitucionEducacion{
    private CCCarreras carreras;


    public Instituto() {
        super();
        this.carreras = new CCCarreras();
    }

    public Instituto(String nombre, String departamento, String provincia, String municipio, String direccion, String correo, String dependencia, String documentoLegal, int telefono, int apertura, CCCarreras carreras) {
        super(nombre, departamento, provincia, municipio, direccion, correo, dependencia, documentoLegal, telefono, apertura);
        this.carreras = carreras;
    }

    public CCCarreras getCarreras() {return this.carreras;}
    public void setCarreras(CCCarreras carreras) {this.carreras = carreras;}

    public void leer(){
        System.out.println("\n- Lectura Instituto: ");
        super.leer();
        //carreras sin menciones
        carreras.leer();
    } 

    public void mostrar(){
        System.out.println(super.toString()+" "+this.toString());
        carreras.mostrar();
    } 

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Instituto)) {
            return false;
        }
        Instituto instituto = (Instituto) o;
        return Objects.equals(carreras, instituto.carreras);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carreras);
    }

    
    
    
}
