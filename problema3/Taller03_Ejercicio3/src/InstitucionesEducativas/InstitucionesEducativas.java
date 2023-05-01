/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InstitucionesEducativas;

/**
 *
 * @author D E L L
 */
public class InstitucionesEducativas {
    // Declarar atributos
    
    private String nombre = "Institución X";
    private String tipo = "X"; 
    // Esta variables es para guardar el tipo de institución, que serían:
    // públicas, municipales, fiscomisionales y particulares
    private int num_alumnos = 0;
    private int num_lic = 0; // Esta variable es para el número de docentes
    private int num_sedes = 0;
    private double gastosXalum = 0.00; 
    // Esta variables es para los gatos proyectados por estudiante, que son más
    // o menos los gatos en servicios y materiales que cada estudiante va a usar
    private double presupuesto = 0.00;
    
    // Métodos establecer y obtener 
    public void establecerNombre(String name){
        nombre = name;
    }
    
    public void establecerTipo(String name){
        tipo = name;
    }
    
    public void establecerNumAlumnos(int n){
        num_alumnos = n;
    }
    
    public void establecerNumLic(int n){
        num_lic = n;
    }
    
    public void establecerNumSedes(int n){
        num_sedes = n;
    }
    
    public void establecerGastos(double n){
        gastosXalum = n;
    }
    
    public void establecerPresupuesto(double n){
        presupuesto = n;
    }   
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerTipo(){
        return tipo;
    }
    
    public int obtenerNumAlum(){
        return num_alumnos;
    }
    
    public int obtenerNumLic(){
        return num_lic;
    }
    
    public int obtenerNumSedes(){
        return num_sedes;
    }
    
    public double obtenerGatos(){
        return gastosXalum;
    }
    
    public double obtenerPresupuesto(){
            return presupuesto;
        }
    
    // Funciones ara calcular el presupuesto    
    // a=alumnos    g=gastos
    public double calcularPresupuesto(double a, double g){
        return a*g;
    }
}
