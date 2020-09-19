package sorting;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = { 5, 2, 1, 3, 6, 4 };
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(arr);
        InsertionSort.printArray(arr);
    }

    private void sort(int[] arr) {
        for (int i = 0 ; i< arr.length -1 ; i++){
            for (int j = 0; j < arr.length - i - 1 ; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;                }
            }

        }
    }

    private void swap(int[] arr, int i) {
        int temp = arr[i];
        arr[i] = arr[i+1];
        arr[i] = temp;
    }


}
