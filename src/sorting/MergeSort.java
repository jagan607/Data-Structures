package sorting;

public class MergeSort {

    public static void main(String[] args) {

        int[] arr = { 12, 11, 13, 5, 6 };
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(arr , 0 , arr.length - 1);
        InsertionSort.printArray(arr);
    }

    private void sort(int[] arr, int left, int right) {

        if (left < right){
            int middle = (left + right)/2;
            System.out.println("left :" + arr[left] + " middle : " + arr[middle] + " right :" + arr[right] );
            sort(arr , left , middle);
            System.out.println("left :" + arr[left] + " middle : " + arr[middle] + " right :" + arr[right] );
            sort(arr , middle + 1 , right);
            merge(arr ,left , middle , right);
        }

    }

    private void merge(int[] arr, int left, int middle, int right) {
        int lSize = (middle - left) + 1;
        int rSize = right - middle;

        int[] leftArray = new int[lSize];
        int[] rightArray = new int[rSize];

        for (int i = 0 ; i< lSize ; i++){
            leftArray[i] = arr[left+ i];
        }
        for (int j = 0 ; j < rSize ; j++){
            rightArray[j] = arr[middle + 1 + j];
        }

        int i = 0 , j  = 0 , k = left;

        while (i < lSize && j < rSize){
            if (leftArray[i] > rightArray[j]){
                arr[k] = rightArray[j];
                j++;
            }
            else {
                arr[k] = leftArray[i];
                i++;
            }
            k++;
        }

        while (i < lSize){
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < rSize){
            arr[k] = rightArray[j];
            j++;
            k++;
        }

    }

}
