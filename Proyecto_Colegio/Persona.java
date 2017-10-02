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
public class Persona {
    //Al estar protected eso tan solo lo puede ver la clase padre e hijos
    protected String nombre;
    protected String apellido;
    
    //Constructores

    public Persona() {
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
}
