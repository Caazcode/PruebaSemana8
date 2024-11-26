/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebasemana8;

/**
 *
 * @author adrianaguilar
 */
import java.util.Scanner;

public class Anuealidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Ingrese la renta o pago por período (R):");
        double renta = scanner.nextDouble();

        System.out.println("Ingrese la tasa de interés (i) en formato decimal:");
        double tasaInteres = scanner.nextDouble();

        System.out.println("Ingrese el número de pagos (n):");
        int numPagos = scanner.nextInt();

        System.out.println("Seleccione el tipo de anualidad:");
        System.out.println("1. Ordinaria");
        System.out.println("2. Anticipada");
        int tipoAnualidad = scanner.nextInt();

        
        double valorPresente = 0;
        if (tipoAnualidad == 1) {
            valorPresente = calcularAnualidadOrdinaria(renta, tasaInteres, numPagos);
        } else if (tipoAnualidad == 2) {
            valorPresente = calcularAnualidadAnticipada(renta, tasaInteres, numPagos);
        } else {
            System.out.println("Opción no válida.");
            scanner.close();
            return;
        }

        
        System.out.println("El valor actual de la anualidad es: " + valorPresente);

        scanner.close();
    }

    
    public static double calcularAnualidadOrdinaria(double renta, double tasaInteres, int numPagos) {
        return renta * ((1 - Math.pow(1 + tasaInteres, -numPagos)) / tasaInteres);
    }

    
    public static double calcularAnualidadAnticipada(double renta, double tasaInteres, int numPagos) {
        return renta * (1 + tasaInteres) * ((1 - Math.pow(1 + tasaInteres, -numPagos)) / tasaInteres);
    }
}
