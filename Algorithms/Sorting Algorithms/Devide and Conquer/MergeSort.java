public class MergeSort {
	public void mergeSort(int array[]) {
		if(ub>lb) {
			int mid = (ub+lb)/2;
			mergeSort(array, lb, mid);
			mergeSort(array, mid+1, ub);
			merge(array, ub, lb, mid);
		}
	}

	public void merge(int array[], int ub, int lb, int mid) {
		int lsArrLen = (mid-lb)+1; // define the length of the left sub array
		int rhsArrLen = (ub-mid); // define the length of the right sub array

		int lsArr[] = new int[lsArrLen]; // creating left sub array
		int rsArr[] = new int[rhsArrLen];// creating right sub array

		for(int i=0;i<lsArrLen;i++) {
			lsArr[i] = array[lb+i]; // assign values to left sub array
		}

		for(int j=0;j<rhsArrLen;j++) {
			rsArr[j] = array[mid+1+j]; // assign values to right sub array
		}

		int i=0; int j=0; int k=lb;

		while(i<lsArrLen && j<rhsArrLen) {
			if(lsArr[i] <= rsArr[j]) { // compare left sub array values and right sub array values and assign min value into the main array by order
				array[k] = lsArr[i];
				i++;
			} else {
				array[k] = rsArr[j];
				j++;
			}
			k++;
		}

		while(i<lsArrLen) {
			array[k] = lsArr[i]; // if there are still values left in left side array ,put them
			i++;
			k++;
		}

		while(j<lsArrLen) {
			array[k] = rsArr[j]; //  if there are still values left in right side array ,put them
			j++;
			k++;
		}
	}

	public static void main(String[] args) {
		MergeSort sort = new MergeSort();
		int array[] = {10, 2, 10, 16, 8, 90, 56, 1, 99, 37};
		int ub = array.length-1;
		int lb = 0;
		sort.mergeSort(array, ub, lb);
	}
}