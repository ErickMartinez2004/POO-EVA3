package eva3_9_leer_archivos_txt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class EVA3_9_LEER_ARCHIVOS_TXT {

    final static String RUTA = "C:\\PRUEBA\\prueba.txt";

    public static void main(String[] args) {

        try {
            readUsingFiles(RUTA);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    //FILES: se lee todo el contenido del archivo y se transfiere 
    public static void readUsingFiles(String ruta) throws IOException {
        //CONSTRUIMOS LA RUTA EN BAS A LA CADENA DE TEXTO
        Path path = Paths.get(ruta);
        /*List <String> todasLineas = Files.readAllLines(path);
        System.out.println("Resultado: ");
        System.out.println(todasLineas.toString());
        for (int i = 0; i < todasLineas.size(); i++) {
            System.out.println(todasLineas.get(i));
        }*/
        byte[] bytes = Files.readAllBytes(path);
        System.out.println(new String(bytes));

    }
}
