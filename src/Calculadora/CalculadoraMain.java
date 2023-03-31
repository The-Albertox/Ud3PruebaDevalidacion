package Calculadora;

import Calculadora.FactorialDeN.FactorialDeN;
import Calculadora.MediaHastaN.MediaHastaN;
import Calculadora.ObtenerPasosDeFibonacci.ObtenerPasosDeFibonacci;

import java.util.Scanner;

public class CalculadoraMain {

    static final Scanner TECLADO = new Scanner(System.in);
    int factorial = factorialDeN();
    int media = mediaHastaN();
    int fibonacci  = pasosDeFibonacci();

    public static void main(String[] args) {
        String menu = "";
        while (!menu.equals("D")) {
            System.out.println("a. introduzac un valor N para devolver todo los numeros comprendidos entre 1 y N");
            System.out.println("b. debe dar un parametro positivo N y s ele calculara la media de los nuemros comprendiods entre 1 y N ");
            System.out.println("c. introduzca un valor positivo N y se le devolcera la solucion de Fibonacci");
            menu = TECLADO.next();

            switch (menu) {
                case "a":
                    factorialDeN();
                    break;
                case "b":
                    mediaHastaN();
                    break;
                case "c":
                    pasosDeFibonacci();
                    break;

            }
        }

    }

    public static int factorialDeN() {
        int n = TECLADO.nextInt();
        int numero = 1;
        for (int i = 1; i <= n; i++) {
            numero *= i;
        }
        System.out.println("Factorial de " + n + ": " + numero );
        return numero;
    }

    public static int mediaHastaN() {
        int n = TECLADO.nextInt();
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        System.out.println("Media hasta " + n + ": " + suma/n );
        return  suma / n;
    }

    public static int pasosDeFibonacci() {
        int n = TECLADO.nextInt();
        int[] resultado = new int[n];
        if (n >= 1) {
            resultado[0] = 0;
        }
        if (n >= 2) {
            resultado[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            resultado[i] = resultado[i-1] + resultado[i-2];
        }
        System.out.println("los pasoas de fibonicci" + n + "" );

        return n;
    }

}
