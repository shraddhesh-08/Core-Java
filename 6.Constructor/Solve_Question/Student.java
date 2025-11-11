/*Q2. Problem:
 Create a class Student with fields rollNo, name, m1, m2, m3, and total.
 Use a parameterized constructor to assign values to roll number, name, and marks.
 Calculate total marks inside the constructor and display details using a function.
Hint: Constructor should perform addition logic.
Explanation:
 Shows how to use constructors to initialize and process multiple fields at once.*/

 class Student{
    int rollNo;
    String name;
    int m1;
    int m2;
    int m3; 
    int total;

    //Constructer

    Student(int rollnumber, String nam, int mar1, int mar2, int mar3){
        rollNo = rollnumber;
        name =nam;
        m1 = mar1;
        m2 = mar2;
        m3 = mar3;
        
        total = m1 + m2 + m3;
    }

    void Show(){
        System.out.println("----- Student Details -----");
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks 1: " + m1);
        System.out.println("Marks 2: " + m2);
        System.out.println("Marks 3: " + m3);
        System.out.println("Total Marks: " + total);
        System.out.println("---------------------------");
    }
    public static void main(String x []){
        Student obj = new Student(12, "shradhesh" , 68 , 55, 56);
        obj.Show();
    }
 }