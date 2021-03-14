import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeFinder{
    /** 
        A palindrome is a string that reads the same in either direction: left to right or right to left. 
     */

    private static Deque<Character> fillStack(String inputString){

        /**
            @param: Word of type String.
            @return: A stack of type Deque that is filled with the characters in inputString
         */

         Deque <Character> returnStack = new ArrayDeque<>();

         for (int i = 0; i < inputString.length(); i++){
             returnStack.push(inputString.charAt(i));
         }

         return returnStack;


    }


    private static String buildReverse(String inputString){

        /**
            @param: Word of type String 
            @return: The reverse of @param
         */

        Deque <Character> returnStack = fillStack(inputString);
        String reverse = "";

        for (int i = 0; i < inputString.length(); i++){
          reverse += returnStack.pop();
        }
        return reverse;

    } 

    public static boolean isPalindrome(String inputString){

        /**
            @param: Word of type String 
            @return: True is @param is palindrome
         */
        return (inputString.equals(buildReverse(inputString)));
    }

    public static void main(String[] args){
        System.out.println(isPalindrome("kayak"));
    }


}