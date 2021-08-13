/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.util.Scanner;

/**
 *
 * @author michael
 */
public class Util {

    public static double pedirDouble(String texte) {
        Scanner teclat = new Scanner(System.in);
        boolean correcto = false;
        double n1 = 0;
        do {
            System.out.print(texte);
            if (teclat.hasNextDouble()) {
                n1 = teclat.nextDouble();
                correcto = true;
            } else {
                System.out.println("Error");
            }
            teclat.nextLine();
        } while (!correcto);
        return n1;
    }

    public static int demanarInt(String texte) {
        Scanner teclat = new Scanner(System.in);
        boolean correcto = false;
        int num = 0;
        do {
            System.out.print(texte);
            if (teclat.hasNextInt()) {
                num = teclat.nextInt();
                correcto = true;
            } else {
                System.out.println("Error, introduzca un número entero!");
            }
            teclat.nextLine();
        } while (!correcto);

        return num;
    }

    public static char demanarChar(String texte) {
        Scanner teclat = new Scanner(System.in);
        boolean correcto = false;
        String paraula;
        char lletra = ' ';
        do {
            System.out.print(texte);
            paraula = teclat.nextLine().toLowerCase();
            if (paraula.length() == 1) {
                lletra = paraula.charAt(0);
                correcto = true;
            } else {
                System.out.println("Error");
            }
        } while (!correcto);
        return lletra;
    }

    public static char demanarSexe(String texte) {
        Scanner teclat = new Scanner(System.in);
        boolean correcto = false;
        char sex = ' ';
        do {
            sex = demanarChar(texte);
            if (sex == 'h' || sex == 'd') {
                correcto = true;
            } else {
                System.out.println("Error, especifica sexe");
            }
        } while (sex != 'h' && sex != 'd');
        return sex;
    }

    public static String demanarString(String texte) {
        Scanner teclat = new Scanner(System.in);
        String str;
        boolean verstring = false;
        do {
            System.out.print(texte);
            str = teclat.nextLine();
            if (str.length() == 0) {
                System.out.println("Error");
            }
        } while (str.length() == 0);
        return str;
    }

    public static int demanaIntPositiu(String texte) {
        int quant = 1;
        do {
            quant = Util.demanarInt(texte);
            if (quant < 0) {
                System.out.println("Error!! Vui un número positiu");
            }
        } while (quant < 0);
        return quant;
    }

    public static double demanaDoublePositiu(String texte) {
        double quant = 1;
        do {
            quant = Util.pedirDouble(texte);
            if (quant < 0) {
                System.out.println("Error!! Quiero un número positivo");
            }
        } while (quant < 0);
        return quant;
    }

    public static double demanaDoubleInterval(String texte, double min, double max) {
        double val = 0;
        do {
            val = Util.pedirDouble(texte);
            if (val < min || val > max) {
                System.out.printf("Error!!.Viu un número entre %.2f i %.2f\n", min, max);
            }
        } while (val < min || val > max);
        return val;
    }
}
