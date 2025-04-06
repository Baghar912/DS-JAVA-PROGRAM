//Array Reverse Stack (Non In-place).
import java.util.Stack;
public class ArrayReverseStack {
    // Method to reverse the array using a stack
    public static void reverseArrayUsingStack(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
    }
     public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        // Reverse the array using stack
        reverseArrayUsingStack(arr);
        System.out.print("Reversed Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
