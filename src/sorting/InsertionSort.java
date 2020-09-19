package sorting;

public class InsertionSort {



    public static void printArray(int[] arr)
    {
        for (int j : arr) System.out.print(j + " ");
    }

    public static void main(String args[])
    {
        int[] arr = { 12, 11, 13, 5, 6 };

        InsertionSort ob = new InsertionSort();
        ob.sort(arr);

        printArray(arr);
    }

    private void sort(int[] arr) {
        int i;
        for (i = 1 ; i < arr.length ; i++){
            for (int j = 0 ; j < i ; j++){
                if (arr[i] < arr[j] ){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
