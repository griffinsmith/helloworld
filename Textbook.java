public class Textbook extends Book{
    //private variables listed
    private String title;
    private String subject;
    //Construcor that uses the super keyword
    public Textbook(){
    super();
    }
    //Constructor with arguments that uses the super keyword
    public Textbook(String title, String subject){
        super();
        this.title=title;
        this.subject=subject;
    }
    //Getter to get the title
    public String getTitle(){
        return title;
    }
    //Getter to get the subject
    public String getSubject(){
        return subject;
    }
    //Setter to set the title
    public void setTitle(String x){
        title=x;
    }
    //Setter to set the subject
    public void setSubject(String y){
        subject=y;
    }
    //Transfers everything to a string to print out
    public String toString(){
        String bookInfo=super.toString();
        String textbookInfo = bookInfo+ 
        "\nSubject: "+ subject+
        "\nTitle: "+ title;
    return textbookInfo;       
    }
}