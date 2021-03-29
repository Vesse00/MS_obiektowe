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
    
    //zmiana wartosc atrybutow obiektu
    public void setWzrost (int wzrost){
        this.wzrost = wzrost;
    }

    public void setWaga(int waga){
        this.waga = waga;
    }

    //pobieranie atrybutow obiektu
    public int getWzrost(){
        return wzrost;
    }

    public int getWaga(){
        return waga;
    }
}
