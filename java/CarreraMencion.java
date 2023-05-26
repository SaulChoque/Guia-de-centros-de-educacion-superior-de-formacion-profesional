package java;
import java.util.Objects;

public class CarreraMencion extends Carrera{
    private PilaMencion a;


    public CarreraMencion() {
        super();
    }

    public CarreraMencion(String nombre, int planEstudios, int idCarrera, PilaMencion a) {
        super(nombre, planEstudios, idCarrera);
        this.a = a;
    }

    public PilaMencion getA() {
        return this.a;
    }

    public void setA(PilaMencion a) {
        this.a = a;
    }

    public CarreraMencion a(PilaMencion a) {
        setA(a);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CarreraMencion)) {
            return false;
        }
        CarreraMencion carreraMencion = (CarreraMencion) o;
        return Objects.equals(a, carreraMencion.a);
    }



    @Override
    public String toString() {
        return super.toString()+"{" +
            " a='" + getA() + "'" +
            "}";
    }
    
}
