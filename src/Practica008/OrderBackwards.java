package Practica008;

import java.util.ArrayDeque;
import java.util.Deque;

public class OrderBackwards {

    public void insert(String word) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            stack.push(currentChar);
        }
        showOrderUpsideDown(stack);
    }

    private void showOrderUpsideDown(Deque<Character> stack){
        while (!stack.isEmpty()) {
            char extractedChar = stack.pop();
            System.out.print(extractedChar);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        OrderBackwards orderBackwards = new OrderBackwards();
        String word = "GeeksQuiz";
        orderBackwards.insert(word);
        String word2 = "abc";
        orderBackwards.insert(word2);
    }
}
