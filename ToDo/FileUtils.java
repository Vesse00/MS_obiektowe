import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileUtils {
    /*
    *   Save ToDo to filename alltodo.csv like:
    *   title; content; author;add_date
    *   @param ToDo - out note
    */
    public DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    public void saveToFile(ToDo td){

        File f = new File("alltodo.csv");
        try {
            FileWriter fw = new FileWriter(f, true); 
            
            fw.write(td.getTitle()+";"+td.getContent()+";"+td.getAuthor()+";"+dtf.format(td.getDate())+"\n");
            fw.close();
        } catch (IOException e) {
            System.out.println("ERR: "+e.toString());
        }

    }

    public ArrayList<ToDo> readFromFile(){
		ArrayList<ToDo> list = new ArrayList<>();
		try{
			File f = new File("alltodo.csv");
			Scanner sc = new Scanner(f);
			while(sc.hasNext()){
				String temp = sc.nextLine();
				System.out.println(temp);
				String [] ttemp = temp.split(";");
				ToDo td = new ToDo(ttemp[0], ttemp[1], ttemp[2], LocalDateTime.parse(ttemp[3], dtf));
				list.add(td);
			}
		} catch(FileNotFoundException ex){
			System.out.println("UPS! "+ex.toString());
		}
		
		
		return list;
	}
}
