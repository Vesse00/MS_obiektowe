class Kolo {
    private double liczba_pi = 3.1415;
    private double promien = 0;

    public String pole_kola(double liczba_pi, double promien){
        this.liczba_pi = liczba_pi;
        this.promien = promien;
        return "Pole: "+ ((liczba_pi*promien)*(liczba_pi*promien));
    }

    public String obwod_kola(double liczba_pi, double promien){
        this.liczba_pi = liczba_pi;
        this.promien = promien;
        return "Obwod: "+ (2*liczba_pi*promien);
    }
}
