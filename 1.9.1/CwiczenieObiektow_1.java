class CwiczenieObiektow_1{
    public static void main(String[] arg){
        MojeDane md = new MojeDane("Maciej", "Szczypta", "2PTN");

        System.out.println(md.imie+"\n "+md.nazwisko+"\n "+md.klasa);
        
        Logowanie log = new Logowanie();

        System.out.println(log.toString());

        Kolo kolo = new Kolo();

        System.out.println(kolo.pole_kola(3.1415, 4));
        System.out.println(kolo.obwod_kola(3.1415, 4));

        System.out.println("\n");

        System.out.println(kolo.pole_kola(3.1415, 20));
        System.out.println(kolo.obwod_kola(3.1415, 20));
    }
}