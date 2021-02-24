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

        
        String[] imiona = new String[10];
        
		try {
			Scanner odczyt = new Scanner(new File("uczniowie.txt"));
            for (int i = 0; i < los.length; i++) {
                imiona[i] = odczyt.nextLine();
            }
		} catch (FileNotFoundException e) {
			System.out.println("BLAD:"+e.toString());
		}
        
        for(int i = 0; i < los.length; i++){ 
            System.out.println(imiona[i] +" "+ los[i]);
        }
        
    }
}
