import java.util.Stack;

public class InfixToPrefix {
    public static boolean checkIfOperand(char ch) {
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
    }
    public static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }
    // Function to convert infix expression to postfix expression
    public static String getPostfix(String expression) {
        Stack<Character> stack = new Stack<>();
        StringBuilder postfix = new StringBuilder();

        for (int i = 0; i < expression.length(); i++) {
            char currentChar = expression.charAt(i);

            if (checkIfOperand(currentChar)) {
                postfix.append(currentChar);
            } else if (currentChar == '(') {
                stack.push(currentChar);
            } else if (currentChar == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                if (!stack.isEmpty() && stack.peek() != '(') {
                    return ""; 
                } else {
                    stack.pop();
                }
            } else { 
                while (!stack.isEmpty() && precedence(currentChar) <= precedence(stack.peek())) {
                    postfix.append(stack.pop());
                }
                stack.push(currentChar);
            }
        }

        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    // Function to reverse the string
    public static String reverse(String exp) {
        StringBuilder reversed = new StringBuilder(exp);
        return reversed.reverse().toString();
    }
    public static String brackets(String exp) {
        StringBuilder modified = new StringBuilder(exp);
        for (int i = 0; i < modified.length(); i++) {
            if (modified.charAt(i) == '(') {
                modified.setCharAt(i, ')');
            } else if (modified.charAt(i) == ')') {
                modified.setCharAt(i, '(');
            }
        }
        return modified.toString();
    }
    // Main function to convert infix expression to prefix
    public static String infixToPrefix(String exp) {
        // Reverse the string
        exp = reverse(exp);
        exp = brackets(exp);
        String postfix = getPostfix(exp);
        return reverse(postfix);
    }

    public static void main(String[] args) {
        String expression = "((a/b)+c)-(d+(e*f))";
        System.out.println("The infix is: " + expression);
        // Convert infix to prefix
        String prefix = infixToPrefix(expression);

        System.out.println("The prefix is: " + prefix);
    }
}
