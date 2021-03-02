package drugimarzec;

public class zadanie {
    public static void main(String[] args) {
        //zadanie();
        tablicaMnozenia();
    }

    private static void zadanie(){
        int [][] tab = new int[2][2];

        tab[1][1] = 55;
        tab[1][0] = 6;
        tab[0][1] = 99;
        tab[0][0] = 60;

        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j < tab.length; j++){
                System.out.println(tab[i][j]);
            }

        }
    }

    private static void tablicaMnozenia(){
        int [][] tablica = new int[10][10];

        
        for(int i = 0; i < tablica.length; i++){
            for(int j = 0; j < tablica[i].length; j++){
                tablica[i][j] = (i+1)*(j+1);
            }
        }

        for(int i = 0; i < tablica.length; i++){
            for(int j = 0; j < tablica[i].length; j++){
                System.out.print(tablica[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
