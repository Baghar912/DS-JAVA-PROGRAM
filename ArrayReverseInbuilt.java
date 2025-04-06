//Array Reverse Inbuilt Methods (Non In-place).
import java.util.Arrays;
public class ArrayReverseInbuilt {
public static void main(String[] args) {
int[] originalArray = {1, 2, 3, 4, 5};
int[] reversedArray = new int[originalArray.length];
for (int i = 0; i < originalArray.length; i++) {
reversedArray[i] = originalArray[originalArray.length - 1 - i];
}
System.out.println(Arrays.toString(reversedArray));
}
}