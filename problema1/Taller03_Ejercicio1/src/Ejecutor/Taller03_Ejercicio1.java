/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejecutor;

import Terreno.Terreno;

public class Taller03_Ejercicio1 {
    
    public static void main(String[] args) {
        
        // Creación del objeto número 1
        Terreno terreno = new Terreno();
        // Creo las variables que van a servir a ambos, pero que van a tener
        // diferentes valores
        
        double ancho = 5.00;
        double largo = 10.00;
        double valor_m2 = 15.00;
        double area;
        double costo_terreno;
        
        area = terreno.calcularArea(largo,ancho);
        costo_terreno = terreno.calcularCostoTerreno(area, valor_m2);
        
        terreno.establecerAncho(ancho);
        terreno.establecerLargo(largo);
        terreno.establecerValor_m2(valor_m2);     
        terreno.establecerArea(area);
        terreno.establecerCostoTerreno(costo_terreno);      
        
        
        System.out.println("Información del Terreno en Vilcabamba");
        System.out.printf(" Ancho: %.2f\n Largo: %.2f\n"+
                " Valor por metro cuadrado %.2f\n Area: %.2f\n"+
                " Costo Terreno: %.2f\n",
                terreno.obtenerAncho(), terreno.obtenerLargo(),
                terreno.obtenerValor_m2(), terreno.obtenerArea(),
                terreno.obtenerCostoTerreno());
             
        // Creación del objeto número 2
        Terreno terreno2 = new Terreno();
        
        // Cambio el valor de las variables anteriormente creadas
        ancho = 40.00;
        largo = 10.00;
        valor_m2 = 13.00;
        
        area = terreno2.calcularArea(largo,ancho);
        costo_terreno = terreno2.calcularCostoTerreno(area, valor_m2);
        
        // Establezco las variables nuevamente para poder mostrar su nuevo valor
        terreno2.establecerAncho(ancho);
        terreno2.establecerLargo(largo);
        terreno2.establecerValor_m2(valor_m2);     
        terreno2.establecerArea(area);
        terreno2.establecerCostoTerreno(costo_terreno);      
        
        System.out.println("-------------------------------------");
        System.out.println("Información del Terreno en Malacatos");
        System.out.printf(" Ancho: %.2f\n Largo: %.2f\n"+
                " Valor por metro cuadrado %.2f\n Area: %.2f\n"+
                " Costo Terreno: %.2f\n",
                terreno2.obtenerAncho(), terreno2.obtenerLargo(),
                terreno2.obtenerValor_m2(), terreno2.obtenerArea(),
                terreno2.obtenerCostoTerreno());
    }
    
}
