public class LinearSearch{
	public static void main(String[] args) {
		// index ==> 0  1   2    3   4   5   6
		int a[]  = {12, 26, 35, 44, 61, 80, 99, 100};

		int key = 100;

		int index  = searchArray(a,key);
		if(index == -1){
			System.out.println("Key cannot find in the given array!");
		} else {
			System.out.println("Key found in the index "+ index);
		}
	}
	
	public static int searchArray(int a[], int key){
		for(int i=0; i<a.length ; i++){
			if(a[i] == key){
				return i;
			}
		}
		return -1;
	}
}