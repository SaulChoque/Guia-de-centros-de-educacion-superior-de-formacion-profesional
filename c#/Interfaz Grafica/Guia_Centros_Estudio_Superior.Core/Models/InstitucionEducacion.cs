using System;
using System.Diagnostics;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

using System.IO;
namespace Guia_Centros_Estudio_Superior.Core.Models;
[Serializable]

public class InstitucionEducacion
{
    private string documentoLegal;
    private int apertura;
    private List<string> fotosDir;
    private string nombre;
    private string sigla;
    private string departamento;
    private string provincia;
    private string municipio;
    private string direccion;
    private string correo;
    private string dependencia;
    private string symbolGlyph;
    private string symbolName;
    private string idInst;
    private int telefono;

    public string Nombre
    {
        get => nombre;
        set => nombre = value;
    }
    public string Sigla
    {
        get => sigla;
        set => sigla = value;
    }

    public string Departamento
    {
        get => departamento;
        set => departamento = value;
    }
    public string Provincia
    {
        get => provincia;
        set => provincia = value;
    }
    public string Municipio
    {
        get => municipio;
        set => municipio = value;
    }
    public string Direccion
    {
        get => direccion;
        set => direccion = value;
    }
    public string Correo
    {
        get => correo;
        set => correo = value;
    }
    public string Dependencia
    {
        get => dependencia;
        set => dependencia = value;
    }
    public string SymbolGlyph
    {
        get => symbolGlyph;
        set => symbolGlyph = value;
    }
    public string SymbolName
    {
        get => symbolName;
        set => symbolName = value;
    }
    public string DocumentoLegal
    {
        get => documentoLegal;
        set => documentoLegal = value;
    }
    public int Telefono
    {
        get => telefono;
        set => telefono = value;
    }
    public int Apertura
    {
        get => apertura;
        set => apertura = value;
    }
    public List<string> FotosDir { get => fotosDir; set => fotosDir = value; }
    public string IdInst { get => idInst; set => idInst = value; }

    //public char Symbol => (char)(Convert.ToInt32(SymbolGlyph, 16)); // '\uF7B4';

    public InstitucionEducacion() {
        this.Nombre = "";
        this.Sigla = "";
        this.Departamento = "";
        this.Provincia = "";
        this.Municipio = "";
        this.Direccion = "";
        this.Correo = "";
        this.Dependencia = "";
        this.SymbolGlyph = "";
        this.SymbolName = "";
        this.IdInst = "";
        this.DocumentoLegal = "";
        this.Telefono = 0;
        this.Apertura = 0;
        this.FotosDir =new List<string>();
    }

    public InstitucionEducacion(string nombre, string departamento, string provincia, string municipio, string direccion, string correo, string dependencia, string documentoLegal, int telefono, int apertura, List<string> fotosDir) {
        this.Nombre = nombre;
        this.Sigla = "";
        string[] subs = Nombre.Split(' ');
        
        foreach(string item in subs){
            Debug.WriteLine(">>> "+item);
            if (item!="") {
                this.Sigla += item[0].ToString();
            }
        }
        this.Departamento = departamento;
        this.Provincia = provincia;
        this.Municipio = municipio;
        this.Direccion = direccion;
        this.Correo = correo;
        this.Dependencia = dependencia;
        this.DocumentoLegal = documentoLegal;
        this.Telefono = telefono;
        this.Apertura = apertura;
        this.FotosDir =fotosDir;
    }

    public void leer(){
        this.Departamento="La Paz";
        Console.Write("\t>> Inserte nombre => ");
        this.Nombre=Leer.Cadena;
        Console.Write("\t>> Inserte provincia => ");
        this.Provincia=Leer.Cadena;
        Console.Write("\t>> Inserte municipio => ");
        this.Municipio=Leer.Cadena;
        Console.Write("\t>> Inserte direccion => ");
        this.Direccion=Leer.Cadena;
        Console.Write("\t>> Inserte correo => ");
        this.Correo=Leer.Cadena;
        Console.Write("\t>> Inserte dependencia => ");
        this.Dependencia=Leer.Cadena;
        Console.Write("\t>> Inserte documentoLegal => ");
        this.DocumentoLegal=Leer.Cadena;
        Console.Write("\t>> Inserte telefono => ");
        this.Telefono=Leer.Integer;
        Console.Write("\t>> Inserte apertura => ");
        this.Apertura=Leer.Integer;
    } 

    public string getNombre() {return this.Nombre;}
    public void setNombre(string nombre) {this.Nombre = nombre;}
    public string getDepartamento() {return this.Departamento;}
    public void setDepartamento(string departamento) {this.Departamento = departamento;}
    public string getProvincia() {return this.Provincia;}
    public void setProvincia(string provincia) {this.Provincia = provincia;}
    public string getMunicipio() {return this.Municipio;}
    public void setMunicipio(string municipio) {this.Municipio = municipio;}
    public string getDireccion() {return this.Direccion;}
    public void setDireccion(string direccion) {this.Direccion = direccion;}
    public string getCorreo() {return this.Correo;}
    public void setCorreo(string correo) {this.Correo = correo;}
    public string getDependencia() {return this.Dependencia;}
    public void setDependencia(string dependencia) {this.Dependencia = dependencia;}
    public string getDocumentoLegal() {return this.DocumentoLegal;}
    public void setDocumentoLegal(string documentoLegal) {this.DocumentoLegal = documentoLegal;}
    public int getTelefono() {return this.Telefono;}
    public void setTelefono(int telefono) {this.Telefono = telefono;}
    public int getApertura() {return this.Apertura;}
    public void setApertura(int apertura) {this.Apertura = apertura;}

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
