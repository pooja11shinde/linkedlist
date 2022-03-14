package Collection;

public class DoublyLinkedList {
	
	class Node {
		public int data;
		public Node prevNode;
		public Node nextNode;

		public Node(int data) {
			this.data = data;
		}
	}

	Node headNode, tailNode = null;

	public void addDLLNode(int data) {
		Node newDLLNode = new Node(data);
		if (headNode == null) {
			headNode = tailNode = newDLLNode;
			headNode.prevNode = null;
			tailNode.nextNode = null;
		} else {
			tailNode.nextNode = newDLLNode;
			newDLLNode.prevNode = tailNode;
			tailNode = newDLLNode;
			tailNode.nextNode = null;
		}
	}

	public void deleteInitialNode() {
		if (headNode == null) {
			System.out.println("Doubly Linked List is empty");
			return;
		} else {
			if (headNode != tailNode) {
				headNode = headNode.nextNode;
			} else {
				headNode = tailNode = null;
			}
		}
	}

	public void displayNode() {
		Node currentNode = headNode;
		if (headNode == null) {
			System.out.println("Doubly Linked List is empty");
			return;
		}
		System.out.println("Nodes in Doubly Linked List: ");
		while (currentNode != null) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.nextNode;
		}
	}

	public static void main(String[] args) {
		DoublyLinkedList dLinkedList = new DoublyLinkedList();
		dLinkedList.addDLLNode(9);
		dLinkedList.addDLLNode(7);
		dLinkedList.addDLLNode(5);
		dLinkedList.addDLLNode(3);
		dLinkedList.addDLLNode(1);
		dLinkedList.addDLLNode(3);
		dLinkedList.addDLLNode(5);
		dLinkedList.addDLLNode(7);
		dLinkedList.displayNode();
		dLinkedList.deleteInitialNode();
		dLinkedList.displayNode();


	}


	}

