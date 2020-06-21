package Bai1;

import java.util.Iterator;

public class ArrayDeque<E> implements DequeADT <E> {
	public static final int CAPACITY=100000;
	private E[] data;
	private int frontDeque = 0;
	private int backDeque = 0;
	private int sizeDeque = 0;
	
	public ArrayDeque(int capacity) {
		data = (E[]) new Object[capacity];
	}
	
	public ArrayDeque() {
		this(CAPACITY);
	}
	
	@Override
	public void enqueueRear(E element) {
		// TODO Auto-generated method stub
		if(sizeDeque == CAPACITY) return;
		if(sizeDeque == 0) {
			data[backDeque] = element;
		}
		else {
			backDeque = (backDeque + 1)%CAPACITY;
			data[backDeque] = element;
		}
		
		sizeDeque++;
	}

	@Override
	public E dequeueFront() {
		// TODO Auto-generated method stub
		if(isEmpty()) return null;
		E value = data[frontDeque];
		frontDeque = (frontDeque + 1)% CAPACITY;
		sizeDeque--;
		return value;
	}

	@Override
	public E first() {
		if(!isEmpty()) return data[frontDeque];
		return null;
	}

	@Override
	public E last() {
		if(!isEmpty()) return data[backDeque];
		return null;
	}

	@Override
	public void enqueueFront(E element) {
		
		// TODO Auto-generated method stub
		if(sizeDeque == CAPACITY) return;
		if(sizeDeque == 0) {
			data[frontDeque] = element;
		}
		else {
			frontDeque = (frontDeque - 1 + CAPACITY) % CAPACITY;
			data[frontDeque] = element;
		}
		
		sizeDeque++;
	}

	@Override
	public E dequeueRear() {
		if(isEmpty()) return null;
		E item = data[backDeque];
		backDeque = (backDeque - 1 + CAPACITY) % CAPACITY;
		sizeDeque--;
		return item;
	}

	@Override
	public boolean isEmpty() {
		return sizeDeque == 0;
	}

	@Override
	public int size() {
		return sizeDeque;
	}

	@Override
	public Iterator<E> iterator() {
		Iterator<E> it = new Iterator<>() {
			private int currentIndex = frontDeque;

			@Override
			public boolean hasNext() {
				if(currentIndex != backDeque) return true;
				return false;
			}

			@Override
			public E next() {
				while(currentIndex != backDeque) {
					currentIndex = (currentIndex + 1)%CAPACITY;
				}
				return null;
			}
			
		};
		return it;
	}

}
