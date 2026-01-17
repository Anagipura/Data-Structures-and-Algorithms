public class stackFromArray {
	int array[] = new int[5];
	int top = -1;
	int n = array.length-1;

	public boolean isOverflow() {
		return top == n;
	}

	public boolean isUnderflow() {
		return top == -1;
	}

	public void push(int data) {
		if(isOverflow()) {
			System.out.println("Stack Overflow!");
		} else {
			top++;
			array[top] = data;
		}
	}

	public void pop() {
		if(isUnderflow()) {
			System.out.println("Stack Underflow!")
		} else {
			int temp = array[top]; // if wants, one can return or show this value
			top--;
		}
	}

	public void printStack() {
		if(isUnderflow()) {
			System.out.println("Stack Underflow!")
		} else {
			for(int i=top;i>=0;i--) {
				System.out.println(array[i]);
			}
		}
	}

	public void peek() {
		if(isUnderflow()) {
			System.out.println("Stack Underflow!")
		} else {
			int topValue = array[top];
			System.out.println("Top => "+topValue);
		}
	}

	public static void main(String[] args) {
		stackFromArray stack = new stackFromArray();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.pop();
	}
}