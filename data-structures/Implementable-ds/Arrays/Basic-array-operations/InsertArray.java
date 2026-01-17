public class InsertArray {
	public static void insertArray(int a[],int newElement,int position) {
		for(int i=a.length-1;i>position;i--) {
			a[i] = a[i-1];
		}
		a[position] = newElement;

		System.out.print("Element "+newElement+" Interted to index "+position +" ");
	}
	public static void main(String[] args) {
		int a[] = {10, 20, 30, 50, 60, 70, 80, 90};

		int newElement = 40;
		int position  = 3;

		insertArray(a, newElement, position);
		System.out.println(Arrays.toString(a));
	}
}
