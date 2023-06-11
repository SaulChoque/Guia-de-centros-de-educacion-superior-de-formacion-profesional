using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;


using System.IO;
namespace Guia_Centros_Estudio_Superior.Core.Models;
[Serializable]

public class Instituto: InstitucionEducacion
{
    private CCCarreras carreras;

    public CCCarreras Carreras
    {
        get => carreras;
        set => carreras = value;
    }

    public Instituto(): base(){
        this.Carreras = new CCCarreras();
        this.SymbolGlyph="\uED63";
        this.SymbolName="Pencil";
        this.IdInst="INS";
    }

    public Instituto(string nombre, string departamento, string provincia, string municipio, string direccion, string correo, string dependencia, string documentoLegal, int telefono, int apertura, CCCarreras carreras, List<string> fotosDir): base(nombre, departamento, provincia, municipio, direccion, correo, dependencia, documentoLegal, telefono, apertura, fotosDir){
        this.Carreras = carreras;
        this.SymbolGlyph="\uED63";
        this.SymbolName="Pencil";
        this.IdInst="INS";
        
    }

    public CCCarreras getCarreras() {return this.Carreras;}
    public void setCarreras(CCCarreras carreras) {this.Carreras = carreras;}

    public new void leer(){
        Console.WriteLine("\n- Lectura Instituto: ");
        base.leer();
        //carreras sin menciones
        Carreras.leer();
    } 

    public void mostrar(){
        Console.WriteLine(base.ToString()+" "+this.ToString());
        Carreras.mostrar();
    } 



    
    
}
