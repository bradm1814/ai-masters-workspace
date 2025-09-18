// The aim is to define a class named Replace_Element. 
// Create a LinkedList object named fru_list  with a type parameter of String, indicating that it will store strings as its elements.
// Add the Strings elements such as "Watermelon", "Apple", "Cherry", and "Banana" to fru_list .
// Print the initial contents of fru_list before any modifications.
// Replace the element at index 2 in fru_list with the string "Pineapple". The set method takes two parameters: 
// the index at which the element needs to be replaced, and the new value to be inserted at that index.
// Print the message "Replace an Element in a linked list."
// Print the contents of fru_list after replacing the element, which will now include "Pineapple" at index 2.
// The output of the program will be the initial contents of fru_list printed on the first line, 
// followed by the message "Replace an Element in a linked list." printed on the second line, 
// and the updated contents of fru_list with "Pineapple" at index 2 printed on the third line.

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
