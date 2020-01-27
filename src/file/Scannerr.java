package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Scannerr {

    Scannerr(File file) {
        try {
            Scanner sc = new Scanner(file);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Scannerr.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
