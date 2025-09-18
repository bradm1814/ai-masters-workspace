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
        //lst.add("Cherry");
        //lst.add("Guava");

        //print contents of the populated Linked List
        System.out.println("Initial contents of the Linked List: " + lst);

        //check if cherry is present
        if (lst.contains("Cherry")){
            System.out.println("Fruit Cherry is present");
        }else{
            System.out.println("Fruit Cherry is not present");
        }
        
        //check if guava is present
        if (lst.contains("Guava")){
            System.out.println("Fruit Guava is present");
        }else{
            System.out.println("Fruit Guava is not present");
    }

    }
}




