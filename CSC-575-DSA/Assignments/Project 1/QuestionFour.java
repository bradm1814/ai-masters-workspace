import java.util.LinkedList; //import Linked List Module
import java.util.ListIterator; // Import ListIterator Module
class Main {
  public static void main(String[] args) {
//create LinkedList containing String Values called myLList
LinkedList<String> myLList = new LinkedList<String>();

//Add value "Christophe" at Head [Christophe]
myLList.addFirst("Christophe");

//Add value "Stephen" at Head [Stephen, Christophe]
myLList.addFirst("Stephen");

//Add value "Christina" at Tail [Stephen, Christophe, Christina]
myLList.addLast("Christina");

//Create an iterator on myLList
ListIterator<String> myiterator = myLList.listIterator();

//moves iterator between Stephan and Christophe
myiterator.next();

//moves iterator between Christophe and Christina
myiterator.next();

//adds value "Reem" at current index [Stephan, Christophe, Reem, Christina]
//moves iterator between Reem and Christina
myiterator.add("Reem");

//moves iterator back one between Christophe and Reem
myiterator.previous();

//adds value "Ahmad" at current index [Stephan, Christophe, Ahmad, Reem, Christina]
//moves iterator between Ahmad and Reem
myiterator.add("Ahmad");

//Adds value "Khaled" at current index [Stephan, Christophe, Ahmad, Khaled, Reem, Christina]
//moves iterator between Khaled and Reem
myiterator.add("Khaled");

//Moves iterator between Ahmad and Khaled
myiterator.previous();

//removes Node at current index "Khaled" [Stephan, Christophe, Ahmad, Reem, Christina]
myiterator.remove();

// prints list in current state Ouput: [Stephan, Christophe, Ahmad, Reem, Christina]
System.out.println(myLList);

//move iterator between Reem and Christina
myiterator.next();

//move iterator between Christina and Null
myiterator.next();

    //prints message "MyList Backward iteration :"
    System.out.println("MyList Backward iteration :"); 
      
      //While the iterator's previous value is not Null (Ends at Head)
      while(myiterator.hasPrevious())    
      
      //print The Node
      System.out.println(myiterator.previous());   

      //print message : "---------------------"
      System.out.println("---------------------");
  }
}


