package linearStructures.stacks;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class StacksInJava {
    private final List<Character> leftBrackets = Arrays.asList('(', '<', '[', '{');
    private List<Character> rightBrackets = Arrays.asList(')', '>', ']', '}');

    public void javaStacks() {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        var top = stack.pop();
        top = stack.peek();
    }

    public String reverseString(String input) {
        if (input == null)
            throw new IllegalArgumentException();
        Stack<Character> stack = new Stack<>();
        for (char letter : input.toCharArray())
            stack.push(letter);

        StringBuffer reversed = new StringBuffer(); // we use StringBuffer when there are a lot of string manipulations
        while (!stack.empty())
            reversed.append(stack.pop());

        return reversed.toString();
    }

    // this checks the validity of expressions
    // (1 + 2) -> valid
    // [1 + 2) -> invalid
    public boolean isBalancedString(String expression) {
        Stack<Character> stack = new Stack<>();
        for (char character : expression.toCharArray()) {
            if (isLeftBracket(character))
                stack.push(character);
            if (isRightBracket(character)) {
                if (stack.empty())
                    return false;

                var top = stack.pop();
                if (!bracketsMatch(top, character))
                    return false;
            }
        }
        return stack.empty();
    }

    private boolean isLeftBracket(char character) {
        return leftBrackets.contains(character);
    }

    private boolean isRightBracket(char character) {
        return rightBrackets.contains(character);
    }

    private boolean bracketsMatch(char left, char right) {
        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
    }
}
