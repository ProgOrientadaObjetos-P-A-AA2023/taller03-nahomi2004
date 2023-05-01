/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Convertidor;

/**
 *
 * @author D E L L
 */
public class EquivalenteHora {
    private double horas=0.00;
    private double minutos=0.00;
    private double segundos=0.00;
    private double dias=0.00;
    
    // Métodos estabelcer y obtener de los atributos
    
    public void establecerHoras(double n){
        horas = n;
    }
    
    public void establecerMinutos(double n){
        minutos = n;
    }
    
    public void establecerSegundos(double n){
        segundos = n;
    }
    
    public void establecerDias(double n){
        dias = n;
    }
    
    public double obtenerHoras(){
        return horas;
    }
    
    public double obtenerMinutos(){
        return minutos;
    }
    
    public double obtenerSegundos(){
        return segundos;
    }
    
    public double obtenerDias(){
        return dias;
    }
    
    // Funciones para calcular el equivalente de horas, en minutos, segundos,
    // días
    
    public double equivalenteMinutos (double h) {
        return h*60;
    }
    
    public double equivalenteSegundos (double h) {
        return h*3600;
    }
    
    public double equivalenteDias (double h) {
        return h/24;
    }
}
