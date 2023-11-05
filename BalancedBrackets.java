package BalancedBrackets.java;
import java.util.Stack;

public class BalancedBrackets {
    public static boolean isBalancedBrackets(String inputStr) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : inputStr.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == ']' && top != '[') || (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
    
    public static void main(String[] args) {
        String sampleInput1 = "( [ [ { } ] ] )";
        String sampleInput2 = "( [ [ { } ] ] ) )";
        
        if (isBalancedBrackets(sampleInput1)) {
            System.out.println("The entered String has Balanced Brackets");
        } else {
            System.out.println("The entered String does not contain Balanced Brackets");
        }
        
        if (isBalancedBrackets(sampleInput2)) {
            System.out.println("The entered String has Balanced Brackets");
        } else {
            System.out.println("The entered String does not contain Balanced Brackets");
        }
    }
}