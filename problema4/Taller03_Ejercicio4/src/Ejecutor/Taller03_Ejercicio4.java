/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejecutor;
import EquiposCelulares.EquiposCelulares;
/**
 *
 * @author D E L L
 */
public class Taller03_Ejercicio4 {
    
    public static void main(String[] args) {
        
        EquiposCelulares cel01 = new EquiposCelulares();
        
        String sistemaOp = "Android";
        double tamanioP = 5.6;
        double costoInicial = 1000.50;
        double iva = 12.0;
        double ivaCostoInicial = cel01.calcularIvaCostoInicial(iva, costoInicial);
        double costoFinal = cel01.calcularCostoFinal(ivaCostoInicial, costoInicial);
        String direccMAC = "00:1B:44:11:3A:B7";
        String infIMEI = "010928/00/389023/3";
        
        cel01.establecerSistemaOP(sistemaOp);
        cel01.establecerTamanioP(tamanioP);
        cel01.establecerCostoInicial(costoInicial);
        cel01.establecerIva(iva);
        cel01.establecerIvaDelCostoInicial(ivaCostoInicial);
        cel01.establecerCostoFinal(costoFinal);
        cel01.establecerDirccMAC(direccMAC);
        cel01.establecerInfIMEI(infIMEI);
        
        System.out.println("Celular Uno");
        System.out.printf(" Sistema Operativo: %s\n"
                + " Tamaño de la Pantalla: %.2f pulgadas \n"
                + " Costo Inicial: $ %.2f\n"
                + " Iva (porcentaje): %.2f\n"
                + " Iva del Costo Inicial: $ %.2f\n"
                + " Costo Final: $ %.2f\n"
                + " Dirección MAC: %s\n"
                + " Información IMEI: %s\n",cel01.obtenerSistemaOp(),
                cel01.obtenerTamanioP(),cel01.obtenerCostoInicial(),
                cel01.obtenerIva(),cel01.obtenerIvaCostoInicial(),
                cel01.obtenerCostoFinal(),cel01.obtenerDirccMAC(),
                cel01.obtenerInfoIMEI());
        
        EquiposCelulares cel02 = new EquiposCelulares();
        
        sistemaOp = "iOS";
        tamanioP = 4.3;
        costoInicial = 500.50;
        iva = 12.0;
        ivaCostoInicial = cel01.calcularIvaCostoInicial(iva, costoInicial);
        costoFinal = cel01.calcularCostoFinal(ivaCostoInicial, costoInicial);
        direccMAC = "00:1e:67:09:3B:e7";
        infIMEI = "034517/45/096394/3";
        
        cel02.establecerSistemaOP(sistemaOp);
        cel02.establecerTamanioP(tamanioP);
        cel02.establecerCostoInicial(costoInicial);
        cel02.establecerIva(iva);
        cel02.establecerIvaDelCostoInicial(ivaCostoInicial);
        cel02.establecerCostoFinal(costoFinal);
        cel02.establecerDirccMAC(direccMAC);
        cel02.establecerInfIMEI(infIMEI);
        
        System.out.println("-----------------------------------------------");
        System.out.println("Celular Dos");
        System.out.printf(" Sistema Operativo: %s\n"
                + " Tamaño de la Pantalla: %.2f pulgadas \n"
                + " Costo Inicial: $ %.2f\n"
                + " Iva (porcentaje): %.2f\n"
                + " Iva del Costo Inicial: $ %.2f\n"
                + " Costo Final: $ %.2f\n"
                + " Dirección MAC: %s\n"
                + " Información IMEI: %s\n",cel02.obtenerSistemaOp(),
                cel02.obtenerTamanioP(),cel02.obtenerCostoInicial(),
                cel02.obtenerIva(),cel02.obtenerIvaCostoInicial(),
                cel02.obtenerCostoFinal(),cel02.obtenerDirccMAC(),
                cel02.obtenerInfoIMEI());
    }
    
}
