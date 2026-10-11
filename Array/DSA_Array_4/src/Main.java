public class Main {
    static int findMaximum(int[] arr) {
        int n = arr.length;
        if (n == 0) {
            return -1;
        }
        int highest = arr[0];
        for(int i = 0; i < n; i++) {
            if (arr[i] > highest) {
                highest = arr[i];
            }
        }
        return highest;
    }
    static void main() {
        int[] arr = {10, 20, 30, 40, 100, 110, 90};
        int result = findMaximum(arr);
        if (result != -1) {
            System.out.println("Highest Element in Array: " + result);
        }
        else {
            System.out.println("Array is empty");
        }
    }
}
