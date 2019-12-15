public class Main{
    public static void main(String[] args){
         //Instantiates a Book
        Book myBook=new Book();
        //Sets Number of pages and Year
        myBook.setNumPages(178);
        myBook.setYear(2000);
         //Prints out myBook
        System.out.println(myBook.toString()); 
        //Shows polymorphism           
        myBook.callPolyMethod(myBook);
        System.out.println("----------------------------------");

        //Instantiates a Novel
        Novel myNovel=new Novel("Blue","Harry Potter");
        myNovel.setNumPages(387);
        myNovel.setYear(1997);            
        System.out.println(myNovel.toString()); 
        //Sets a new color and a new title to the same object          
        myNovel.setColor("Red");
        myNovel.setTitle("Parry Hotter");
        //Sets a new number of pages to the same object
        myNovel.setNumPages(390); 
        //Prints the same object, but appears as a different novel
        System.out.println(myNovel.toString());
        //Shows polymorphism
        myBook.callPolyMethod(myNovel); 
        System.out.println("----------------------------------");

        //Instanteates a Textbook
        Textbook myTextbook=new Textbook("Calculus","Math");
        myTextbook.setNumPages(1398);
        myTextbook.setYear(1965); 
        System.out.println(myTextbook.toString());
        //Sets a new Subject and title to the same object
        myTextbook.setSubject("Science");
        myTextbook.setTitle("Biology");     
        //Prints out same object, but appears as a different textbook       
        System.out.println(myTextbook.toString());  
        //Shows polymorphism
        myBook.callPolyMethod(myTextbook);     
        System.out.println("----------------------------------");         
    }
}
