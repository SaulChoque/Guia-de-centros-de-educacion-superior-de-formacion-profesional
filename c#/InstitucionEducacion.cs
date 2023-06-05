using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

using System.IO;
namespace c_;
[Serializable]

public class InstitucionEducacion
{
    protected string nombre,departamento,provincia,municipio,direccion,correo,dependencia,documentoLegal;
    protected int telefono,apertura;
    private List<string> fotosDir;

    public InstitucionEducacion() {
        this.nombre = "";
        this.departamento = "";
        this.provincia = "";
        this.municipio = "";
        this.direccion = "";
        this.correo = "";
        this.dependencia = "";
        this.documentoLegal = "";
        this.telefono = 0;
        this.apertura = 0;
        this.fotosDir =new List<string>();
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
        this.fotosDir =new List<string>();
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

    //@Override


    //@Override
    public override string ToString() {
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
