import java.util.ArrayList;

class Arrayvstab{
    //metoda publiczna
    public static void arrayListvstab(){
            int[] tab = new int[10];
            //do arraylist tylko obiekty 
            ArrayList<Integer> lista = new ArrayList<>();
            for(int i=0;i<10;i++){
                tab[i] = i+10;
            }
            System.out.println(tab);
    
            for(int i=0;i<10;i++){
                lista.add(i+10);
            }
            System.out.println(lista);
    
            for(int i =0;i<lista.size();i++){
                System.out.println("Element ["+i+"] "+ lista.get(i));
            }
    }
}