class Kolo {
    private double liczba_pi = 3.1415;
    private double promien = 0;


    public Kolo(double promien){
        this.promien = promien;
    }

    public String pole_kola(){
        return "Pole kola: "+ ((liczba_pi*promien)*(liczba_pi*promien));
    }

    public String obwod_kola(){
        return "Obwod kola: "+ (2*liczba_pi*promien);
    }

    public String pole_Kwardatu(double bok_a){
        return "Pole kwadratu: "+   (bok_a*bok_a);
    }

    public String obwod_Kwardatu(double bok_a){
        return "Obwod kwadratu: "+   (4*bok_a);
    }

    public String pole_prostokata(double bok_a, double bok_b){
        return "Pole prostokata: " + (bok_a*bok_b);
    }

    public String obwod_prostokata(double bok_a, double bok_b){
        return "Pole prostokata: " + (2*bok_a)+(2*bok_b);
    }
}
