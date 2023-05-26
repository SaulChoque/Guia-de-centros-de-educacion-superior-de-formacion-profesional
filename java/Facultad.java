package java;

import java.util.*;


public class Facultad {
    private String nombre;
    private Queue<Integer> carreras;


    public Facultad() {
    }
    
    public Facultad(String nombre, Queue<Integer> carreras) {
        this.nombre = nombre;
        this.carreras = carreras;
    }
    
    public boolean addCarrera(CCCarreras a, String x){
        boolean sw=false;
        int n=a.nroelem();
        for (int i=0; i<n; i++) {
            Carrera cx=a.eliminar();
            if(cx.getNombre().equals(x) && !sw){
                carreras.add(cx.getIdCarrera());
                sw=true;
            }
            a.adicionar(cx);
        }
        return sw;
    }
    
    public void mostrarCarreras(CCCarreras a){
        Iterator<Integer> r=carreras.iterator();
        while(r.hasNext()){
            int cx=r.next();
            System.out.println(buscarCarreraID(a, cx));
        }
    }

    private Carrera buscarCarreraID(CCCarreras a, int id){
        int n=a.nroelem();
        Carrera rs=new Carrera();
        for (int i = 0; i<n; i++) {
            Carrera cx=a.eliminar();
            if(cx.getIdCarrera()==id){
                rs=cx;
            }
            a.adicionar(cx);
        }
        return rs;
    } 

    public String getNombre() {return this.nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}
    
    public Queue<Integer> getCarreras() {return this.carreras;}
    
    public void setCarreras(Queue<Integer> carreras) {this.carreras = carreras;}
    
    
    public boolean equals(Object o) {
        if (o == this)
        return true;
        if (!(o instanceof Facultad)) {
            return false;
        }
        Facultad facultad = (Facultad) o;
        return Objects.equals(nombre, facultad.nombre) && Objects.equals(carreras, facultad.carreras);
    }
    
    
    @Override
    public String toString() {
        return "{" +
        " nombre='" + getNombre() + "'" +
        "}";
    }
    
}
