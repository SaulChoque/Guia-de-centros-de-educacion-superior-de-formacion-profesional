using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using System.IO;

namespace Guia_Centros_Estudio_Superior.Core.Models;
[Serializable]


public class Universidad: InstitucionEducacion
{
    private LDobleFacultad facultades;
    private CCCarreras carreras;

    public LDobleFacultad Facultades
    {
        get => facultades;
        set => facultades = value;
    }
    public CCCarreras Carreras
    {
        get => carreras;
        set => carreras = value;
    }

    public Universidad(): base(){
        this.Facultades = new LDobleFacultad();
        this.Carreras = new CCCarreras();
        this.SymbolGlyph="\uE7BE";
        this.SymbolName="Education";
        this.IdInst="UNI";
    }

    public Universidad(string nombre, string departamento, string provincia, string municipio, string direccion, string correo, string dependencia, string documentoLegal, int telefono, int apertura,LDobleFacultad facultades, CCCarreras carreras, List<string> fotosDir): base(nombre, departamento, provincia, municipio, direccion, correo, dependencia, documentoLegal, telefono, apertura, fotosDir) {
        this.Facultades = facultades;
        this.Carreras = carreras;
        this.SymbolGlyph="\uE7BE";
        this.SymbolName="Education";
        this.IdInst="UNI";
    }

    public void addCarreraFacultad(string x,string y){
        bool sw=false;
        NodoFacultad r=Facultades.getP();
        while(r!=null){
            if(r.getFacultad().getNombre()==(x)){
                sw=true;
                if(r.getFacultad().addCarrera(Carreras, y))
                    Console.WriteLine(">>> Carrera Añadida !!");
                else
                    Console.WriteLine(">>> No se pudo encontrar la carrera");
            }
            r=r.getSig();
        }
        if(!sw)
            Console.WriteLine("No se encuentra la facultad con nombre "+x);
    } 

    public LDobleFacultad getFacultades() {return this.Facultades;}
    public void setFacultades(LDobleFacultad facultades) {this.Facultades = facultades;}
    public CCCarreras getCarreras() {return this.Carreras;}
    public void setCarreras(CCCarreras carreras) {this.Carreras = carreras;}


    public void mostrar() {
        Console.WriteLine(base.ToString());
        if(Facultades.getP()!=null){
            Console.WriteLine("- Facultades: ");
            Facultades.mostrar(Carreras);
        }
        else{
            Console.WriteLine("- Carreras: ");
            Carreras.mostrar();
        }
    }


    public new void leer(){
        Console.WriteLine("- Lectura universidad: ");
        base.leer();
        //carreras con menciones
        Carreras.leer(true);
        Console.WriteLine(">>>>>> Desea añadir Facultades? (s/n) => ");
        string g =Leer.Cadena;
        if(Console.ReadKey().KeyChar=='s'){
            Facultades.leer(Carreras);
        }
        
    }         
}
