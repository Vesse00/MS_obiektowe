import java.util.InputMismatchException;
import java.util.Scanner;

class PierwszyKonstruktor{
    public static void main(String[] args){

        obliczanieBmi();
        
    }    

    private static void test(){
        //zmiana atrybutow przez konstruktor
        /*MojeBmi mb = new MojeBmi(190, 86);
        

        double wynik = mb.mojeBmi();

        System.out.println("BMI = "+wynik);


        //ImieNazwisko im = new ImieNazwisko("Maciej", "Szczypta");
        //im.powitanie();
        

        mb.setWaga(65);
        mb.setWzrost(178);
        System.out.println("BMI2 = "+mb.mojeBmi());*/
    }

    private static void obliczanieBmi(){
        int wzrost = 0;
        int waga = 0;

        

        
        int zakoncz = 0;
        boolean flag = true;

        while(flag){
            try{
                Scanner sc = new Scanner(System.in);
                System.out.println("0 - Zakoncz \n1-oblicz");
                zakoncz = sc.nextInt();
    
                while(zakoncz != 0){
                    System.out.print("Podaj wzrost w cm: ");
                    wzrost = sc.nextInt();
                    System.out.println();
        
                    System.out.print(" Podaj wage w kg: ");
                    waga = sc.nextInt();
                    System.out.println();
        
                    MojeBmi mb = new MojeBmi(wzrost,waga);
                    System.out.println("BMI = "+mb.mojeBmi());
        
                    System.out.println("\nZakonczyc? 0 - Zakoncz");
                    zakoncz = sc.nextInt();
                }
                flag = false;
            }catch(InputMismatchException ex){
                System.out.println("Wpisuj tylko cyfry");
                zakoncz = 0;
            }
        }
        
        
        
    }
}