public class Main {

    static Samochody samochody;
    static Samochody samochody1,s3;
    static Klient klient;
    public static void main(String[] args){
        init();
        //infoSamochody();
        /*System.out.println(samochody.toString());
        System.out.println("O D S T E P \n");
        System.out.println(samochody1.toString());
        System.out.println("O D S T E P 2\n");
        System.out.println(s3.toString());*/

        System.out.println(samochody.moc + samochody1.moc);
    }
    
    private static void init(){
        klient = new Klient();
        klient.nr = 10;

        samochody = new Samochody();
        samochody.marka = "Ford";
        samochody.marka = "Saab";
        samochody.rodzaj_silnika = "Wacha";
        samochody.moc = 150;
        samochody.mom_obrotowy = 246;
        samochody.pojemnosc = 1980;

        samochody1 = new Samochody();
        samochody1.marka = "Audi";
        samochody1.marka = "QS";
        samochody1.rodzaj_silnika = "Wacha";
        samochody1.moc = 200;
        samochody1.mom_obrotowy = 246;
        samochody1.pojemnosc = 1980;

        s3 = new Samochody();
    }


    

}
