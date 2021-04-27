import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class ToDo{
    private String title = "";
    private String content = "";
    private String author = "Anonymous";
    
    private LocalDateTime add_date = LocalDateTime.now();

    //Konstruktor - anonimowy
    public ToDo(String title, String content){
        this.title = title;
        this.content = content;
    }


    //Konstruktor - nie anonimowy
    public ToDo(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public String getTitle(){
        return title;
    }
    public String getContent(){
        return content;
    }
    public LocalDateTime getDate(){
        return add_date;
    }
    public String getAuthor(){
        return author;
    }
    

    @Override
    public String toString(){
        return "Title: "+ title+ "\n"
            +"Content: "+ content+"\n"
            +"Author: "+author+ "\n"
            +"Data: "+add_date+"\n";
    }
}