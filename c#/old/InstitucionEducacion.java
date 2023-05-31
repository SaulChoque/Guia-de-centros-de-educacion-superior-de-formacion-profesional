package CodigoJava;
import java.util.Objects;

public class InstitucionEducacion {
    protected string nombre,departamento,provincia,municipio,direccion,correo,dependencia,documentoLegal;
    protected int telefono,apertura;
    //documentoLegal



    public InstitucionEducacion() {
    }

    public InstitucionEducacion(string nombre, string departamento, string provincia, string municipio, string direccion, string correo, string dependencia, string documentoLegal, int telefono, int apertura) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.provincia = provincia;
        this.municipio = municipio;
        this.direccion = direccion;
        this.correo = correo;
        this.dependencia = dependencia;
        this.documentoLegal = documentoLegal;
        this.telefono = telefono;
        this.apertura = apertura;
    }

    public void leer(){
        this.departamento="La Paz";
        Console.Write("\t>> Inserte nombre => ");
        this.nombre=Leer.Cadena;
        Console.Write("\t>> Inserte provincia => ");
        this.provincia=Leer.Cadena;
        Console.Write("\t>> Inserte municipio => ");
        this.municipio=Leer.Cadena;
        Console.Write("\t>> Inserte direccion => ");
        this.direccion=Leer.Cadena;
        Console.Write("\t>> Inserte correo => ");
        this.correo=Leer.Cadena;
        Console.Write("\t>> Inserte dependencia => ");
        this.dependencia=Leer.Cadena;
        Console.Write("\t>> Inserte documentoLegal => ");
        this.documentoLegal=Leer.Cadena;
        Console.Write("\t>> Inserte telefono => ");
        this.telefono=Leer.Integer;
        Console.Write("\t>> Inserte apertura => ");
        this.apertura=Leer.Integer;
    } 

    public string getNombre() {return this.nombre;}
    public void setNombre(string nombre) {this.nombre = nombre;}
    public string getDepartamento() {return this.departamento;}
    public void setDepartamento(string departamento) {this.departamento = departamento;}
    public string getProvincia() {return this.provincia;}
    public void setProvincia(string provincia) {this.provincia = provincia;}
    public string getMunicipio() {return this.municipio;}
    public void setMunicipio(string municipio) {this.municipio = municipio;}
    public string getDireccion() {return this.direccion;}
    public void setDireccion(string direccion) {this.direccion = direccion;}
    public string getCorreo() {return this.correo;}
    public void setCorreo(string correo) {this.correo = correo;}
    public string getDependencia() {return this.dependencia;}
    public void setDependencia(string dependencia) {this.dependencia = dependencia;}
    public string getDocumentoLegal() {return this.documentoLegal;}
    public void setDocumentoLegal(string documentoLegal) {this.documentoLegal = documentoLegal;}
    public int getTelefono() {return this.telefono;}
    public void setTelefono(int telefono) {this.telefono = telefono;}
    public int getApertura() {return this.apertura;}
    public void setApertura(int apertura) {this.apertura = apertura;}

    public InstitucionEducacion nombre(string nombre) {setNombre(nombre);return this;}
    public InstitucionEducacion departamento(string departamento) {setDepartamento(departamento);return this;}
    public InstitucionEducacion provincia(string provincia) {setProvincia(provincia);return this;}
    public InstitucionEducacion municipio(string municipio) {setMunicipio(municipio);return this;}
    public InstitucionEducacion direccion(string direccion) {setDireccion(direccion);return this;}
    public InstitucionEducacion correo(string correo) {setCorreo(correo);return this;}
    public InstitucionEducacion dependencia(string dependencia) {setDependencia(dependencia);return this;}
    public InstitucionEducacion documentoLegal(string documentoLegal) {setDocumentoLegal(documentoLegal);return this;}
    public InstitucionEducacion telefono(int telefono) {setTelefono(telefono);return this;}
    public InstitucionEducacion apertura(int apertura) {setApertura(apertura);return this;}

    //@Override
    public bool equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof InstitucionEducacion)) {
            return false;
        }
        InstitucionEducacion institucionEducacion = (InstitucionEducacion) o;
        return Objects.equals(nombre, institucionEducacion.nombre) && Objects.equals(departamento, institucionEducacion.departamento) && Objects.equals(provincia, institucionEducacion.provincia) && Objects.equals(municipio, institucionEducacion.municipio) && Objects.equals(direccion, institucionEducacion.direccion) && Objects.equals(correo, institucionEducacion.correo) && Objects.equals(dependencia, institucionEducacion.dependencia) && Objects.equals(documentoLegal, institucionEducacion.documentoLegal)  && telefono == institucionEducacion.telefono && apertura == institucionEducacion.apertura;
    }

    //@Override
    public int hashCode() {
        return Objects.hash(nombre, departamento, provincia, municipio, direccion, correo, dependencia, documentoLegal, telefono, apertura);
    }

    //@Override
    public string tostring() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", departamento='" + getDepartamento() + "'" +
            ", provincia='" + getProvincia() + "'" +
            ", municipio='" + getMunicipio() + "'" +
            ", direccion='" + getDireccion() + "'" +
            ", correo='" + getCorreo() + "'" +
            ", dependencia='" + getDependencia() + "'" +
            ", documentoLegal='" + getDocumentoLegal() + "'" +
            ", telefono='" + getTelefono() + "'" +
            ", apertura='" + getApertura() + "'" +
            "}";
    }


    

}
