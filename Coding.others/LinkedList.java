package study.coding.others;

public class LinkedList {

	public Node head;

	public static class Node
	{
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public LinkedList insertElement(LinkedList ll,int data)
	{
		Node newNode = new Node(data);
		//if no node present in ll
		if(ll.head == null) {
			ll.head = newNode;
		}
		else {
			//1 or more than 1 node present in ll
			Node tmp = ll.head;
			while(tmp.next != null) {
				tmp = tmp.next;
			}
			tmp.next = newNode;
		}
		return ll;
	}

	//to print LL
	public void printLL(LinkedList ll) {
		if(ll.head == null) {
			System.out.println("LL is empty");
		}
		else
		{
			Node currentNode = ll.head;
			while(currentNode != null) {

				System.out.print(currentNode.data + " -> ");
				currentNode = currentNode.next;
			}
			System.out.println("null");
		}
	}


	public static void main(String[] args) {

		LinkedList ll = new LinkedList();
		ll.insertElement(ll, 1);
		ll.insertElement(ll, 2);
		ll.insertElement(ll, 3);
		ll.insertElement(ll, 9);
		ll.insertElement(ll, 7);
		ll.printLL(ll);
	}

}
