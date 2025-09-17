// The aim is to define a new  class named Checklist_Element. 
// Inside the this class, a new LinkedList object named lst is created with a type parameter of String, indicating that it will store strings as its elements.
// Strings such as "Papaya", "Mulberry", "Apple", etc., are added to the lst using the add method, which appends the elements to the end of the list.
// Print the initial contents of the lst before any modifications.
// Check if the element "Cherry" is present in the list. If the element is present, the first if block will be executed, and a message "Fruit Cherry is Present.." 
// will be printed. Otherwise, the else block will be executed, and a message "Fruit Cherry is Not Present.." will be printed.
// Check if the element "Guava" is present in the list. If the element is present, the second if block will be executed, and a message "Fruit Guava is Present.." 
// will be printed. Otherwise, the second else block will be executed, and a message "Fruit Guava is Not Present.." will be printed.
// The output of the program will be the initial contents of the lst printed on the first line, followed by the messages indicating if the elements "Cherry" and "Guava" are present 
// or not in the list.

//import Linked List module
import java.util.LinkedList;
// Create ChecklistElement Class
class CheckListElement{
    //create Main
    public static void main(String[] args) {

        //Create Linked List
        LinkedList<String> lst = new LinkedList<String>();

        //populate Linked List
        lst.add("Papaya");
        lst.add("Mulberry");
        lst.add("Apple");

        //print contents of the populated Linked List
        System.out.println("Initial contents of the Linked List: " + lst);

        //call check function on cherry
        Check(lst, "Cherry");
        
        //check function on guava
    }

    //create check function

    public static String Check(LinkedList<String> linkedList, String item){
        var iterator = linkedList.iterator();
        while (iterator.hasNext()){
            if (iterator.next().equals(item)){
                String message = "Fruit "+ item +" is present";
                return message;
            }
        }
        String message = "Fruit "+ item +" is not present";
        return message;
        }
    }





