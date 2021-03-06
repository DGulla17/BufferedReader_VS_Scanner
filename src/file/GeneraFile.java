package file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GeneraFile {

    public File file;

    GeneraFile() {
        try {
            int righe = 500000;
            file = new File("C:\\Users\\gulla.davide\\Desktop\\schweine.txt");
            file.getAbsolutePath();
            if (file.createNewFile()) {
                System.out.println("File creato!");
            } else {
                System.out.println("File già creato");
            }
            FileOutputStream fos = new FileOutputStream(file);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
            for (int i = 1; i < righe; i++) {
                int n = (int) (Math.random() * 255);
                bw.write(n + " ");
                if (i % 5 == 0) {
                    bw.newLine();
                }
            }
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(Filee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public File getFile() {
        return file;
    }
}
