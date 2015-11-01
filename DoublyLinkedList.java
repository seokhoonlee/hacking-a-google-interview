public class DoublyLinkedList {
	public class LinkedList {
		public class Node {
			public int value;
			public Node next;
			public Node prev;

			public Node(int value) {
				this.value = value;
			}
		}

		public Node head;

		public LinkedList() {
			head = null;
		}

		public void insert(int value) {
			Node insert = new Node(value);

			if (head == null) {
				head = insert;
			} else {
				Node curr = head;
				
				while (curr.next != null) {
					curr = curr.next;
				}

				curr.next = insert;
				insert.prev = curr;
			}
		}

		public void delete(int value) {
			Node curr = head;

			while (curr != null && curr.value != value) {
				curr = curr.next;
			}

			if (curr != null) {
				if (curr.next == null) {
					curr.prev.next = null;
					curr.prev = null;
				} else {
					curr.prev.next = curr.next;
					curr.next.prev = curr.prev;
				}
			}
		}

		public void print() {
			Node curr = head;

			while (curr != null) {
				System.out.print(curr.value + " ");
				curr = curr.next;
			}

			System.out.print("\n");
		}
	}

	void run() {
		LinkedList list = new LinkedList();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);

		list.print();

		list.delete(2);

		list.print();
	}

	public static void main(String args[]) {
		DoublyLinkedList program = new DoublyLinkedList();

		program.run();
	}
}