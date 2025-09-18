
//import LinkedList module
import java.util.LinkedList;

public class ReplaceElement{
    public static void main(String[] args) {
        //create Linked List call fru_list
        LinkedList<String> fru_list = new LinkedList<String>();

        //add elements to list
        fru_list.add("Watermelon");
        fru_list.add("Apple");
        fru_list.add("Cherry");
        fru_list.add("Banana");

        //print the inital contents before modifications
        System.out.println("Given Linked List: " + fru_list);

        //Call set method on index 2 with "Pineapple"
        fru_list.set(2,"Pineapple");

        //print Replace an Element in a linked list
        System.out.println("Replace an element in a Linked List");

        //reprint New linked list: fru_list
        System.out.println("New Linked List: " + fru_list);
    }
    }
