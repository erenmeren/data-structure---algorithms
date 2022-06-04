package com.erenmeren.algorithms.sort;

public class Sort {

    public static void main(String[] args) {
        int[] array = {22, -5, 3 , 0 ,44, -12 ,3, 14};

//        bubble(array);
//        selection(array);
//        insertion(array);
        shell(array);

        for (int i : array) {
            System.out.println(i+", ");
        }
    }

    /**
     * Shell sort is an unstable algorithm
     * Shell sort worst time comlexity is O(n*n)
     * @param arr
     */
    public static void shell(int[] arr) {

        for (int gap = arr.length / 2; gap > 0 ; gap /= 2) {

            for (int i = gap; i < arr.length; i++) {
                int newElement = arr[i];

                int j = i;

                while ( j >=gap && arr[j-gap] > newElement) {
                    arr[j] = arr[j-gap];
                    j -= gap;
                }
                arr[j] = newElement;
            }
        }


    }

    /**
     * Insertion sort is a stable algorithm
     * Insertion sort time complexity is O(n*n)
     * @param arr
     */
    public static void insertion(int[] arr) {

        for (int firstUnsortedIndex = 1; firstUnsortedIndex <= arr.length; firstUnsortedIndex++) {

            int newElement = arr[firstUnsortedIndex];

            int i;

            for( i = firstUnsortedIndex; i > 0 && arr[i-1] > newElement; i-- ) {
                arr[i] = arr[i-1];
            }

            arr[i] = newElement;
        }
    }



    /**
     * Selection sort is an unstable algorithm
     * <p>
     * Selection sort time complexity is O(n*n)
     * @param array
     */
    public static void selection(int[] array) {

        int lastIndex = array.length - 1;

        for ( ; lastIndex >= 0; lastIndex-- ) {
            int largestIndex = 0;
            for (int i = 0; i <= lastIndex; i++) {
                if ( array[i] > array[largestIndex]) {
                    largestIndex = i;
                }
            }
            swap(array, largestIndex, lastIndex);
        }
    }

    /**
     * Bubble sort is a stable sort algorithm
     * <p>
     * Bubble sort time complexity is O(n*n)
     * @param array
     */
    public static void bubble(int[] array) {
        for (int lastIndex = array.length-1; lastIndex >= 0 ; lastIndex--) {
            for (int i = 0; i < lastIndex; i++) {
                if( array[i] > array[i+1])
                    swap(array, i, i+1);
            }
        }
    }


    public static void swap(int[] arr, int i, int x) {

        if (i == x)
            return;

        int temp = arr[x];
        arr[x] = arr[i];
        arr[i] = temp;

    }

}
