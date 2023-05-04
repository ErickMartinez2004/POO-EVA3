package eva3_6_finally;


public class EVA3_6_FINALLY {

    
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 9, y = 0;
        try{
            int resu = x/y;
            System.out.println("Resultado: " + resu);
            
            
        }catch(ArithmeticException e){
            System.out.println("No se puede dividir entre cero");
        }finally{//OBLIGA A LA EJECUCIÓN DE ESTA SECCION DE CODIGO
            //ES OPCIONAL
            System.out.println("SIEMPRE ME VOY A EJECUTAR!!");
        }
        System.out.println("Fin del programa");
    }
    
}
