import java.util.Scanner;
public class ReadFromKeyboard {
    public ToDo readOneToDo(){
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Podaj tytul: ");
        String title = sc.nextLine();

        System.out.print("Podaj Tresc: ");
        String content = sc.nextLine();

        
        System.out.println("Podaj autora lub nacisnij ENTER: ");
        String author = sc.nextLine();

        if(author.length()<1){
            return new ToDo(title, content);
        }else{
            return new ToDo(title, content, author);
        }

        
    }
}
