
import java.util.Scanner;
import java.util.Stack;


public class IsPalindrome {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your sentence");
        String sentence=scanner.nextLine();
        
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i< sentence.length() /2 ; i++){
            stack.push(sentence.charAt(i));
        }
        if(ispalindrome(sentence, stack)){
            System.out.println("this sentence is a palindrome");
        }
        else{
            System.out.println("NOT a palindrome");
        }
    }
    public static boolean ispalindrome(String sentence,Stack<Character> stack){
        for(int i=sentence.length()/2 +1 ;i<sentence.length();i++){
            if(sentence.charAt(i)!= stack.pop()){
                return false;
            }
        }
         return true;
    }
}
