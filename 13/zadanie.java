import java.util.Scanner;
import java.util.Random;

class zadanie{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[] los = new int[10];

        Random rand = new Random();
        for(int i=0; i<los.length; i++){
            los[i] = (int)Math.random()*6+1;
        }

    }
}
