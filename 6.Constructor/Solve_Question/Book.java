/*Q5. Problem:
 Create a class Book with fields:
bookId, title, author, and price.
Use:
A default constructor to print “Book object created”.

A parameterized constructor with bookId and title.

Another parameterized constructor with bookId, title, author, and price
 that calls the previous constructor using this() (constructor chaining).
Add a method display() to show book details.
Hint:
 Use this(bookId, title) inside the main constructor to reuse initialization logic.
Explanation:
 This question checks understanding of constructor chaining, which helps avoid code duplication inside multiple constructors.
*/

class Book{
    int bookId;
    String title;
    String author;
    double price;

    //default constructor
    Book(){
        System.out.println("Book object created");
    }

    Book(int id, String t){
        bookId = id;
        title = t;
    }
    
    Book(int id, String t, String a, double p ){
        this(id,t);
        author = a;
        price = p;
    }

    void display(){
        System.out.println("---------------------------");
        System.out.println("Book Id -> " + bookId);
        System.out.println("Book Tittle -> " + title );
        System.out.println("Author -> " + author);
        System.out.println("Price" + price); 
        System.out.println("---------------------------");
    }

    public static void main(String x[]){

        Book b1 = new Book();

        Book b2 = new Book(101, "java");
        b2.display();

        Book b3 = new Book(102, "python", "Guido van Rossum", 299);
        b3.display();
    }
}