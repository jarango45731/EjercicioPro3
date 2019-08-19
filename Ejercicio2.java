import java.util.Scanner;

/* 
Escriba un programa en Java que lea un conjunto de n números double, los almacene en un arreglo o
lista, y luego calcule la desviación estándar de esos números, representada por la siguiente expresión
matemática:
*/
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros:");
        int n = sc.nextInt();
        Double[] numeros = new Double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese un numero:");
            numeros[i] = sc.nextDouble();
        }

        System.out.println("Desviacion estandar: " + desviacionEstandar(numeros));
    }

    static Double promedio(Double[] numeros) {
        Double suma = 0.0;
        for (Double numero : numeros) {
            suma += numero;
        }
        return suma / numeros.length;
    }

    static Double desviacionEstandar(Double[] numeros) {
        Double promedio = promedio(numeros);
        Double suma = 0.0;
        for (int i = 0; i < numeros.length; i++) {
            suma += Math.pow(numeros[i] - promedio, 2);
        }
        return Math.sqrt(suma / numeros.length);
    }
}