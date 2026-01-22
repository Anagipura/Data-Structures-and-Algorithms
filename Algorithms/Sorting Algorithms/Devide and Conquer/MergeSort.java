public class MergeSort {

    // Method to divide the array into sub-arrays
    public void mergeSort(int array[], int lb, int ub) {

        // Continue dividing only if more than one element exists
        if (ub > lb) {

            // Find the middle index
            int mid = (ub + lb) / 2;

            // Recursively sort the left half
            mergeSort(array, lb, mid);

            // Recursively sort the right half
            mergeSort(array, mid + 1, ub);

            // Merge the sorted left and right halves
            merge(array, lb, mid, ub);
        }
    }

    // Method to merge two sorted sub-arrays
    public void merge(int array[], int lb, int mid, int ub) {

        // Calculate size of left sub-array
        int lsArrLen = (mid - lb) + 1;

        // Calculate size of right sub-array
        int rhsArrLen = (ub - mid);

        // Create temporary left and right sub-arrays
        int lsArr[] = new int[lsArrLen];
        int rsArr[] = new int[rhsArrLen];

        // Copy elements into left sub-array
        for (int i = 0; i < lsArrLen; i++) {
            lsArr[i] = array[lb + i];
        }

        // Copy elements into right sub-array
        for (int j = 0; j < rhsArrLen; j++) {
            rsArr[j] = array[mid + 1 + j];
        }

        // Initialize indices for left, right, and main array
        int i = 0, j = 0, k = lb;

        // Compare elements from both sub-arrays and insert in sorted order
        while (i < lsArrLen && j < rhsArrLen) {
            if (lsArr[i] <= rsArr[j]) {
                array[k] = lsArr[i];  // Insert smaller element
                i++;
            } else {
                array[k] = rsArr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from left sub-array (if any)
        while (i < lsArrLen) {
            array[k] = lsArr[i];
            i++;
            k++;
        }

        // Copy remaining elements from right sub-array (if any)
        while (j < rhsArrLen) {
            array[k] = rsArr[j];
            j++;
            k++;
        }
    }

    // Main method to test Merge Sort
    public static void main(String[] args) {

        MergeSort sort = new MergeSort();

        // Input array
        int array[] = {10, 2, 10, 16, 8, 90, 56, 1, 99, 37};

        // Call merge sort
        sort.mergeSort(array, 0, array.length - 1);

        // Print sorted array
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
