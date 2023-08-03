package T2.n2ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {
    private static Scanner sc = new Scanner(System.in);

    // InputMismatchException
    public static byte leerByte(String mensaje) {
        byte b = 0;
        boolean datoCorrecto = false;
        do {
            System.out.println(mensaje);
            try {
                b = sc.nextByte();
                datoCorrecto = true;
            } catch (InputMismatchException e) {
                System.out.println("Número incorrecto");
            }
            sc.nextLine();
        } while (!datoCorrecto);
        return b;
    }

    public static int leerInt(String mensaje) {
        int i = 0;
        boolean datoCorrecto = false;
        do {
            System.out.println(mensaje);
            try {
                i = sc.nextInt();
                datoCorrecto = true;
            } catch (InputMismatchException e) {
                System.out.println("Número incorrecto");
            }
            sc.nextLine();
        } while (!datoCorrecto);
        return i;
    }

    public static float leerFloat(String mensaje) {
        float f = 0.0f;
        boolean datoCorrecto = false;
        do {
            System.out.println(mensaje);
            try {
                f = sc.nextFloat();
                datoCorrecto = true;
            } catch (InputMismatchException e) {
                System.out.println("Error de formato");
            }
            sc.nextLine();
        } while (!datoCorrecto);
        return f;
    }

    public static double leerDouble(String mensaje) {
        double d = 0.0;
        boolean datoCorrecto = false;
        do {
            System.out.println(mensaje);
            try {
                d = sc.nextDouble();
                datoCorrecto = true;
            } catch (InputMismatchException e) {
                System.out.println("Error de formato");
            }
            sc.nextLine();
        } while (!datoCorrecto);
        return d;
    }

    // Exception

    public static char leerChar(String mensaje) {
        char c = ' ';
        boolean datoCorrecto = false;
        do {
            System.out.println(mensaje);
            try {
                c = sc.next(".").charAt(0);
                datoCorrecto = true;
            } catch (Exception e) {
                System.out.println("Solamente un caracter");
            }
            sc.nextLine();
        } while (!datoCorrecto);
        return c;
    }

    public static String leerString(String mensaje) {
        String s = "";
        boolean datoCorrecto = false;
        do {
            System.out.println(mensaje);
            try {
                s = sc.nextLine();
                datoCorrecto = true;
            } catch (InputMismatchException e) {
                System.out.println("Error de formato");
            }
        } while (!datoCorrecto);
        return s;
    }

    public static boolean leerSiNo(String mensaje) {
        char letra = ' ';
        boolean datoCorrecto = false;
        boolean r = false;
        do {
            System.out.println(mensaje);
            try {
                letra = sc.next(".").charAt(0);
                if (letra == 's' || letra == 'S') {
                    r = true;
                    datoCorrecto = true;
                } else if (letra == 'n' || letra == 'N') {
                    r = false;
                    datoCorrecto = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("La letra introducida es incorrecta");
            }
            sc.nextLine();
        } while (!datoCorrecto);
        return r;
    }
}
