package com.example.req.linked.list;

/**
 * Sorted Linked List.
 * 
 * @author me
 *
 */
public class SortedLinkedList {

	Node head;

	public void add(int data) {
		Node item = new Node(data, null);
		this.addInternal(item);
	}

	private void addInternal(Node item) {
		// Head scenarios of null or the new data is smaller than in head.
		if (head == null || head.data > item.data) {
			item.next = head;
			head = item;
		} else {
			Node start = head;
			// Now data to be inserted in the middle
			while (start != null) {
				if (start.next != null && start.next.data <= item.data) {
					start = start.next;
				} else {
					// Found the position
					Node temp = start.next;
					start.next = item;
					item.next = temp;
					return;
				}
			}

		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node traverse = this.head;
		if (traverse == null) {
			sb.append("Sorted List is empty");
		} else {
			while (traverse != null) {
				sb.append(traverse.data).append(" ");
				traverse = traverse.next;
			}
		}
		return sb.toString();
	}
	
	
	
}
