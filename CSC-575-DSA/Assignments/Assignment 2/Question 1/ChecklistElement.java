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
        lst.add("Cherry");
        lst.add("Guava");

        //print contents of the populated Linked List
        System.out.println("Initial contents of the Linked List: " + lst);

        //call and print check function on cherry
        System.out.println(Check(lst, "Cherry"));
        
        //check function on guava
        System.out.println(Check(lst, "Guava"));
    }

    //create check function
    /**
     * Function Name: Check
     * 
     * @param linkedList
     * @param item
     * @return
     * 
     * In this Function:
     * 1. take input of a linked list and a string to see if it is in the linked list
     * 2. while loop the ends if it reaches the tail (.hasNext() returns False)
     * 3. If statement to check if the input string is inside the linked list and returns a message stating that it is
     * 4. If the while loop ends without finding a match it return a message saying it in there
     *
     */
    public static String Check(LinkedList<String> linkedList, String item){
        var iterator = linkedList.iterator();
        while (iterator.hasNext()){
            if (iterator.next().toLowerCase().equals(item.toLowerCase())){
                String message = "Fruit "+ item +" is present";
                return message;
            }
        }
        String message = "Fruit "+ item +" is not present";
        return message;
        }
    }





