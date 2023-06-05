package CodigoJava;
import java.util.Objects;

public class Instituto extends InstitucionEducacion{
    private CCCarreras carreras;


    public Instituto() {
        base();
        this.carreras = new CCCarreras();
    }

    public Instituto(string nombre, string departamento, string provincia, string municipio, string direccion, string correo, string dependencia, string documentoLegal, int telefono, int apertura, CCCarreras carreras) {
        base(nombre, departamento, provincia, municipio, direccion, correo, dependencia, documentoLegal, telefono, apertura);
        this.carreras = carreras;
    }

    public CCCarreras getCarreras() {return this.carreras;}
    public void setCarreras(CCCarreras carreras) {this.carreras = carreras;}

    public new void leer(){
        Console.WriteLine("\n- Lectura Instituto: ");
        base.leer();
        //carreras sin menciones
        carreras.leer();
    } 

    public void mostrar(){
        Console.WriteLine(base.ToString()+" "+this.ToString());
        carreras.mostrar();
    } 

    //@Override
    public bool equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Instituto)) {
            return false;
        }
        Instituto instituto = (Instituto) o;
        return Objects.equals(carreras, instituto.carreras);
    }

    //@Override
    public int hashCode() {
        return Objects.hash(carreras);
    }

    
    
    
}
