package CodigoJava;
import java.util.Objects;

public class Carrera {
    
    protected string nombre;
    protected int planEstudios,idCarrera;



    public Carrera() {
    }

    public Carrera(string nombre, int planEstudios, int idCarrera) {
        this.nombre = nombre;
        this.planEstudios = planEstudios;
        this.idCarrera = idCarrera;
    }


    public new void leer(){
        Console.WriteLine("\n- Lectura Carrera: ");
        Console.Write("\t>> Inserte nombre => ");
        this.nombre=Leer.Cadena;
        Console.Write("\t>> Inserte año plan de estudios => ");
        this.planEstudios=Leer.Integer;
        Console.Write("\t>> Inserte idCarrera => ");
        this.idCarrera=Leer.Integer;
    } 

    public string getNombre() {return this.nombre;}
    public void setNombre(string nombre) {this.nombre = nombre;}
    public int getPlanEstudios() {return this.planEstudios;}
    public void setPlanEstudios(int planEstudios) {this.planEstudios = planEstudios;}
    public int getIdCarrera() {return this.idCarrera;}
    public void setIdCarrera(int idCarrera) {this.idCarrera = idCarrera;}

    //@Override
    public bool equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Carrera)) {
            return false;
        }
        Carrera carrera = (Carrera) o;
        return Objects.equals(nombre, carrera.nombre) && planEstudios == carrera.planEstudios && idCarrera == carrera.idCarrera;
    }

    //@Override
    public int hashCode() {
        return Objects.hash(nombre, planEstudios, idCarrera);
    }

    //@Override
    public override string ToString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", planEstudios='" + getPlanEstudios() + "'" +
            ", idCarrera='" + getIdCarrera() + "'" +
            "}";
    }


    
}
