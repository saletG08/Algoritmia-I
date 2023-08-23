package Practica008;

import java.util.*;

public class BalancedBrackets {

    public boolean isBalancedBrackets(String brackets){
        Deque<Character> stack= new ArrayDeque<>();
        char check;
        for (int i = 0; i < brackets.length(); i++) {
            char currentBrackets = brackets.charAt(i);
            if (currentBrackets == '[' || currentBrackets == '(' || currentBrackets == '{'){
                stack.push(currentBrackets);
            } else if (currentBrackets == ']' && !stack.isEmpty()) {
                check = stack.pop();
                if (check == '{' || check == '('){
                    return false;
                }
            } else if (currentBrackets == ')' && !stack.isEmpty()){
                check = stack.pop();
                if (check == '{' || check == '['){
                    return false;
                }
            } else if (currentBrackets == '}' && !stack.isEmpty()){
                check = stack.pop();
                if (check == '(' || check == '['){
                    return false;
                }
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public void printIsBalancedBrackets(String brackets){
        if (brackets.equals("")){
            System.out.println("No exist Brackets");
        }else if (isBalancedBrackets(brackets)){
            System.out.println("Balanced");
        }else {
            System.out.println("No Balanced");
        }
    }

    public static void main(String[] args) {
        BalancedBrackets balancedBrackets = new BalancedBrackets();
        String brackets = "[()]{}{[()()]()}";
        System.out.println("Test 1 " + brackets);
        balancedBrackets.printIsBalancedBrackets(brackets);
        String brackets2 = "[(])";
        System.out.println("Test 2 " + brackets2);
        balancedBrackets.printIsBalancedBrackets(brackets2);
        String brackets3 = "";
        System.out.println("Test 3 " + brackets3);
        balancedBrackets.printIsBalancedBrackets(brackets3);
        String brackets4 = "(";
        System.out.println("Test 4 "+ brackets4);
        balancedBrackets.printIsBalancedBrackets(brackets4);
        String brackets5 = "]";
        System.out.println("Test 5" + brackets5);
        balancedBrackets.printIsBalancedBrackets(brackets5);
        String brackets6 = ")";
        System.out.println("Test 6 " + brackets6);
        balancedBrackets.printIsBalancedBrackets(brackets6);
        String brackets7 = "}";
        System.out.println("Test 7 " + brackets7);
        balancedBrackets.printIsBalancedBrackets(brackets7);
    }
}
