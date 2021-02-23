import java.util.Scanner;
import java.util.Random;
import java.io.*;

class zadanie {
    public static void main(String[] args) {

        int[] los = new int[10];

        for (int i = 0; i < los.length; i++) {
            Random rand = new Random();
            los[i] = (int) (Math.random() * 6 + 1);
        }

        /*
         * for(int i=0; i<los.length; i++){ System.out.println("-> "+los[i]); }
         */

        //File plik = new File("uczniowie.txt");
        try {
            Scanner odczyt = new Scanner(new File("uczniowie.txt"));
            while(odczyt.hasNext()){
                String text = (odczyt.nextLine());
                System.out.println(text);
            }
            
        } catch (FileNotFoundException e) {
            
            System.out.println("ERR: " + e.toString());
        }


    }
}
