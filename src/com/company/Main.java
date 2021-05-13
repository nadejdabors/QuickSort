package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
     int[]  Arr = {7, 6, 10,5,9,2,1,15,7};
     int end = Arr.length;
     int begin = 0;
     Main sort = new Main();
     sort.quickSort(Arr,begin,end-1);
        for(int i = 0 ; i < end;i++){
            System.out.print(Arr[i]);
        }
        sort.quickSORT(Arr,begin,end-1);
        for(int i = 0 ; i < end;i++){
            System.out.print(Arr[i]);
        }
    }
    public void quickSort(int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
    }
    private int partition(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }
    private int PARTITION(int arr[], int lb, int ub){
        int pivot = arr[lb];
        int start = lb;
        int end = ub;
        while(start < end){
            while (arr[start] <= pivot)
                start++;
            while (arr[end] > pivot)
                end--;
            if(start < end){
                int aux = arr[end];
                arr[end] = arr[start];
                arr[start] = aux;
            }

        }
        int aux = arr[end];
        arr[end] = arr[lb];
        arr[lb] = aux;
        return end;

    }
    public void quickSORT(int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = PARTITION(arr, begin, end);

            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
    }

}
