
package eva3_8_custom_exceptions;


public class EVA3_8_CUSTOM_EXCEPTIONS {

   
    public static void main(String[] args)  {
        // TODO code application logic here
        Persona perso = new Persona();
        perso.setNombre("Juan");
        perso.setApellido("Perez");
        try{
             perso.setEdad(-10);
        }catch(DatoEntradaCheckedException e){
            System.out.println(e.getMessage()); 
            
        }
       
    }
    
}
class Persona{
    private String nombre;
    private String apellido;
    private int edad;

    public Persona() {
         this.nombre = "";
        this.apellido = "";
        this.edad = 0;
    }

    public Persona(String nombre, String apellido, int edad) throws DatoEntradaCheckedException  {
        this.nombre = nombre;
        this.apellido = apellido;
        setEdad(edad);  
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws DatoEntradaCheckedException {
        if(edad < 0)
           // throw new DatoEntradaException();//unchecked
            throw new DatoEntradaCheckedException();
        this.edad = edad;
    }
    
    
}

class DatoEntradaException extends RuntimeException{

    public DatoEntradaException() {
        super("Dato de entrada incorrecto!! El valor debe de ser positivo");
    }
    
}

class DatoEntradaCheckedException extends Exception{

    public DatoEntradaCheckedException() {
        super("Dato de entrada incorrecto!! El valor debe de ser positivo");
    }
    
}