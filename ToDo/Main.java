import java.util.*;

class Main{
    public static void main(String[] args){
        ToDoUtils.showNotes();

    }


    private static void readFromFile(){
        FileUtils fu = new FileUtils();
        fu.readFromFile();
    }

    //test zapisu i odczytu do pliku
    private static void testSaveFile(){
        FileUtils fu = new FileUtils();
        fu.saveToFile(new ToDo("Pierwszy zapis","Tutaj jest content"));
        fu.saveToFile(new ToDo("Drugi zapis","Tutaj jest cos przynajmniej i data"));

        fu.readFromFile();

    }

//pobieranie z klaw danych
    private static void testRFK(){
        ReadFromKeyboard rfk = new ReadFromKeyboard();
        ToDo td = rfk.readOneToDo(); 
        System.out.println(td);
    }



    private static void test(){
        ToDo td = new ToDo("Pierwsza","To jest pierwsza notatka");
        ToDo td1 = new ToDo("Druga","To jest Druga notatka", "Maciej Szczypta");

        System.out.println(td+"\n"+td1);
    }
}