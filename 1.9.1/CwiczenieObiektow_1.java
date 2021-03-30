class CwiczenieObiektow_1{
    public static void main(String[] arg){
        MojeDane md = new MojeDane("Maciej", "Szczypta", "2PTN");

        System.out.println(md.imie+"\n "+md.nazwisko+"\n "+md.klasa);
        
        Logowanie log = new Logowanie();

        System.out.println(log.toString());

        Kolo k1 = new Kolo(4);

        System.out.println(k1.pole_kola());
        System.out.println(k1.obwod_kola());

        System.out.println("\n");

        Kolo k2 = new Kolo(20);
        System.out.println(k2.pole_kola());
        System.out.println(k2.obwod_kola());

        Kolo kwadrat = new Kolo(0);

        System.out.println(kwadrat.pole_Kwardatu(5));
        System.out.println(kwadrat.obwod_Kwardatu(5));

        Kolo prostokat = new Kolo(0);

        System.out.println(prostokat.pole_prostokata(5, 10));
        System.out.println(prostokat.obwod_prostokata(5, 10));
    }
}