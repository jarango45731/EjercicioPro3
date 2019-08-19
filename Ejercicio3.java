import java.util.Scanner;
import java.util.Vector;

/* 
Escriba un programa en Java que permita crear dos vectores o listas A y B de tamaños N y P
respectivamente, y a partir de estos dos, crear un tercer vector o lista C, el cual contengo los elementos
no comunes (no repetidos) de A y B, sin que queden valores repetidos en C.
Ejemplo:
Si A es [1, 4, 5, 8, 9]
Y B es [1, 5, 6, 7, 8, 11, 20]
El resultado, C, sería: [4, 6, 7, 9, 11, 20]. Nótese que los elemento 1, 5 y 8 no están en el vector resultado,
ya que están repetidos en ambos vectores.
*/
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> listaA = obtenerLista(sc);
        Vector<Integer> listaB = obtenerLista(sc);
        Vector<Integer> listaC = new Vector<Integer>();
        int longitudA = listaA.size();
        int longitudB = listaB.size();
        int mayor = longitudA > longitudB ? longitudA : longitudB;
        for (int i = 0; i < mayor; i++) {
            if (i < longitudA) {
                int valorA = listaA.get(i);
                if (!listaC.contains(valorA) && !listaB.contains(valorA)) {
                    listaC.add(valorA);
                }
            }
            if (i < longitudB) {
                int valorB = listaB.get(i);
                if (!listaC.contains(valorB) && !listaA.contains(valorB)) {
                    listaC.add(valorB);
                }
            }
        }
        System.out.println("Resultado C: " + listaC);
    }

    static Vector<Integer> obtenerLista(Scanner sc) {
        System.out.println("Ingrese una lista de numeros separados por coma (,):");
        String[] listaString = sc.nextLine().split(",");
        Vector<Integer> lista = new Vector<Integer>();
        for (int i = 0; i < listaString.length; i++) {
            lista.add(Integer.parseInt(listaString[i]));
        }
        return lista;
    }
}