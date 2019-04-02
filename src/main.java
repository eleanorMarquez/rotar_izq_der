
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        nodoDE n1 = new nodoDE();
        nodoDE w = new nodoDE(0);
        nodoDE w1 = new nodoDE(1);
        nodoDE w2 = new nodoDE(2);
        n1.append(w);
        n1.append(w1);
        n1.append(w2);

        Scanner temp = new Scanner(System.in);
        System.out.println("¿Cuantos movimientos desea rotar la lista?");
        int n = temp.nextInt();

        n1.mostrar();
        System.out.println("");
        int c = 0;
        do {
            Scanner p = new Scanner(System.in);
            System.out.println("Presione I para rotar a la izquierda o D para rotar a la derecha en caso contrario la lista no rotara");
            String s = p.next();
            if ("I".equals(s) || "i".equals(s)) {
                n1.RotarIzq();
                n1.mostrar();
                c++;
                System.out.println("");
            } else if ("D".equals(s) || "d".equals(s)) {
                n1.RotarDer();
                n1.mostrar();
                c++;
                System.out.println("");
            } else {
                System.out.println("No es la opción correcta intente de nuevo");
                n1.mostrar();
                c++;
                System.out.println("");
            }

        } while (c < n);

    }

}
