package Assignment1;

/**
 *
 * @author sujit
 */

    public class Book {
    // Attributes
    private String title;
    private String author;
    private double price;

    // Default constructor
    public Book() {
        // Default values or can be left uninitialized
    }
    // Default constructor 
//	Book(){
//		name= "Seto Dharti";
//		author = "Baburam Neupane";
//		price = 345.00;
//		
//	}


    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
// Setter methods (optional)
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Display book information
    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: Rs" + price);
    }
    
    
    // Main program to demonstrate Book class
    public static void main(String[] args) {
        // Creating instances using default constructor
        Book defaultBook = new Book();
        defaultBook.setTitle("Palpasa cafe");
        defaultBook.setAuthor("Narayan wagle");
        defaultBook.setPrice(835);

        // Creating instances using parameterized constructor
        Book paramBook = new Book("Java Programming", "John Doe", 1300);

        // Displaying information for both books
        System.out.println("Default Book Information:");
        defaultBook.displayBookInfo();
        System.out.println("\nParameterized Book Information:");
        paramBook.displayBookInfo();
    }
}

    

