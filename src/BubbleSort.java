public class BubbleSort {

    public static void main(String args[]) {
        int key = 0;
        BubbleSort ob = new BubbleSort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};

        for (int i = 0; i < arr.length - 1; i++) {
            key = arr[0];
            if (key > arr[i]) {
                key = arr[i];
            }
        }
        System.out.println(key);
        }
}
