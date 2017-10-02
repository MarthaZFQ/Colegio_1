/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuela;

/**
 *
 * @author zuh19
 */

//Persona es el padre de alumno
public class Alumno extends Persona {
    
   private float notaMates;
    private float notaEdFisica;
    private float notaCatalan;
    private float notaMedia;


    public Alumno() {
    
    }

    public Alumno(float notaMates, float notaEdFisica, float notaCatalan) {
        this.notaMates = notaMates;
        this.notaEdFisica = notaEdFisica;
        this.notaCatalan = notaCatalan;
    }

    public Alumno(String nombre, String apellido,float notaMates, float notaEdFisica, float notaCatalan) {
        super(nombre, apellido);
        this.notaMates = notaMates;
        this.notaEdFisica = notaEdFisica;
        this.notaCatalan = notaCatalan;
    }

   

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public float getNotaMates() {
        return notaMates;
    }

    public float getNotaEdFisica() {
        return notaEdFisica;
    }

    public float getNotaCatalan() {
        return notaCatalan;
    }

    public float getNotaMedia() {
        return notaMedia;
    }
    
 

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNotaMates(float notaMates) {
        this.notaMates = notaMates;
    }

    public void setNotaEdFisica(float notaEdFisica) {
        this.notaEdFisica = notaEdFisica;
    }

    public void setNotaCatalan(float notaCatalan) {
        this.notaCatalan = notaCatalan;
    }

    public void setNotMedia(float notaMedia) {
        this.notaMedia = notaMedia;
    }
    
   
    public float notamedia(float nota1, float nota2, float nota3){
        float resultado;
        resultado = nota1+nota2+nota3/3;
       
        return resultado;
        
        
    }
    public float notaMaxima(float nota1, float nota2, float nota3){
        
        
        float mayor = Math.max(nota1, nota2);
       
        return Math.max(mayor, nota3);
        
        
    
}
}
