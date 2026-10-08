public class Main {
    static int[] multiplyBy10 (int[] arr) {
        int n = arr.length;
        int[] newarr = new int[n];
        for(int i = 0; i < n; i++) {
            newarr[i] = arr[i] * 10;
        }
        return newarr;
    }
    static void main() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] newarr = multiplyBy10(arr);
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            System.out.print(newarr[i] + " ");
        }
    }
}