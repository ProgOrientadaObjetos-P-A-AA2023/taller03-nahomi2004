/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejecutor;
import InstitucionesEducativas.InstitucionesEducativas;
/**
 *
 * @author D E L L
 */
public class Taller03_Ejercicio3 {
    
    public static void main(String[] args) {
        
        // Declarar variables y crear objeto uno
        InstitucionesEducativas institucion01 = new InstitucionesEducativas();
        
        String nombre = "COLEGIO DE BACHILLERATO PARTICULAR SAN GERARDO";
        String tipo = "Particular";
        int num_alumnos = 1500;
        int num_lic = 250;
        int num_sedes = 1;
        double gastosXalum = 1500.50;
        double presupuesto = institucion01.calcularPresupuesto(num_alumnos, gastosXalum);
        
        institucion01.establecerNombre(nombre);
        institucion01.establecerTipo(tipo);
        institucion01.establecerNumAlumnos(num_alumnos);
        institucion01.establecerNumLic(num_lic);
        institucion01.establecerNumSedes(num_sedes);
        institucion01.establecerGastos(gastosXalum);
        institucion01.establecerPresupuesto(presupuesto);
        
        System.out.println("Institución Uno");
        System.out.printf(" Nombre: %s\n Tipo de institución: %s\n"+
                " Número de Alumnado: %d\n Número de Docentes: %d\n"
                + " Número de Sedes: %d\n Gatos Proyectados por alumno: %.2f\n"
                + " Presupuesto: %.2f\n",institucion01.obtenerNombre(),
                institucion01.obtenerTipo(),
                institucion01.obtenerNumAlum(),
                institucion01.obtenerNumLic(),
                institucion01.obtenerNumSedes(),
                institucion01.obtenerGatos(),
                institucion01.obtenerPresupuesto());
        
        // Crear objeto dos
        InstitucionesEducativas institucion02 = new InstitucionesEducativas();
        
        nombre = "ESCUELA DE EDUCACIÓN BÁSICA FISCOMISIONAL EDUVIGES PORTALET";
        tipo = "Fiscomisional";
        num_alumnos = 1000;
        num_lic = 100;
        num_sedes = 1;
        gastosXalum = 500.50;
        presupuesto = institucion02.calcularPresupuesto(num_alumnos, gastosXalum);
        
        institucion02.establecerNombre(nombre);
        institucion02.establecerTipo(tipo);
        institucion02.establecerNumAlumnos(num_alumnos);
        institucion02.establecerNumLic(num_lic);
        institucion02.establecerNumSedes(num_sedes);
        institucion02.establecerGastos(gastosXalum);
        institucion02.establecerPresupuesto(presupuesto);
        
        System.out.println("-----------------------------------------------"+
                "-----------------------------------------------");
        System.out.println("Institución Dos");
        System.out.printf(" Nombre: %s\n Tipo de institución: %s\n"+
                " Número de Alumnado: %d\n Número de Docentes: %d\n"
                + " Número de Sedes: %d\n Gatos Proyectados por alumno: %.2f\n"
                + " Presupuesto: %.2f\n",institucion02.obtenerNombre(),
                institucion02.obtenerTipo(),
                institucion02.obtenerNumAlum(),
                institucion02.obtenerNumLic(),
                institucion02.obtenerNumSedes(),
                institucion02.obtenerGatos(),
                institucion02.obtenerPresupuesto());
    }
    
}
