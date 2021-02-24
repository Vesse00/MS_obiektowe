import java.util.Scanner;
import java.io.*;

public class zadanie2 {
    public static void main(String[] args) {
        
        try {
            Scanner sc = new Scanner(new File("czylosowac.txt"));

            int [] czylos = new int[8];
            int i = 0;
            while(sc.hasNextInt()){
                czylos[i++] = sc.nextInt();
            }

            Scanner sc2 = new Scanner(new File("ileliczb.txt"));
            int [] ile = new int[8];
            int j = 0;
            while(sc2.hasNextInt()){
                ile[j++] = sc2.nextInt();
            }

            //for(int j = 0; j < czylos.length; j++){ System.out.println(czylos[j]);}

            for(j = 0; j < czylos.length; j++){
                if(czylos[j] == 0){
                    System.out.println("Wczytalem 0 - nie losuje");
                }else if(czylos[j] == 1){

                    for(j = 0; j < ile.length; j++){ 
                        System.out.println("Czy los: "+czylos[j]+" Ile los: "+ile[j]);
                    }

                    
                    
                }
            }
            
        } catch (FileNotFoundException e) {
            
            e.printStackTrace();
        }

        
    }
}
