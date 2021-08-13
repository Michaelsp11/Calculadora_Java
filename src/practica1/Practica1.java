/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import Util.Util;

/**
 *
 * @author MichaelSP
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bienvenido!");
        int option = 0;
        do {
            option = seleccionaOpcion();
            if (option < 5) {
                double result = realizarOperacion(option);
                pintarResultado(result);
            }
        } while (option < 5);
        System.out.println("Hasta pronto!");
    }

    public static int seleccionaOpcion() {
        int option = 0;
        do {
            System.out.println("Que operación desea realizar?");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            option = Util.demanarInt("Escoge una opción: ");
            if (option < 1 || option > 5) {
                System.out.println("Opción erronia!!");
            }
        } while (option < 1 || option > 5);
        return option;
    }

    public static double realizarOperacion(int operacion) {
        double result = 0;
        double primerNumero = Util.pedirDouble("Primer numero de la operación:");
        double segundoNumero = Util.pedirDouble("Segundo numero de la operación:");
        switch (operacion) {
            case 1:
                result = primerNumero + segundoNumero;
                break;
            case 2:
                result = segundoNumero < 0? primerNumero + segundoNumero : primerNumero - segundoNumero;
                break;
            case 3:
                result = segundoNumero < 0? primerNumero + segundoNumero : primerNumero * segundoNumero;
                break;
            case 4:
                if (segundoNumero == 0) {
                    System.out.println("El divissor tiene que ser diferente de 0!");
                    realizarOperacion(operacion);
                } else {
                    result = segundoNumero < 0 ? primerNumero + segundoNumero : primerNumero / segundoNumero; 
                }
                break;
            default:
                break;
        }

        return result;
    }

    public static void pintarResultado(double resultado) {
        System.out.printf("El resultado final de la operación es %.2f\n", resultado);
    }
}
