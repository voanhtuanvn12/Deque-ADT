package Bai1;


import java.util.Iterator;

/**
 * Abstract Data Type to represent a double ended queue
 * @author sehall
 */
interface DequeADT<E> {
    public void enqueueRear(E element);
    
    public E dequeueFront();
    
    public E first();
    
    public E last();
    
    public void enqueueFront(E element);
    
    public E dequeueRear();
    
    public boolean isEmpty();
    
    public int size();
    
    public Iterator<E> iterator();
}