public class PolaPrywatnePubliczne {

    static DaneOsobowe dos;
    public static void main(String[] args){
        
        dos = new DaneOsobowe(); //od tego momentu moge uzywac nazwy: dos

        System.out.println(dos.mybmi());

        dos.wzrost = 199;

        System.out.println("BMI 2 OS:"+dos.mybmi());

        System.out.println("Adress: "+dos.adress());
    }
}
