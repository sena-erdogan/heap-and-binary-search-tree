import java.util.*;
public class Heap<E extends Comparable<E>> implements Comparable<Heap<E>>, Iterable<E>{
	private class KWPriorityQueue<E> extends AbstractQueue<E>
	 implements Queue<E> {
		 // Data Fields
		 /** The ArrayList to hold the data. */
		 private ArrayList<E> theData;
		 /** An optional reference to a Comparator object. */
		 Comparator<E> comparator = null;
		 // Methods
		 
		 /** Returns size of priority queue
		 @returns size
		*/
		 public int size(){
		 
		 	return theData.size();
		 
		 }
		 // Constructor
		 public KWPriorityQueue() {
			 theData = new ArrayList<>();
		 }
		 /** Creates a heap-based priority queue with the specified initial
		 capacity that orders its elements according to the specified
		 comparator.
		 @param cap The initial capacity for this priority queue
		 @param comp The comparator used to order this priority queue
		 @throws IllegalArgumentException if cap is less than 1
		*/
		public KWPriorityQueue(int cap, Comparator<E> comp) {
			 if (cap < 1)
			 throw new IllegalArgumentException();
			 theData = new ArrayList<>();
			 comparator = comp;
		}

		/** Returns the first entry without removing it
		@return the first entry
		*/
		public E peek(){
	
			return theData.get(0);

		}

		/** Removes the first entry
		@return the removed entry
		*/
		public E remove(){

			if(theData.size() != 0){
			
				E item = theData.get(0);
				poll();
				return item;
				
			}else	throw new IndexOutOfBoundsException();

		}

		/** Returns true if priority queue is empty
		@return true if empty
		*/
		public boolean isEmpty(){

			return theData.size() == 0;

		}

		/** Swaps two values
		@param val1 first index
		@param val2 second index
		*/
		public void swap(int val1, int val2){

			E temp = theData.get(val1);
			theData.set(val1, theData.get(val2));
			theData.set(val2, temp);

		}

		 /** Assigns an iterator to the priority queue
		 @return the iterator
		*/
		public Iterator<E> iterator(){

			return theData.iterator();

		}

		 /** Removes an item
		 @param i item index
		 @return true if successfully removed
		 @throw IndexOutOfBoundsException if ith index does not exist
		*/
		private boolean remove(int i){

			if(theData.size() != 0 || i<size()-1){
			
				theData.remove(i);
	
				return true;
				
			}else	throw new IndexOutOfBoundsException();
		}

		 /** Returns an item
		 @param i index of the item
		 @return the item
		*/
		private E get(int i){

			if(theData.size() == 0 || i>theData.size()-1)	return null;
	
			return theData.get(i);

		}

		 /** Searches a given item
		 @param target The item to be found
		 @throws -1 if the item is not in the list
		*/
		private int search(E target){

			return theData.indexOf(target);

		}
		 /** Insert an item into the priority queue.
		 pre: The ArrayList theData is in heap order.
		 post: The item is in the priority queue and
		 theData is in heap order.
		 @param item The item to be inserted
		 @throws NullPointerException if the item to be inserted is null.
		*/
		@Override
		public boolean offer(E item) {
			 // Add the item to the heap.
			 theData.add(item);
			 // child is newly inserted item.
			 int child = theData.size() - 1;
			 int parent = (child - 1) / 2; // Find child's parent.
			 // Reheap
			 while (parent >= 0 && compare(theData.get(parent),
			theData.get(child)) > 0) {
				 swap(parent, child);
				 child = parent;
				 parent = (child - 1) / 2;
			 }
			 return true;
		}
		/** Remove an item from the priority queue
		 pre: The ArrayList theData is in heap order.
		 post: Removed smallest item, theData is in heap order.
		 @return The item with the smallest priority value or null if empty.
		*/
		@Override
		public E poll() {
			 if (isEmpty()) {
				 return null;
			 }
			 // Save the top of the heap.
			 E result = theData.get(0);
			 // If only one item then remove it.
			 if (theData.size() == 1) {
				 theData.remove(0);
				 return result;
			 }
			 /* Remove the last item from the ArrayList and place it into
			 the first position. */
			 theData.set(0, theData.remove(theData.size() - 1));
			 // The parent starts at the top.
			 int parent = 0;
			 while (true) {
				 int leftChild = 2 * parent + 1;
				 if (leftChild >= theData.size()) {
					 break; // Out of heap.
				 }
				 int rightChild = leftChild + 1;
				 int minChild = leftChild; // Assume leftChild is smaller.
				 // See whether rightChild is smaller.
				 if (rightChild < theData.size()
				 && compare(theData.get(leftChild),
				 theData.get(rightChild)) > 0) {
					 minChild = rightChild;
				 }
				 // assert: minChild is the index of the smaller child.
				 // Move smaller child up heap if necessary.
				 if (compare(theData.get(parent),
				 theData.get(minChild)) > 0) {
					 swap(parent, minChild);
					 parent = minChild;
				 } else { // Heap property is restored.
					 break;
				 }
			 }
			 return result;
		}
		/** Compare two items using either a Comparator object's compare method
		 or their natural ordering using method compareTo.
		 @pre: If comparator is null, left and right implement Comparable<E>.
		 @param left One item
		 @param right The other item
		 @return Negative int if left greater than right,
		 0 if left equals right,
		 positive int if left < right
		 @throws ClassCastException if items are not Comparable
		*/
		@SuppressWarnings("unchecked")
		private int compare(E left, E right) {
			
			 if (comparator != null) { // A Comparator is defined.
				 return -comparator.compare(left, right);
			 } else { // Use left's compareTo method.
				 return -((Comparable<E>) left).compareTo(right);
			 }
		}
	}
	private E root;
	private E right;
	private E left;
	
	private KWPriorityQueue<E> heapData = new KWPriorityQueue<E>();
	
	//Default constructor
	public Heap(){
	
		//INTENTIONALLY LEFT BLANK	
	
	}
	
	/**Constructor
	@param item the item*/
	public Heap(E item){
		
		heapData.offer(item);
	
	}
	
	/** Searches an item in the heap
	 @param target the item to be searched
	 @return -1 if was not found, index number if found
	*/
	public int search(E target){
	
		return heapData.search(target);
	
	}
	/** Merges two heaps together
	 @param obj the heap to be merged
	*/
	public void merge(Heap<E> obj){
		
		for(int i=0; i<obj.size(); i++)	offer(obj.poll());
	
	}
	/** Removes an item
	 @param the item to be removed
	 @return the removed item, null if the heap is empty
	*/
	public E removeith(int i){
	
		if(heapData.size() == 0)	return null;
		
		E item = get(i);
		
		remove(i);
		
		return item;
	
	}
	
	/** Size of the heap
	 @return size
	*/
	public int size(){
	
		return heapData.size();
	
	}
	/** Remove an item from the heap
	 @return The item with the smallest priority value or null if empty.
	*/
	public E poll(){
	
		return heapData.poll();
	
	}
	/** Returns the first entry without removing it
	@return the first entry
	*/
	public E peek(){
	
		return heapData.peek();
	
	}
	 /** Returns an item
	 @param i index of the item
	 @return the item
	*/
	public E get(int i){
	
		return heapData.get(i);
	
	}
	 /** Insert an item into the heap
	 @param item The item to be inserted
	 @throws NullPointerException if the item to be inserted is null.
	*/
	public boolean offer(E item){
	
		if(search(item) == -1)	return heapData.offer(item);
		else	return false;
	
	}
	 /** Removes an item
	 @param i item index
	 @return true if successfully removed
	*/
	public boolean remove(int i){
	
		return heapData.remove(i);
	
	}
	 /** Compares two items
	 @param item the other item
	 @return positive if item greater than parameter
	*/
	public int compareTo(E item){
	
		return heapData.get(0).compareTo(item);
	
	}
	 /** Compare two heaps' roots
	 @param obj the other heap
	 @return positive if heap greater than parameter
	*/
	public int compareTo(Heap<E> obj){
	
		return heapData.get(0).compareTo(obj.get(0)); 
	
	}
	/** Assigns an iterator to the heap
	 @return the iterator
	*/
	public HeapIterator iterator(){

		return new HeapIterator();

	}
	
	public class HeapIterator implements Iterator<E>{
	
		private int count = 0;
		private E lastItemReturned = null;
		//Default Constructor
		public HeapIterator(){
		
			count = 0;
		
		}
		//Constructor
		public HeapIterator(int i){
		
			if(i > 0 && i < heapData.size()-1)	count = i;
			else throw new NoSuchElementException();
		
		}
		/** Add an item
		 @param item the item to be added
		*/
		public void setLastValue(E item){
		
			heapData.offer(item);
		
		}
		/** Compare two heaps' roots
		 @return true if  has a next
		*/
		public boolean hasNext(){
		
			if(count == heapData.size()-1)	return false;
			else	return true;
		
		}
		/** Returns the next item
		 @return next item
		*/
		public E next(){
		
			if(hasNext()){
			
				lastItemReturned = heapData.get(count);
			
				count++;
			
				return lastItemReturned;
			
			}else{
			
				lastItemReturned = null;
				
				return null;
			
			}
		
		}
		/** Removes the item
		*/
		public void remove(){
		
			if(heapData.size() != 0){
			
				heapData.remove(count);
			
			}
		
		}
	
	}

}
