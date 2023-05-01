/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejecutor;
import Convertidor.EquivalenteHora;
/**
 *
 * @author D E L L
 */
public class Taller03_Ejercicio2 {
    public static void main(String[] args) {
        
        // Declaro variables a utilizar y de una vez convierto las horas en
        // segundos, minutos y días
        EquivalenteHora reloj01 = new EquivalenteHora();
        double horas =5.5;
        double minutos = reloj01.equivalenteMinutos(horas);
        double segundos = reloj01.equivalenteSegundos(horas);
        double dias = reloj01.equivalenteDias(horas);
        
        reloj01.establecerHoras(horas);      
        reloj01.establecerMinutos(minutos);
        reloj01.establecerSegundos(segundos);
        reloj01.establecerDias(dias);
        
        System.out.println("Conversión Uno");
        System.out.printf(" Horas: %.2f\n Minutos: %.2f\n"+
                " Segundos: %.2f\n Días: %.2f\n",
                reloj01.obtenerHoras(), reloj01.obtenerMinutos(),
                reloj01.obtenerSegundos(), reloj01.obtenerDias());
        
        // Creo el objeto dos
        EquivalenteHora reloj02 = new EquivalenteHora();
        
        horas =1.5;
        minutos = reloj02.equivalenteMinutos(horas);
        segundos = reloj02.equivalenteSegundos(horas);
        dias = reloj02.equivalenteDias(horas);
        
        reloj02.establecerHoras(horas);      
        reloj02.establecerMinutos(minutos);
        reloj02.establecerSegundos(segundos);
        reloj02.establecerDias(dias);
        
        System.out.println("-------------------------------------");
        System.out.println("Conversión Dos");
        System.out.printf(" Horas: %.2f\n Minutos: %.2f\n"+
                " Segundos: %.2f\n Días: %.2f\n",
                reloj02.obtenerHoras(), reloj02.obtenerMinutos(),
                reloj02.obtenerSegundos(), reloj02.obtenerDias());
    }
    
}
