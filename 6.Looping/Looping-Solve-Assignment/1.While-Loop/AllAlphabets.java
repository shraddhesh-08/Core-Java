// Q3. Write a java program to print all alphabets from a to z. - using while loop


public class AllAlphabets{
    public static void main(String x[]){
        
        char ch = 'a';

        System.out.println("Alphabet from a a-z are : ");

        while( ch <= 'z'){
            System.out.print(ch + " ");
            ch++;
        }
    }
}