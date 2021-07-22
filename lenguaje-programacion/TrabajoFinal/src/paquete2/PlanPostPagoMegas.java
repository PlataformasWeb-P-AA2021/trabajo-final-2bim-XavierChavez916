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
 * @author USUARIO
 */
public class PlanPostPagoMegas extends PlanCelular{

    private double megasGigas;
    private double costoGigas;
    private double tarifaBase;

    public PlanPostPagoMegas(Propietario p, String m, String c, String mod,
            String num, double mg, double cj, double tb) {
        super(p, m, c, mod, num);
        megasGigas = mg;
        costoGigas = cj;
        tarifaBase = tb;

    }

    public void establecerMegasGigas(double x) {
        megasGigas = x;
    }

    public void establecerCostoGigas(double x) {
        costoGigas = x;
    }

    public void establecerTarifaBase(double x) {
        tarifaBase = x;
    }

    @Override
    public void establecerPagoMensual() {

         pagMen = (megasGigas*costoGigas)+tarifaBase;
    }

    public double obtenerMegasGigas() {
        return megasGigas;
    }

    public double obtenerCostoGigas() {
        return costoGigas;
    }

    public double obtenerTarifaBase() {
        return tarifaBase;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s\n\t"
                + "Megas expresado en gigas: %s\n\t"
                + "Costo por cada gigas:%s\n\t"
                + "Tarifa base: %s\n\t"
                + "Pago Mensual: %.2f",
                super.toString(),
                obtenerMegasGigas(),
                obtenerCostoGigas(),
                obtenerTarifaBase(),
                pagMen);

        return cadena;
    }
}
