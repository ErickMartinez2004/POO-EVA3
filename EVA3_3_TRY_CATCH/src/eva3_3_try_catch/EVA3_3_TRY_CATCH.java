
package eva3_3_try_catch;


public class EVA3_3_TRY_CATCH {


    public static void main(String[] args) {
       
        
        int x = 5, y = 0;
        try{//BLOQUE DE CODIGO QUE PUEDE GENERAR UNA EXCEPCIÓN
        int resu = x/y;
        System.out.println("El resultado es: " + resu);
    
    
    }catch(ArithmeticException e){
        //BLOOQUE DE CODIGO QUE CAPTURA Y ATIENDE LA EXCEPCIÓN 
        //genera un objeto llamado "e"
            System.out.println("Excepcion: " + e.getMessage());
}
        System.out.println("Fin del programa");
    }
}