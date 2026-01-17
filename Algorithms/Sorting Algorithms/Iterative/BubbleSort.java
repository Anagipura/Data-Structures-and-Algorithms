public class BubbleSort {
	public void bubbleSort(int array[]) {
		int n = array.length; // n=10;
		// to manage cycles
		for(int i=0;i<n-1;i++) {
			// to manage the bubble
			for(int j=0;j<n-i-1;j++) {
				if(array[j+1] > array[j]) {
					// swap
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		BubbleSort sort = new BubbleSort();
//                     i
		int array[] = {10, 2, 10, 16, 8, 90, 56, 1, 99, 37};
//                     j  j+1


		// condition => array[J+1] > array[j] =>true => swap

		sort.bubbleSort(array);
		for(int i:array) {
			System.out.print(i+" ");
		}

	}
}