public class BinarySearch {
	public static void main(String[] args) {
		int a[] = new int[] {10, 20, 30, 40, 50, 60, 70, 80, 90};

		int key = 80;

		int lower = 0;
		int upper = a.length-1;

		searchElement(a, key, lower, upper);
	}

	public static void searchElement(int a[],int key,int lower,int upper){

		while(lower <= upper) {
			int mid = (lower+upper)/2;
			System.out.println(mid);
			if(key < a[mid]) {
				upper = mid-1;
			} else if(key == a[mid]) {
				System.out.println("Key found at index "+ mid);
				break;
			} else if(key > a[mid]) {
				lower = mid +1;
			}
		}
		if(lower > upper) {
			System.out.println("Element not found in the array!");
		}
	}

	/** To calculate the ceiling value
	 * mid = 0 + (int) Maths.ceil((9-0)/2.0 )
	 *     =  0 + (int) Maths.ceil(4.5)
	 *     =  0 + (int) (5.0)
	 *     =  0 + 5 = 5
	* */
}