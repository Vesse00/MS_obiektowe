public class Dane {
    private String imie = "";
    private String nazwisko = "";
    private String data = "";

    public Dane(String imie, String nazwisko, String data){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.data = data;
    }


    @Override
    public String toString(){
        return imie+" "+nazwisko+" urodzony w "+data;
    }
}
