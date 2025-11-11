/*Q4. Problem:
 Create a class Product with fields id, name, and price.
 Implement:
A parameterized constructor to initialize product details.

A copy constructor to copy data from another object.
 Display both objects to confirm the copy works.
Hint:
 Use Product(Product p) to copy fields.
Explanation:
 This question checks understanding of how to duplicate object data using a copy constructor.
*/

class Product{
    int id;
    String name;
    double price;

    Product(int id, String name, double price){
        this.id=id;
        this.name=name; 
        this.price = price;
    }
    
    Product(Product p){
        this.id = p.id;
        this.name = p.name;
        this.price = p.price;
    }

    void display(){
        System.out.println("Product id - " +id);
        System.out.println("Product name - "+name);
        System.out.println("product Proce - " + price);
    }

    public static void main(String x[]){
        Product p1 = new Product(101, "Leptop", 50000);
        p1.display();

        Product p2 = new Product(p1);
        System.out.println("Copy Product Details");
        p2.display();
    }
}