public class Book{
    //private variables
    private int numPages;
    private int year;
    //default constructor
    public Book(){
    }
    //Getter for NumPages
    public int getNumPages(){
        return numPages;
    }
    //Getter for year
    public int getYear(){
        return year;
    }
    //Setter for NumPages
    public void setNumPages(int numPages){
        this.numPages=numPages;
    }
    //Setter for year
    public void setYear(int year){
        this.year=year;
    }
    //Shows how polymorphism works using instanceof
    public void callPolyMethod(Book book){
        if (book instanceof Novel){
            System.out.println("This is an instance of novel");
        }
        else if(book instanceof Textbook){
            System.out.println("This is an instance of textbook");              
        }
        else{
            System.out.println("This is an instance of book.") ;               
        }
    }   
    //Transfers the variables to a String to print out
    public String toString(){
        String bookInfo = "Object of class: " + 
        this.getClass().getName()+
        "\nNumber of Pages: " + numPages + 
        "\nYear: " + year;
    return bookInfo;       
    }
}