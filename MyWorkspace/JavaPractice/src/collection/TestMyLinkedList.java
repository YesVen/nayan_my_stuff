package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestMyLinkedList {
	public static void main (String a[]) {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		list.addFirst(11);
		list.addFirst(22);
		
		list.addLast(55);
		list.addLast(66);

		List<Integer> newList = new ArrayList<Integer>();
		newList.add(8);
		newList.add(9);
		
		list.add(5, newList);
		
	}
}

class MyLinkedList<E> {
	
	int size = 0 ;
	int modCount = 0;
	Node first;
	Node last;

	public void add (E e) {
		
		linkLast(e);
		
	}

	private void linkLast(E e) {
		Node newNode = new Node (last, e, null);
		Node l = last;
		if (last == null) {
			first = newNode;
		} else {
			l.next = newNode;
		}
		last = newNode;
		size++;
		modCount++;
	}
	
	public void addFirst (E e) {
		Node newNode = new Node (null, e, first);
		if (first == null) {
			first = newNode;
			last = newNode;
		} else {
			first.prev = newNode;
			first = newNode;
		}
		size++;
		modCount++;
	}
	
	public void add (int index, E e) {
		Node succ = getNodeAt(index);
		Node pred = succ.prev;
		
		Node newNode = new Node (pred, e, succ);
		pred.next = newNode;
		succ.prev = newNode;
		
	}
	
	public void add (int index, Collection<? extends E> c ) {
		Node succ = getNodeAt(index);
		Node pred = succ.prev;
		for (E e : c) {
			Node newNode = new Node (pred, e, succ);
			pred.next = newNode;
			succ.prev = newNode;
			pred = newNode;
		}
	}
	
	public E get (int index) {
		return getNodeAt(index).item;
	} 
	
	private Node getNodeAt (int index) {
		Node x = null;
		if (index < 0 || index >= size)
			throw new RuntimeException ("some message");
		
		if (index > size/2) {
			x = last;
			for (int i = size - 1; i > index; i--) {
				x = x.prev;
			}
		} else {
			x = first;
			for (int i = 0; i < index; i++) {
				x = x.next;
			}
		}
		return x;
	} 
	
	public void addLast (E e) {
		linkLast(e);
	}
	
	public E getFirst () {
		return first.item;
	}
	
	public E getLast () {
		return last.item;
	}
	
	class Node {
		Node prev;
		Node next;
		E item;
		
		Node (Node prev, E item, Node next) {
			this.prev = prev;
			this.item = item;
			this.next = next;
		}
	}
	
	

}
