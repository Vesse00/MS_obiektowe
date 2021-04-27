import java.time.LocalDateTime;


class ToDo{
    private String title = "";
    private String content = "";
    private String author = "Anonymous";
    
    private LocalDateTime add_date;

    //Konstruktor - anonimowy
    public ToDo(String title, String content){
        this.title = title;
        this.content = content;
        LocalDateTime.now();
    }


    //Konstruktor - nie anonimowy
    public ToDo(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
        LocalDateTime.now();
    }

    //Konstrunkor - trzeci
    public ToDo(String title, String content, String author, LocalDateTime add_date){
        this.title = title;
        this.content = content;
        this.author = author;
        this.add_date= add_date;
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