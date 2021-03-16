public class DaneOsobowe {
   private String pesel = "12345678901";
   public int wiek = 20;
   public int wzrost = 188;
   public int waga = 88;

   public double mybmi(){
       return waga/((double)wzrost/100*(double)wzrost/100);
   }
}
