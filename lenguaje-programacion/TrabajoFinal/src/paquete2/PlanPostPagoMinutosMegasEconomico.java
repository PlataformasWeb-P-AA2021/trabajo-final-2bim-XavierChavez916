/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.PlanCelular;
import paquete1.Propietario;

/**
 *
 * @author xavierchavez
 */
public class PlanPostPagoMinutosMegasEconomico extends PlanCelular {

    private double minutos;
    private double costoMin;
    private double megasMin;
    private double cosGigas;
    private double descuento;

    public PlanPostPagoMinutosMegasEconomico(Propietario p,
            String m, String c, String mod, String num, double min, double cos,
            double megMin, double cosGi, double des) {
        super(p, m, c, mod, num);

        minutos = min;
        costoMin = cos;
        megasMin = megMin;
        cosGigas = cosGi;
        descuento = des;
    }

    @Override
    public void establecerPagoMensual() {
         double prepago = (minutos*costoMin)+(megasMin*cosGigas);
         double porcentaje = prepago* descuento;
         pagMen = prepago - porcentaje;
         
    }

    public void establecerMinutos(double n) {
        minutos = n;
    }

    public void establecerCostoMin(double n) {
        costoMin = n;
    }

    public void establecerMegasMin(double n) {
        megasMin = n;
    }

    public void establecerCostoGigas(double n) {
        cosGigas = n;
    }

    public void establecerDescuento(double n) {
        descuento = n;
    }

    public double obtenerMinutos() {
        return minutos;
    }

    public double obtenerCostoMin() {
        return costoMin;
    }

    public double obtenerMegasMin() {
        return megasMin;
    }

    public double obtenerCostoGigas() {
        return cosGigas;
    }

    public double obtenerDescuento() {
        return descuento;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s\n"
                + "\tMinutos: %.2f\n\tCosto Minutos: %.2f\n\tGigas: %.2f\n"
                + "\tCosto Gigas: %.2f\n\tDescuento: %.2f\n"
                + "\tPago Mensual: %.2f", super.toString(), 
                minutos,
                costoMin, megasMin, cosGigas, descuento, pagMen);

        return cadena;
    }

}
