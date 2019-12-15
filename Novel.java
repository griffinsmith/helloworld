public class Novel extends Book{
    //private variables listed
    private String color;
    private String title;
    //Constructor with arguments that uses the super keyword
    public Novel(String color, String title){
    super();
    this.color=color;
    this.title=title;
    }
    //Getter that gets color
    public String getColor(){
        return color;
    }
    //Getter that gets title
    public String getTitle(){
        return title;
    }
    //Setter that sets color
    public void setColor(String z){
        color=z;
    }
    //Setter that sets title
    public void setTitle(String g){
        title=g;
    }
    //Transfers everything to a string to print out
    public String toString(){
        String bookInfo=super.toString();
        String novelInfo = bookInfo+ 
        "\nColor: "+ color+
        "\nTitle: "+ title;
    return novelInfo;       
    }
}
