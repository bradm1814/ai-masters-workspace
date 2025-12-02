import java.util.Scanner;

public class PalindromeChecker{
    
    public static boolean isPalindrome(String str){
        // Start with base case 
        if (str.length() < 2){
            return true;
        }

        //check if first and last letter are the same
        if (str.charAt(0) == str.charAt(str.length() - 1)){
            //call same logic recursively on rest of string
            return isPalindrome(str.substring(1, str.length()-1));
        }else{
            //conditions not met
            return false;
        }

    }
    
    public static void main(String[] args){
        //create a scanner to catch user input
        Scanner scanner = new Scanner(System.in);

        //prompt user for input and capture
        System.out.print("Please enter a word to see if it is a palindrome: ");
        String userInput = scanner.nextLine();

        //make sure input is all lowercase and no spaces
        String fixed = userInput.replaceAll("\\s+", "").toLowerCase();

        //if isPalindrome returns true print that it is a palindrome, else say it isnt
        if (isPalindrome(fixed)) {
            System.out.println("" + userInput + " is a Palindrome");
        }else{
            System.out.println("" + userInput + " is not a Palindrome");
        }
        scanner.close();
    } 
}
