using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace c_;

public class Instituto: InstitucionEducacion
{
    private CCCarreras carreras;


    public Instituto(): base(){
        this.carreras = new CCCarreras();
    }

    public Instituto(string nombre, string departamento, string provincia, string municipio, string direccion, string correo, string dependencia, string documentoLegal, int telefono, int apertura, CCCarreras carreras): base(nombre, departamento, provincia, municipio, direccion, correo, dependencia, documentoLegal, telefono, apertura){
        this.carreras = carreras;
    }

    public CCCarreras getCarreras() {return this.carreras;}
    public void setCarreras(CCCarreras carreras) {this.carreras = carreras;}

    public void leer(){
        Console.WriteLine("\n- Lectura Instituto: ");
        base.leer();
        //carreras sin menciones
        carreras.leer();
    } 

    public void mostrar(){
        Console.WriteLine(base.tostring()+" "+this.tostring());
        carreras.mostrar();
    } 



    
    
}
