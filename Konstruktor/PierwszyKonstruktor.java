class PierwszyKonstruktor{
    public static void main(String[] args){

        //zmiana atrybutow przez konstruktor
        MojeBmi mb = new MojeBmi(190, 86);
        

        double wynik = mb.mojeBmi();

        System.out.println("BMI = "+wynik);


        ImieNazwisko im = new ImieNazwisko("Maciej", "Szczypta");

        im.powitanie();
    }    
}