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
public abstract class PlanCelular implements Serializable{
    protected Propietario prop;
    protected String marcaCelular;
    protected String ciudad;
    protected String modCel;
    protected String numCelu;
    protected double pagMen;
    
    public PlanCelular(Propietario p, String m, String c, String mod, 
            String num){
        prop = p;
        marcaCelular = m;
        ciudad = c;
        modCel = mod;
        numCelu = num;
    }
    
    
    public void establecerProp(Propietario n){
        prop = n;
    }
    
    public void establecerMarcaCelu(String n){
        marcaCelular = n;
    }
    
    public void establecerCiudad(String n){
        ciudad = n;
    }
    
    public void establecerModCel(String n){
        modCel = n;
    }
    
    public void establecerNumCelu(String n){
        numCelu = n;
    }
    
    public abstract void establecerPagoMensual();
    
    public Propietario obtenerProp(){
        return prop;
    }
    
    public String obtenerMarcaCelu(){
        return marcaCelular;
    }
    
    public String obtenerCiudad(){
        return ciudad;
    }
    
    public String obtenerModCel(){
        return modCel;
    }
    
    public String obtenerNumCel(){
        return numCelu;
    }
    
    public double obtenerPagMen(){
        return pagMen;
    }
     @Override
    public String toString() {
        String cadena = String.format("\nNombre: %s\n"
                + "Apellido: %s\n"
                + "Identificacion:%s\n"
                + "Marca del Celular: %s\n"
                + "Ciudad: %s\n"
                + "Modelo del Celular: %s\n"
                + "Numero del Celular: %s\n",
                obtenerProp().obtenerNombre(),
                obtenerProp().obtenerApellido(),
                obtenerProp().obtenerIden(),
                obtenerMarcaCelu(),
                obtenerCiudad(),
                obtenerModCel(),
                obtenerNumCel());

        return cadena;
    }
    
       
}
