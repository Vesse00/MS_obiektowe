import java.util.*;

public class ToDoUtils {
    public static void showNotes(){
        FileUtils fu = new FileUtils();
        ArrayList<ToDo> list = fu.readFromFile();
        System.out.println("Wybierz nr notatki: ");
        for(int i=0;i<list.size();i++){
            System.out.println((i+1)+" "+list.get(i).getTitle());
        }
        System.out.println(">>> ");
        Scanner sc = new Scanner(System.in);
        int choose =sc.nextInt();
        System.out.println(list.get(choose-1));
    }
}
