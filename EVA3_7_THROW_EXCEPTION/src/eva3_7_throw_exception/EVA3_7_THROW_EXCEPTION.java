package eva3_7_throw_exception;

import java.util.InputMismatchException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class EVA3_7_THROW_EXCEPTION {

    
    public static void main(String[] args) {
       Prueba obj = new Prueba();
       //checked: es forzoso atenderlas
       //uncheked: errores de lógica, no es forzoso resolverlas
       //int resu = 5/0;
        try {
            obj.capturaMayorCero(100);
            System.out.println("Introduce un valor");
            Scanner input = new Scanner(System.in);
            int valor = input.nextInt();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        //ARITHMETIC EXCEPTION ES "UNCHECKED" Y NO ES OBLIGATORIO RESOLVERLO
        //CAPTURA LA EXCEPCIÓN
        obj.division(5, 0);
    }
    
}
class Prueba{
    //EXCEPTION ES CHECKED EXCEPTION, ESTAMOS OBLIGADOS A ANTENDERLO
    public void capturaMayorCero(int valor) throws Exception{
        if(valor <= 0)//voy a generar una excepción
            throw new Exception(valor +  " es negativo, solo se aceptan valores positivos");
        System.out.println("El valor es: " + valor);
    }
    public int division(int x, int y)throws ArithmeticException{
        if(y==0)
        throw new ArithmeticException("El valor de el divisor es cero, y es invalido!!");
       return x / y;
    }
}