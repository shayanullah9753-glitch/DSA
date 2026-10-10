public class Main {
    static int linearSearch(int[] arr, int key) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            if (key == arr[i]) {
                return i;
            }
        }
        return -1;
    }
    static void main() {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int result = linearSearch(arr, 30);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        }
        else {
            System.out.println("Element not found");
        }
    }
}