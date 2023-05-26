package java;
import java.util.Objects;

public class InstitucionEducacion {
    private String nombre,departamento,provincia,municipio,direccion,correo,dependencia;
    private int telefono,apertura;
    //documentoLegal


    public InstitucionEducacion() {
    }

    public InstitucionEducacion(String nombre, String departamento, String provincia, String municipio, String direccion, String correo, String dependencia, int telefono, int apertura) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.provincia = provincia;
        this.municipio = municipio;
        this.direccion = direccion;
        this.correo = correo;
        this.dependencia = dependencia;
        this.telefono = telefono;
        this.apertura = apertura;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getProvincia() {
        return this.provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getMunicipio() {
        return this.municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDependencia() {
        return this.dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getApertura() {
        return this.apertura;
    }

    public void setApertura(int apertura) {
        this.apertura = apertura;
    }

    public InstitucionEducacion nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public InstitucionEducacion departamento(String departamento) {
        setDepartamento(departamento);
        return this;
    }

    public InstitucionEducacion provincia(String provincia) {
        setProvincia(provincia);
        return this;
    }

    public InstitucionEducacion municipio(String municipio) {
        setMunicipio(municipio);
        return this;
    }

    public InstitucionEducacion direccion(String direccion) {
        setDireccion(direccion);
        return this;
    }

    public InstitucionEducacion correo(String correo) {
        setCorreo(correo);
        return this;
    }

    public InstitucionEducacion dependencia(String dependencia) {
        setDependencia(dependencia);
        return this;
    }

    public InstitucionEducacion telefono(int telefono) {
        setTelefono(telefono);
        return this;
    }

    public InstitucionEducacion apertura(int apertura) {
        setApertura(apertura);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof InstitucionEducacion)) {
            return false;
        }
        InstitucionEducacion institucionEducacion = (InstitucionEducacion) o;
        return Objects.equals(nombre, institucionEducacion.nombre) && Objects.equals(departamento, institucionEducacion.departamento) && Objects.equals(provincia, institucionEducacion.provincia) && Objects.equals(municipio, institucionEducacion.municipio) && Objects.equals(direccion, institucionEducacion.direccion) && Objects.equals(correo, institucionEducacion.correo) && Objects.equals(dependencia, institucionEducacion.dependencia) && telefono == institucionEducacion.telefono && apertura == institucionEducacion.apertura;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, departamento, provincia, municipio, direccion, correo, dependencia, telefono, apertura);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", departamento='" + getDepartamento() + "'" +
            ", provincia='" + getProvincia() + "'" +
            ", municipio='" + getMunicipio() + "'" +
            ", direccion='" + getDireccion() + "'" +
            ", correo='" + getCorreo() + "'" +
            ", dependencia='" + getDependencia() + "'" +
            ", telefono='" + getTelefono() + "'" +
            ", apertura='" + getApertura() + "'" +
            "}";
    }
    

}
