package eva3_5_captura;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EVA3_5_CAPTURA {

    public static void main(String[] args) {

        int x;

        do {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Introduce un valor (entero) de x: ");
                x = input.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("No se introdujo un número válido, vuelva a capturar");
            }

        } while (true);

        System.out.println("Valor de x = " + x);
    }

}
