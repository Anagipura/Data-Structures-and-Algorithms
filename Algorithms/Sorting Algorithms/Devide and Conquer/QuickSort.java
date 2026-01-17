public class QuickSort {

    // Recursive quicksort function
    public void quickSort(int array[], int lb, int ub) {
        // Base condition: only sort if lower bound < upper bound
        if (lb < ub) {
            // Partition the array and get the pivot index
            int loc = partition(array, lb, ub);

            // Recursively sort the left subarray (elements before pivot)
            quickSort(array, lb, loc - 1);

            // Recursively sort the right subarray (elements after pivot)
            quickSort(array, loc + 1, ub);
        }
    }

    // Partition function: rearranges elements around a pivot
    public int partition(int array[], int lb, int ub) {
        // Choose the first element as pivot
        int pivot = array[lb];
        int start = lb;
        int end = ub;

        // Loop until start and end cross
        while (start < end) {
            // Move start forward until we find an element greater than pivot
            while (array[start] <= pivot && start < ub) {
                ++start;
            }

            // Move end backward until we find an element smaller or equal to pivot
            while (array[end] > pivot && end > lb) {
                --end;
            }

            // If start and end haven't crossed, swap the elements
            if (start < end) {
                int temp = array[end];
                array[end] = array[start];
                array[start] = temp;
            }
        }

        // Finally, swap pivot with element at 'end' position
        int temp = array[end];
        array[end] = array[lb];
        array[lb] = temp;

        // Return the final pivot position
        return end;
    }

    public static void main(String[] args) {
        QuickSort sort = new QuickSort();
        int array[] = {7, 11, 14, 6, 9, 4, 3, 12};
        int lb = 0;
        int ub = array.length - 1;

        sort.quickSort(array, lb, ub);

        for (int ele : array) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}