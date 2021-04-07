class Szczyptamaciej {
    public static void main(String[] args){
        Sprawdzian spr = new Sprawdzian();
        spr.data = "2021_04_07";
        spr.ocena = 6;
        spr.przedmiot = "programowanie obiektowe";

        System.out.println("Data: "+spr.data +"\n ocena: "+spr.ocena +"\n przedmiot: "+spr.przedmiot);


        Dane d = new Dane("Maciej", "Szczypta", "2004-05-25");

        System.out.println("\n"+d.toString());


        Tablica tab = new Tablica();

        System.out.println("\n"+tab.randomowe);



    }   
}
