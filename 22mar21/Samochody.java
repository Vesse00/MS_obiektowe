public class Samochody {
    public String marka = "";
    public String model = "";
    public String rodzaj_silnika = "";
    public int pojemnosc = 0;
    public int moc = 0;
    public int mom_obrotowy = 0;


    @Override
    public String toString() {
        return "Samochod:\n"
        +"Marka: "+marka+"\n"
        +"Model: "+model+"\n"
        +"Rodzaj Silnika: "+rodzaj_silnika+"\n"
        +"Moc: "+moc+"\n"
        +"Momnet Obrotowy"+mom_obrotowy+"\n"
        +"Pojemnosc: "+pojemnosc+"\n";
    }
}
