package eva3_13_append;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EVA3_13_APPEND {

    public static void main(String[] args) {
        // TODO code application logic here
        String ruta = "C:\\Archivo\\";

        try {
            writeUsingnBufferedWriter(ruta + "archivoBufferedWriter.txt", "Prueba de escritura de archivos. Usando la clase BufferedWriter!!");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public static void writeUsingnBufferedWriter(String ruta, String datos) throws IOException {
        File file = new File(ruta);
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufWriter = new BufferedWriter(fileWriter);
        for (int i = 0; i < 10; i++) {
            fileWriter.write((i + 1) + " " + datos);
            fileWriter.write("\n");

        }
        bufWriter.close();
        fileWriter.close();
    }
}
