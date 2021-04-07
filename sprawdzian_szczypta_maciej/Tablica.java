import java.util.Random;
public class Tablica {
    public int[] randomowe = new int[10];

    public Tablica(){
        for(int i =0; i < randomowe.length;i++){
            randomowe[i] = (int) (Math.random()*21-10);

        }

        for(int i = 0;i < randomowe.length;i++){
            System.out.println(randomowe[i]);
        }
    }
    
}
