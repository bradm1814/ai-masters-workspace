//import LinkedList module
import java.util.LinkedList;
//import ListIterator module
import java.util.ListIterator;


//Create Class
public class QuestionThreeA{
    public static void main(String[] args) {
        //Create Linked List instance call Books
        LinkedList<String> Books = new LinkedList<String>();

        //Add Elements
        Books.add("Java");
        Books.add("DB");
        Books.add("Python");
        Books.add("Network");

        //Add Security after DB
        ListIterator<String> myiterator =  Books.listIterator();
        //move iterator between Java and DB
        myiterator.next();
        //move iterator between DB and Python
        myiterator.next();
        //Add Security
        myiterator.add("Security");
        //move back to beginning
        myiterator.previous();
        myiterator.previous();
        myiterator.previous();
        //Display all elements
        while(myiterator.hasNext())
        System.out.println(myiterator.next());
        
    }
}




