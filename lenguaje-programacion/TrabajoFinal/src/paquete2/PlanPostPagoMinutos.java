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
public class PlanPostPagoMinutos extends PlanCelular {

    private double minNacionales;
    private double costoMin;
    private double minInternacionales;
    private double cosInt;
    private double tarifaBase;

    public PlanPostPagoMinutos(Propietario p, String m, String c, String mod,
            String num, double mn, double cm, double mIn, double cosIn, double ta) {
        super(p, m, c, mod, num);
        minNacionales = mn;
        costoMin = cm;
        minInternacionales = mIn;
        cosInt = cosIn;
        tarifaBase = ta;

    }

    public void establecerMinNacionales(double x) {
        minNacionales = x;
    }

    public void establecerCostoMin(double x) {
        costoMin = x;
    }

    public void establecerMinInternacionales(double x) {
        minInternacionales = x;
    }

    public void establecerCosMinInternacionales(double x) {
        cosInt = x;
    }

    public void establecerTarifaBase(double x) {
        tarifaBase = x;
    }

    @Override
    public void establecerPagoMensual() {

        pagMen = (minNacionales * costoMin) + (minInternacionales + cosInt);
    }

    public double obtenerMinNacionales() {
        return minNacionales;
    }

    public double obtenerCostoMin() {
        return costoMin;
    }

    public double obtenerMinInternacionales() {
        return minInternacionales;
    }

    public double obtenerCosMinInternacionale() {

        return cosInt;
    }

    public double obtenerTarifaBase() {
        return tarifaBase;
    }

    @Override
    public String toString() {
        String cadena = String.format("\n%s"
                + "\tMinutos Nacionales: %.2f\n\tCosto Minutos: %.2f\n"
                + "\tMinutos Internacionales: %.2f\n"
                + "\tCosto: %.2f\n\tTarifa Base: %.2f\n"
                + "\tPago Mensual: %.2f",
                super.toString(),
                minNacionales, costoMin, minInternacionales, cosInt,
                tarifaBase, pagMen);

        return cadena;
    }
}
