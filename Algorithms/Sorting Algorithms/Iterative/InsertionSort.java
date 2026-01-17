public class InsertionSort {
	public void insertionSort(int array[]) {
		int n = array.length;
//      to manage cycles(iterations)
		for(int i=1;i<n;i++) {
			int min = array[i]; 
			int temp = i-1;
			// to compare temp value to array[i-1] value find a min value from that range
			while(temp>=0 && array[temp] > min) {
				array[temp+1] = array[temp];
				temp--;
			}
			//shift
			array[temp+1] = min;
		}
	}
	public static void main(String[] args) {
		InsertionSort sort = new InsertionSort();
		//                min <= initial state
		int array[] = {10, 2, 10, 16, 8, 90, 56, 1, 99, 37};
		//   		  temp
		sort.insertionSort(array);
		for(int i:array) {
			System.out.print(i+" ");
		}
	}
}