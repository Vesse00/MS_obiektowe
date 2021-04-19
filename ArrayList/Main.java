import java.util.ArrayList;

class Main{
    public static void main(String[] args){
        //Arrayvstab.arrayListvstab();
        ArrayList<DaneOsobowe> listOfDaneOsobowe = new ArrayList<>();
        DaneOsobowe do1 = new DaneOsobowe("Anna", "Kowalsjka", 19, 165, 60);
        DaneOsobowe do2 = new DaneOsobowe("Karol", "Wisniewski", 23, 179, 85);
        listOfDaneOsobowe.add(do1);
        listOfDaneOsobowe.add(do2);
        for(int i = 0;i<listOfDaneOsobowe.size();i++){
            System.out.println(listOfDaneOsobowe.get(i).RokUrodzenia()+"\n");
        }
    }
}