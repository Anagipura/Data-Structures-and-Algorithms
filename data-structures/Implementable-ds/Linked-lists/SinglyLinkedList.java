class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		next = null;
	}
}
public class SinglyLinkedList {
	public static Node head;
	public static Node tail;

	public boolean isEmpty() {
		return head == null;
	}

	public void addToHead(int data) {
		Node newNode = new Node(data);
		if(isEmpty == true) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}

	}

	public void deleteFormHead() {
		if(isEmpty == true) {
			System.out.println("LinkedList is empty");
		} else {
			Node temp = head;
			head = head.next;
			System.out.println("Head deleted "+temp.data);
		}
	}

	public void addtoTail(int data) {
		Node newNode = new Node(data)
		if(isEmpty == true) {
			System.out.println("LinkedList is empty");
		} else {
			tail.next = tail;
			tail = newNode;
		}
	}

	public void deleteFromTail() {
		if(isEmpty == true) {
			System.out.println("LinkedList is empty");
		} else {
			Node temp = head;
			while(temp.next.next != null) {
				temp = temp.next;
			}
			Node preTail = temp;
			preTail.next =  null;
			tail = preTail;
		}
	}

	public Node searchNode(int data) {
		for(Node temp=head;head.next!=null;next=next.next) {
			if(temp.data == data) {
				return temp;
			} 
		}
		return null;
	}

	public int count() {
		Node temp = head;
		int count = 0;
		while(temp.next!=null) {
			++count;
			temp = temp.next;
		}
		return count;
	}

	public void insertAfter(int loc, int data) {
		Node newNode = new Node(data);
		Node preNode = searchNode(loc);
		if(prevNode == null) {
			System.out.println("Location Node not found!");
		} else if(preNode == tail) {
			addtoTail(data);
		} else {
			newNode.next = preNode.next;
			preNode.next = newNode;
		}
	}

	public void deleteNode(int data) {
		if(isEmpty == true) {
			System.out.println("LinkedList is empty");
		} else {
			Node temp = head;
			while(temp.next!=null) {
				if(temp.next.data = data) {
					Node preNode = temp;
					Node postNode = preNode.next.next;
					preNode.next = postNode;
				}
				temp = temp.next; 
			}
		}
	}

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.addToHead(10);
		list.addToHead(20);
		list.addToHead(30);
		list.addToHead(40);
		list.addToHead(50);
		list.addToHead(60);
		list.deleteFormHead();
		list.addtoTail(100);
		list.deleteFromTail();
		Node returnNode = list.searchNode(30);
		list.insertAfter(30,35);
		list.count();
		list.deleteNode(40);
	}
}