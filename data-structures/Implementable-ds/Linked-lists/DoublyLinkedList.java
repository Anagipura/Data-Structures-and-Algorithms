class Node {
	int data;
	Node next;
	Node prev;

	public Node(int data) {
		this.data = data;
		next = null'
		prev = null;
	}
}
public class DoublyLinkedList {
	public static Node head;
	public static Node tail;

	public boolean isEmpty() {
		return head == null;
	}

	public void addToHead(int data) {
		Node newNode = new Node(data);
		if(isEmpty() ==  true) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
	}

	public void deleteFormHead() {
		if(isEmpty() ==  true) {
			System.out.println("Empty Linked List!");
		} else {
			Node temp = head;
			head = head.next;
			head.prev = null;
		}
	}

	public void addToTail(int data) {
		Node newNode = new Node(data)
		if(isEmpty() == true) {
			System.out.println("Empty Linked List!");
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
	}

	public void deleteFromTail() {
		if(isEmpty() == true) {
			System.out.println("Empty Linked List!");
		} else {
			
		}
	}

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.addToHead(10);
	}
}