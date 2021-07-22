/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.io.Serializable;

/**
 *
 * @author xavierchavez
 */
public class Propietario implements Serializable{

    private String nombre;
    private String apellido;
    private String iden;
    
    public Propietario(String n, String a, String i){
        nombre = n;
        apellido = a;
        iden = i;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerApellido(String n) {
        apellido = n;
    }

    public void establecerIden(String n) {
        iden = n;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public String obtenerIden() {
        return iden;
    }

}
