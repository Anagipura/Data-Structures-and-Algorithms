public class SelectionSort {

	public void selectionSort(int array[]) {
		int n = array.length;

		//to arrange elements to the sorted sub array
		for(int i=0;i<n-1;i++) {
			int min = i;
			// to find the min value from the unsorted array
			for(int j=i+1;j<n;j++) {
				if(array[j] < array[min]) {
					min = j;
				}
			}
			// swap
			int temp = array[min];
			array[min] = array[i];
			array[i] = temp;
		}
	}

	public static void main(String[] args) {
		SelectionSort sort = new SelectionSort();
		int array[] = {10, 2, 10, 16, 8, 90, 56, 1, 99, 37};

		sort.selectionSort(array);
		for(int i:array) {
			System.out.print(i+" ");
		}

	}
}