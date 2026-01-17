public class CircularQueue {
	int array[] = new int[5];
	int front = -1;
	int rear = -1;
	int max = array.length;

	public void enqueue(int data) {
		if(rear == -1 && front == -1) {
			front++;
			rear++;
			array[rear] = data;
		} else if((rear+1)%max == front) { 
			System.out.println("Queue is Overflow!");
		} else {
			rear = (rear+1)%max;
			array[rear] = data;
		}
	}

	public void dequeue() {
		if(rear == -1 && front == -1) {
			System.out.println("Queue is Underflow!");
		} else if(front == rear) {
			int temp = array[front];
			rear = front = -1;
		} else {
			int temp = array[front];
			front = (front+1)%max;
		}
	}

	public void rear() {
		if(rear == -1 && front == -1) {
			System.out.println("Queue is Underflow!");
		} else {
			System.out.println("Rear value is "+queue[rear]+". Rear index is"+rear);
		}
	}

	public void front() {
		if(rear == -1 && front == -1) {
			System.out.println("Queue is Underflow!");
		} else {
			System.out.println("Front value is "+queue[front]+". Front index is"+front);
		}
	}	

	public static void main(String[] args) {
		CircularQueue queue = new CircularQueue();

		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(99);
		queue.enqueue(70);
		queue.dequeue();
		queue.rear();
		queue.front();
	}
}