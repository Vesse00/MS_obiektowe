class Main{
    public static void main(String args[]){
        MyObject mo = new MyObject(100, 0);

        int tab[] = mo.getTab();

        System.out.println(mo+"\n");
        
        for(int i = 0;i<tab.length;i++){
            System.out.println(tab[i]);
        }

        
    }
}