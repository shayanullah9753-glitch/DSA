public class Main {
    static int findAverage(int[] arr) {
        int sum = 0;
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int avg = sum / n;
        return avg;
    }
    static void main() {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int result = findAverage(arr);
        System.out.println("Average: " + result);
    }
}
