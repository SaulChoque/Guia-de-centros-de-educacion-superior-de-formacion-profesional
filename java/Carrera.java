package java;
import java.util.Objects;

public class Carrera {
    
    protected String nombre;
    protected int planEstudios;


    public Carrera() {
    }

    public Carrera(String nombre, int planEstudios) {
        this.nombre = nombre;
        this.planEstudios = planEstudios;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPlanEstudios() {
        return this.planEstudios;
    }

    public void setPlanEstudios(int planEstudios) {
        this.planEstudios = planEstudios;
    }

    public Carrera nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public Carrera planEstudios(int planEstudios) {
        setPlanEstudios(planEstudios);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Carrera)) {
            return false;
        }
        Carrera carrera = (Carrera) o;
        return Objects.equals(nombre, carrera.nombre) && planEstudios == carrera.planEstudios;
    }



    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", planEstudios='" + getPlanEstudios() + "'" +
            "}";
    }

    
}
