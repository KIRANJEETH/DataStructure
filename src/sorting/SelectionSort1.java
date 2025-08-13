package sorting;

public class SelectionSort1 {
    public static void main(String[] args) {
        int[] arr = {6, 28, 11, 8, 14, 18};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Sorted numbers:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
