import java.util.Arrays;
import java.util.Scanner;

/* 
Escriba un programa en Java que solicite un número entero n, y luego lea el valor de cada uno de los n
números. El programa debe calcular el menor, el mayor y el promedio de todos los número leidos.
*/
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros:");
        int n = sc.nextInt();
        Double[] numeros = new Double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese un numero:");
            numeros[i] = sc.nextDouble();
        }
        
        Arrays.sort(numeros);
        Double menor = numeros[0];
        Double mayor = numeros[numeros.length - 1];
        Double suma = 0.0;
        for (Double numero : numeros) {
            suma += numero;
        }
        Double promedio = suma / numeros.length;

        System.out.println("Menor: " + menor);
        System.out.println("Mayor: " + mayor);
        System.out.println("Promedio: " + promedio);
    }
}