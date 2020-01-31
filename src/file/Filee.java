package file;

import java.util.Scanner;

/**
 *
 * @author gulla.davide
 */
public class Filee {

    public static void main(String[] args) {

        System.out.println("Cosa vuoi fare?\n1 -> Genera file\n2 -> Leggi file con BufferedReader\n3 -> Leggi file con Scanner");
        Scanner input = new Scanner(System.in);
        int choise = input.nextInt();
        GeneraFile filee=null;
        BufferedReaderr reader=null;
        Scannerr scanner=null;
        switch (choise) {

            case 1:
                filee = new GeneraFile();
            case 2:
                reader = new BufferedReaderr(filee.getFile());
            case 3:
                scanner = new Scannerr(filee.getFile());
            default:
                System.out.println("Inserisci 1/2/3");
        }
    }
}
