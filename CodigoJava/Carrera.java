package CodigoJava;
import java.util.Objects;

public class Carrera {
    
    protected String nombre;
    protected int planEstudios,idCarrera;



    public Carrera() {
    }

    public Carrera(String nombre, int planEstudios, int idCarrera) {
        this.nombre = nombre;
        this.planEstudios = planEstudios;
        this.idCarrera = idCarrera;
    }


    public void leer(){
        System.out.println("\n- Lectura Carrera: ");
        System.out.print("\t>> Inserte nombre => ");
        this.nombre=Leer.dato();
        System.out.print("\t>> Inserte año plan de estudios => ");
        this.planEstudios=Leer.datoInt();
        System.out.print("\t>> Inserte idCarrera => ");
        this.idCarrera=Leer.datoInt();
    } 

    public String getNombre() {return this.nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public int getPlanEstudios() {return this.planEstudios;}
    public void setPlanEstudios(int planEstudios) {this.planEstudios = planEstudios;}
    public int getIdCarrera() {return this.idCarrera;}
    public void setIdCarrera(int idCarrera) {this.idCarrera = idCarrera;}

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Carrera)) {
            return false;
        }
        Carrera carrera = (Carrera) o;
        return Objects.equals(nombre, carrera.nombre) && planEstudios == carrera.planEstudios && idCarrera == carrera.idCarrera;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, planEstudios, idCarrera);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", planEstudios='" + getPlanEstudios() + "'" +
            ", idCarrera='" + getIdCarrera() + "'" +
            "}";
    }


    
}
