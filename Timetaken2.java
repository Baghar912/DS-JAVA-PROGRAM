public class Timetaken2 {
    public static int findSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        findSum(10000000);
        long endTime = System.nanoTime();
        double timeTaken = (endTime - startTime) / 1000; // Convert to seconds
        System.out.println("findSum(int n) took " + timeTaken + " seconds to execute");
    }
}

