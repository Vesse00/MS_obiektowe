package lekcja;

class Tablica {
    public static void main(String[] args) {
        
    }

    private static void pRZYPOMNIENIEtablicy(){
        int [] tab = new int[5];

        tab[0] = 40;

        for(int i =0; i < tab.length; i++){
            System.out.println(tab[i]);
        }
    }

    private static void tab2dFirst(){
        int [][] tab2d =new int[5][2];

        tab2d[0][1] = 50;
        System.out.println(tab2d.length+" <- dl tablicy");
        System.out.println((tab2d.length*tab2d[0].length)+" <- elementow ile ma tablica");

        tab2d[0][1] = 50;
        tab2d[2][1] = -77;
        tab2d[4][0] = 333;

        for(int i = 0; i < tab2d.length; i++){
            for(int j = 0; j < tab2d[i].length; j++){
                System.out.println((tab2d[i][j]));
            }
        }
        }
    }
}