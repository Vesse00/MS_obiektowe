public class MojeBmi {

    public int wzrost = 0;
    public int waga = 0;

    //Konstruktor
    public MojeBmi(int wzrost, int waga){  //klasa zaczyna sie z big litera
        System.out.println("W kostruktorze: "+wzrost+" "+waga);

        this.wzrost = wzrost; 
        this.waga = waga;

    }

    public double mojeBmi(){    //metoda zaczyna sie ze small litera
        return waga/((double)wzrost/100*(double)wzrost/100);
    }
    
}
