public class QueueFormArray {
	int array[] = new int[5];
	int front = 0; // can start form 0 or -1
	int rear = -1; // in initial state starts form -1

	public boolean isEmpty() {
		return front > rear;
	}

	public void enqueue(int value) {
		if(rear == array.length-1) {
			System.out.println("Queue is Overflow!"); //  if want can use a seperate method to check overflow
		} else {
			++rear;
			array[rear] = value;
		}
	}
	public void dequeue() {
		if(isEmpty() == true) {
			System.out.println("Queue is Underflow!"); // used a seperate method called isEmpty
		} else {
			int temp = array[front];
			front++;
		}
	}
	public void display() {
		if(isEmpty() == true) {
			System.out.println("Queue is Underflow!"); // used a seperate method called isEmpty
		} else {
			for (int i=front;i<=rear ;i++ ) {
				System.out.print(array[i]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		QueueFormArray queue = new QueueFormArray();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.dequeue();
		queue.display();
	}
}