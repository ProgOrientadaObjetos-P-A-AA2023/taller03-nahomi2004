/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Terreno;

/**
 *
 * @author D E L L
 */
public class Terreno {
    
    private double costo_terreno=0.00;
    private double ancho=0.00;
    private double largo=0.00;
    private double area=0.00;
    private double valor_m2=0.00;
        
    // Métodos estabelcer y obtener de los atributos
        
    public void establecerCostoTerreno(double n){
        costo_terreno = n;
    }
    
    public void establecerAncho(double n){
        ancho = n;
    }
    
    public void establecerLargo(double n){
        largo = n;
    }
    
    public void establecerArea(double n){
        area = n;
    }
    
    public void establecerValor_m2(double n){
        valor_m2 = n;
    }
    
    public double obtenerCostoTerreno(){
        return costo_terreno;
    }
    
    public double obtenerAncho(){
        return ancho;
    }
    
    public double obtenerLargo(){
        return largo;
    }
    
    public double obtenerArea(){
        return area;
    }
    
    public double obtenerValor_m2(){
        return valor_m2;
    }
    
    // Funciones para calcular el área y el costo del terreno
    // El área es igual a base por altura que en esete caso sería largo*ancho
    public double calcularArea (double l, double a) {
        return l*a;
    }
    
    // El costo del terreno está dado por el valor del matro cuadrado
    // por el número de metros cuadrados que haya (área)
    public double calcularCostoTerreno (double a, double v) {
        return a*v;
    }
}
