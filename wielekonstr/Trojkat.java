class Trojkat {
    /*
    * bylo kilka konstroktowo rozne trojkaty
    */

    

    //Konstruktor1 Trojkat normal
    public Trojkat(int a,int h){
        System.out.println("Pole trojkata: " + (a*h/2));
    }

    //Konstruktor2 Trojkat rownoboczny
    public Trojkat(int a){ //(Math.pow(a, 2)*Math.pow(a, 1/3))/4 
        System.out.println("Pole trojkata rownobocznego: " + (a*Math.pow(2, 3))/2 );
    }
    
}
