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
		int opcion = 0;
		do {
			opcion = seleccionaOpcion();
			if (opcion < 5) {
				double result = realizarOperacion(opcion);
				pintarResultado(result);
			}
		} while (opcion < 5);
		System.out.println("Hasta pronto!");
	}

	public static int seleccionaOpcion() {
		int opcion = 0;
		do {
			System.out.println("Que operación desea realizar?");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Salir");
			opcion = Util.pedirInt("Escoge una opción: ");
			if (opcion < 1 || opcion > 5) {
				System.out.println("Opción erronia!!");
			}
		} while (opcion < 1 || opcion > 5);
		return opcion;
	}

	public static double realizarOperacion(int operacion) {
		double result = 0;
		double primerNumero = Util.pedirDouble("Primer numero de la operación:");
		double segundoNumero = Util.pedirDouble("Segundo numero de la operación:");
		switch (operacion) {
		case 1:
			result = suma(primerNumero, segundoNumero);
			break;
		case 2:
			result = resta(primerNumero, segundoNumero);
			break;
		case 3:
			result = multiplicacion(primerNumero, segundoNumero);
			break;
		case 4:
			if (segundoNumero == 0) {
				System.out.println("El divissor tiene que ser diferente de 0!");
				realizarOperacion(operacion);
			} else {
				result = division(primerNumero, segundoNumero);
			}
			break;
		default:
			break;
		}

		return result;
	}

	public static double suma(double primerNumero, double segundoNumero) {
		return primerNumero + segundoNumero;
	}

	public static double resta(double primerNumero, double segundoNumero) {
		return segundoNumero < 0 ? suma(primerNumero, segundoNumero) : primerNumero - segundoNumero;
	}

	public static double multiplicacion(double primerNumero, double segundoNumero) {
		return segundoNumero < 0 ? suma(primerNumero, segundoNumero) : primerNumero * segundoNumero;
	}

	public static double division(double primerNumero, double segundoNumero) {
		return segundoNumero < 0 ? suma(primerNumero, segundoNumero) : primerNumero / segundoNumero;
	}

	public static void pintarResultado(double resultado) {
		System.out.printf("El resultado final de la operación es %.2f\n", resultado);
	}
}
