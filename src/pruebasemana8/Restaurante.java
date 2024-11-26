/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebasemana8;

import java.util.Scanner;

public class Restaurante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Ingrese el precio de la comida económica el dia de hoy:");
        double precioEconomica = scanner.nextDouble();
        System.out.println("Ingrese el precio de la comida regular del dia de hoy:");
        double precioRegular = scanner.nextDouble();
        System.out.println("Ingrese el precio de la comida premium el dia de hoy:");
        double precioPremium = scanner.nextDouble();
        System.out.println("Ingrese el precio del extra encurtido el dia de hoy:");
        double precioEncurtido = scanner.nextDouble();
        System.out.println("Ingrese el precio del extra tortilla el dia de hoy:");
        double precioTortillas = scanner.nextDouble();
        System.out.println("Ingrese el precio del extra aguacate el dia de hoy:");
        double precioAguacate = scanner.nextDouble();


        
        int[] ventasTotales = {0, 0, 0}; 
        double totalDelDia = 0;

        String continuar = null;

        do {
            
            scanner.nextLine(); 
            System.out.println("Ingrese su nombre completo:");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese su dirección:");
            String direccion = scanner.nextLine();
            System.out.println("Ingrese su número de teléfono:");
            String telefono = scanner.nextLine();

            
            System.out.println("Seleccione el tipo de comida:");
            System.out.println("1. Económica");
            System.out.println("2. Regular");
            System.out.println("3. Premium");
            int tipoComida = scanner.nextInt();

            System.out.println("Seleccione si desea Extras:");
            System.out.println("1. Encurtido");
            System.out.println("2. Tortillas");
            System.out.println("3. Aguacate");
            int tipoExtras = scanner.nextInt();
            
            
            double precioComida = 0;
            switch (tipoComida) {
                case 1:
                    precioComida = precioEconomica;
                    ventasTotales[0]++;
                    break;
                case 2:
                    precioComida = precioRegular;
                    ventasTotales[1]++;
                    break;
                case 3:
                    precioComida = precioPremium;
                    ventasTotales[2]++;
                    break;
                default:
                    System.out.println("Opción no válida.");
                    continue;
            }

            
            System.out.println("¿Es cliente frecuente? (si/no):");
            scanner.nextLine();
            String clienteFrecuente = scanner.nextLine();
            System.out.println("¿Es cliente de la tercera edad? (si/no):");
            String terceraEdad = scanner.nextLine();

            double descuento = 0;
            if (clienteFrecuente.equalsIgnoreCase("si")) {
                descuento = 0.15; 
            }
            if (terceraEdad.equalsIgnoreCase("si")) {
                descuento = 0.25;
            }

            
            double totalAPagar = precioComida - (precioComida * descuento);
            totalDelDia += totalAPagar;

            System.out.println("El total a pagar para " + nombre + " es: L " + totalAPagar);

            
            System.out.println("¿Desea continuar con otro pedido? (si/no):");
            continuar = scanner.nextLine();

        } while (continuar.equalsIgnoreCase("si"));

        
        System.out.println("\nResumen de Ventas:");
        System.out.println("Comidas económicas vendidas: " + ventasTotales[0]);
        System.out.println("Comidas regulares vendidas: " + ventasTotales[1]);
        System.out.println("Comidas premium vendidas: " + ventasTotales[2]);
        System.out.println("Total del día: L " + totalDelDia);

        scanner.close();
    }
}
