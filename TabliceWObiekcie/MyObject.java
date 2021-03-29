import java.util.Random;

import jdk.internal.jshell.tool.resources.l10n;

public class MyObject {
    private int tab[];   //przygotowanie zmiennej

    //konstruktor       choose_number_type - 0 numbers, 1 - odd numbers, 2 - even numbers
    public MyObject(int length_of_table, int choose_number_type){
        tab = new int[length_of_table];

        switch(choose_number_type){
            case 0:fillTab(); break;

            case 1: fillTabWithOdd(); break;
            case 2: fillTabWithEven(); break;
        }

        
    }

    //METODA wypelniajaca tablice
    private void fillTab(){
        Random r = new Random();
        for(int i = 0; i <tab.length;i++){
            tab[i] = r.nextInt(1000);
        }
    }

    private void fillTabWithOdd(){
        Random r = new Random();
        for(int i = 0;i<tab.length;i++){
            int nr = r.nextInt(1000);
            if(nr % 2 != 0){
                tab[i] = nr;
            }else{
                tab[i] = nr+1;
            }
        }
    }

    private void fillTabWithEven(){
        Random r = new Random();
        for(int i = 0;i<tab.length;i++){
            int nr = r.nextInt(1000);
            if(nr % 2 != 0){
                tab[i] = nr;
            }else{
                tab[i] = nr+1;
            }
        }
    }

    public int[] getTab(){
        return tab;
    }

    @Override
    public String toString(){
        return "Array length: "+ tab.length;
    }
}
