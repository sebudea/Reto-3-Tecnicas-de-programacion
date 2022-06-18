package com.mycompany.concesionario;

public class Vendedor {
    public int identificacion;
    public string nombre;
    public String apellido;
    public int edad;
    private int valorVendido;
    public String descripcion;
    public double anioIngreso; 
    public String experiencia

    public Vendedor(int identificacion, string nombre, string apellido, int edad, string descripcion, double añoIngreso) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.valorVendido = 0;
        this.descripcion = descripcion;
        this.añoIngreso = añoIngreso;
    }
    
    public void setVendido(int valorVendido){
        this.valorVendido = valorVendido;
        }
    }
    
    public string vendido(){
        if (valorVendido == 0 ) {
            experiencia = "Novato";
        } else if (valorVendido > 0 && valorVendido <= 500000000) {
            experiencia = "Principiante";
        } else if (valorVendido > 500000000 && valorVendido <= 2000000000) {
            experiencia = "Intermedio";
        } else if (valorVendido > 2000000000) {
            experiencia = "Avanzado";
        } else if (valorVendido > 100000) {
            experiencia = "Muy usado";
        }
        return experiencia;
    }


    public void setAnio(int anioIngreso){
        this.anioIngreso = anioIngreso;
        }
    }
    
    public string caracterizacion(){
        if (anioIngreso == 0 || valorVendido == 0 ) {
            experiencia = "Novato";
        } else if (anioIngreso > 0 && anioIngreso <= 500000000) {
            experiencia = "Principiante";
        } else if (anioIngreso > 500000000 && anioIngreso <= 2000000000) {
            experiencia = "Intermedio";
        } else if (anioIngreso > 2000000000) {
            experiencia = "Avanzado";
        } else if (anioIngreso > 100000) {
            experiencia = "Muy usado";
        }
        return experiencia;
    }
   
    public void añoIngreso
    
    
    
}
