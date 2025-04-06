//implement delete operation in a unsorted array
public class Deleteoperation {
static int findElement(int[] arr, int n, int key) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                return i; 
            }
        }
        return -1; 
    }

    
    static int deleteElement(int[] arr, int n, int key) {
        int pos = findElement(arr, n, key); 
        if (pos == -1) {
            System.out.println("Element not found");
            return n; 
        }

        
        for (int i = pos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        return n - 1; 
    }

    public static void main(String[] args) {
        int[] arr = {10, 50, 30, 40, 20}; 
        int n = arr.length; 
        int key = 30; 

        System.out.println("Before Deletion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        
        n = deleteElement(arr, n, key);

        System.out.println("After Deletion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}