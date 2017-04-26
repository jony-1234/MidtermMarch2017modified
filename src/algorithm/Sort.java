package algorithm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.SortedSet;



public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */


    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[j]<array[i]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }

        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int i=0;i<array.length;i++){
            int minindex=i;
            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[minindex]){
                    minindex=j;
                }

            }
            int temp=array[minindex];
            array[minindex]=array[i];
            array[i]=temp;




            //implement here



        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    //public int[] bubbleSort (int [] array1){


            //implement here
        
        
        
        
        
        
        //return list;
   // }
    

    //public int [] mergeSort(int [] array){

        //implement here
        
        

        return list;
    }
    

    public int [] quickSort(int [] array){
        int [] list = array;
        //implement here

         class quicksort{
            final long startTime = System.currentTimeMillis();
            private int array[];
            private int length;
            public int [] quickSort(int [] array){

                int [] list = array;
                //implement here
                if (array == null || array.length == 0) {
                    return array;
                }
                this.array = array;
                length = array.length;
                quickSort(0, length - 1);

                return list;
            }
            private void quickSort(int lowerIndex, int higherIndex) {

                int i = lowerIndex;
                int j = higherIndex;
                // calculate pivot number, I am taking pivot as middle index number
                int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
                // Divide into two arrays
                while (i <= j) {
                    /**
                     * In each iteration, we will identify a number from left side which
                     * is greater then the pivot value, and also we will identify a number
                     * from right side which is less then the pivot value. Once the search
                     * is done, then we exchange both numbers.
                     */
                    while (array[i] < pivot) {
                        i++;
                    }
                    while (array[j] > pivot) {
                        j--;
                    }
                    if (i <= j) {
                        exchangeNumbers(i, j);
                        //move index to next position on both sides
                        i++;
                        j--;
                    }
                }
                // call quickSort() method recursively
                if (lowerIndex < j)
                    quickSort(lowerIndex, j);
                if (i < higherIndex)
                    quickSort(i, higherIndex);
            }

            private void exchangeNumbers(int i, int j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

        }

        // return list;




         class HeapsortTest {
            // Java program for implementation of Heap Sort
            //public class HeapSort
//        	{
            public int [] heapSort(int [] array){
                final long startTime = System.currentTimeMillis();
                int [] list = array;
                //implement here

                //public void sort(int arr[])
                //{
                int n = array.length;

                // Build heap (rearrange array)
                for (int i = n / 2 - 1; i >= 0; i--)
                    heapify(array, n, i);

                // One by one extract an element from heap
                for (int i=n-1; i>=0; i--)
                {
                    // Move current root to end
                    int temp = array[0];
                    array[0] = array[i];
                    array[i] = temp;

                    // call max heapify on the reduced heap
                    heapify(array, i, 0);
                }
                return list;
            }

            // To heapify a subtree rooted with node i which is
            // an index in arr[]. n is size of heap
            void heapify(int arr[], int n, int i)
            {
                int largest = i; // Initialize largest as root
                int l = 2*i + 1; // left = 2*i + 1
                int r = 2*i + 2; // right = 2*i + 2

                // If left child is larger than root
                if (l < n && arr[l] > arr[largest])
                    largest = l;

                // If right child is larger than largest so far
                if (r < n && arr[r] > arr[largest])
                    largest = r;

                // If largest is not root
                if (largest != i)
                {
                    int swap = arr[i];
                    arr[i] = arr[largest];
                    arr[largest] = swap;

                    // Recursively heapify the affected sub-tree
                    heapify(arr, n, largest);
                }
            }

            /* A utility function to print array of size n */
            void printArray(int arr[])
            {
                int n = arr.length;
                for (int i=0; i<n; ++i)
                    System.out.print(arr[i]+" ");
                System.out.println();
            }



            //  return list;
        }








       // public int [] shellSort(int [] array){
            final long startTime = System.currentTimeMillis();
            //int [] list = array;
            //implement here

            int inner, outer;
            int temp;

            int h = 1;
            while (h <= array.length / 3) {
                h = h * 3 + 1;
            }
            while (h > 0) {
                for (outer = h; outer < array.length; outer++) {
                    temp = array[outer];
                    inner = outer;

                    while (inner > h - 1 && array[inner - h] >= temp) {
                        array[inner] = array[inner - h];
                        inner -= h;
                    }
                    array[inner] = temp;
                }
                h = (h - 1) / 3;
            }
            final long endTime = System.currentTimeMillis();
            final long executionTime = endTime - startTime;
            this.executionTime = executionTime;
            return list;

    }




    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
