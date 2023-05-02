/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EquiposCelulares;

/**
 *
 * @author D E L L
 */
public class EquiposCelulares {       
    private String sistemaOp="X";
    private double tamanioP=0.00;
    private double costoInicial=0.00;
    private double iva=0.00;
    private double ivaCostoInicial=0.00;
    private double costoFinal=0.00;
    private String direccMAC="X";
    private String infIMEI="X";

    public void establecerSistemaOP (String name){
        sistemaOp = name;
    }

    public void establecerDirccMAC (String name){
        direccMAC = name;
    }

    public void establecerInfIMEI (String name){
        infIMEI = name;
    }

    public void establecerTamanioP (double n){
        tamanioP = n;
    }

    public void establecerCostoInicial (double n){
        costoInicial = n;
    }

    public void establecerIva (double n){
        iva = n;
    }

    public void establecerIvaDelCostoInicial (double n){
        ivaCostoInicial = n;
    }

    public void establecerCostoFinal (double n){
        costoFinal = n;
    }

    public String obtenerSistemaOp () {
        return sistemaOp;
    }

    public String obtenerDirccMAC () {
        return direccMAC;
    }

    public String obtenerInfoIMEI () {
        return infIMEI;
    }

    public double obtenerTamanioP () {
        return tamanioP;
    }

    public double obtenerCostoInicial () {
        return costoInicial;
    }

    public double obtenerIva () {
        return iva;
    }

    public double obtenerIvaCostoInicial () {
        return ivaCostoInicial;
    }

    public double obtenerCostoFinal () {
        return costoFinal;
    }

    // Función para calcular el iva del costo inicial
    public double calcularIvaCostoInicial (double i, double ci) {
        return ((i/100)+ci);
    }
    
    // Función para calcular el Costo final
    public double calcularCostoFinal (double a, double ci) {
        return a+ci;
    }
}
