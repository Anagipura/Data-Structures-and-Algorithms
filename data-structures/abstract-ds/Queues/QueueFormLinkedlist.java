class Node {
	int value;
	Node next;
	public Node(int value) {
		this.value = value;
		next = null;
	}
}
public class QueueFormLinkedlist {
	public static Node front;
	public static Node rear;

	public boolean isEmpty() {
		return rear == null;
	}

	public void enqueue(int value) {
		Node newNode = new Node(value);
		if(front == null) {
			front = newNode;
			rear = newNode;
		} else {
			rear.next = newNode;
			rear = newNode;
		}
	}
	public void dequeue() {
		if(isEmpty() == true) {
			System.out.println("Queue is underflow!")
		} else {
			Node temp = front.value;
			front = front.next;
		}
	}

	public void display() {
		Node temp = front;
		while(temp != null) {
			System.out.print(temp.value);
			temp = temp.next;
		} System.out.println();
	}
	public static void main(String[] args) {
		QueueFormLinkedlist queue = new QueueFormLinkedlist();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.display(1);
	}
}