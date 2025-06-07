import java.util.*;
import java.io.*;

@SuppressWarnings("unchecked")
public class BSTHeapTree<E extends Comparable<E>>{

	private BinarySearchTree<Heap<E>> theData = new BinarySearchTree();
	
	protected static class Node<E extends Comparable<E>> implements Serializable{
		 // Data Fields
		 /** The information stored in this node. */
		 protected E data;
		 protected int mode=0;
		 /** Reference to the left child. */
		 protected Node<E> left;
		 /** Reference to the right child. */
		 protected Node<E> right;
		 // Constructors
		 /** Default Constructor */
		 public Node(){
		  left = null;
		 right = null;
		 }
		 /** Construct a node with given data and no children.
		 @param data The data to store in this node
		 */
		 public Node(E data) {
		 this.data = data;
		 left = null;
		 right = null;
		 }
		 // Methods
		 /** Increments the mode value*/
		public void incMode(){
	
			mode++;
	
		}
		/** Decrements the mode value*/
		public void decMode(){
	
			mode--;
	
		}
		/** returns the mode value
		@return mode
		*/
		public int getMode(){
	
			return mode;
	
		}
		 /** Return a string representation of the node.
		 @return A string representation of the data fields
		 */
		 public String toString () {
		 return data.toString();
		 }
	}
	/** Default Constructor
	 */
	public BSTHeapTree(){
	
		Heap tempHeap = new Heap();
		
		theData.add(tempHeap);
	
	}
	/** Constructor
	@param item the first item
	 */
	public BSTHeapTree(E item){
	
		Heap tempHeap = new Heap(item);
		
		theData.add(tempHeap);
	
	}
	/** Constructor
	@param obj the first heap object
	 */
	public BSTHeapTree(Heap<E> obj){
	
		theData.add(obj);
	
	}
	/** Starter add method
	@param item the item to be added
	 @return mode value of the item
	 */
	public int add(E item){
	
		//return add(item, root);
		return 1;
	
	}
	/** Adds a new value to the BSTHeapTree and returns the mode of the added item
	@param item the item to be added
	@param root the localroot of the BSTHeapTree
	 @return mode value of the item
	 */
	private int add(E item, Node<Heap<E>> root){
	
		if(theData.size() == 7){
		
			Node<Heap<E>> tempNode = new Node(item);
			
			root.left = tempNode;
			
			inc(item, root);
			
			return find(item);
		
		}else if(root.left == null && root.right == null){
		
			Heap<E> tempHeap = new Heap(item);
			
			theData.add(tempHeap);
			
			inc(item, root);
			
			return find(item);
		
		}else if(root.left != null)	return add(item, root.left);
		else	return add(item, root.right);
	
	}
	/** Increments the mode value of the item
	@param item the item to be added
	@param root the localroot of the BSTHeapTree
	 */
	private void inc(E item, Node<Heap<E>> root){
	
		if(root.data == item){
			root.incMode();
			return;
		}else if(root.left == null && root.right == null)	return;
		else if(root.left == null)	inc(item, root.right);
		else	inc(item, root.left);
	
	}
	/** Decrements the mode value of the item
	@param item the item to be added
	@param root the localroot of the BSTHeapTree
	 */
	private void dec(E item, Node<Heap<E>> root){
	
		if(root.data == item){
			root.decMode();
			return;
		}else if(root.left == null && root.right == null)	return;
		else if(root.left == null)	dec(item, root.right);
		else	dec(item, root.left);
	
	}
	/** Starter remove method
	@param item the item to be removed
	 @return mode value of the item
	 */
	public int remove(E item){
	
		//return remove(item, root);
		return 1;
	
	}
	/** Removes an item from the BSTHeapTree and returns the mode of the removed item
	@param item the item to be removed
	@param root the localroot of the BSTHeapTree
	 @return mode value of the item
	 */
	private int remove(E item, Node<Heap<E>> root){
	
		if(root.data == item){
			remove(item);
			
			dec(item, root);
			
			return find(item);
		}else if(root.left == null && root.right == null)	return 0;
		else if(root.left == null)	return remove(item, root.right);
		else	return remove(item, root.left);
	
	}
	/** Starter find method
	@param item the item
	 @return mode value of the item
	 */
	public int find(E target){
	
		return find(target); 
	
	}
	/** Finds the mode value of an item
	@param item the item
	@param root the localroot of the BSTHeapTree
	 @return mode value of the item
	 */
	public int find(E target, Node<Heap<E>> root){
	
		if(root.data == target)	return root.mode;
		else if(root.left == null && root.right == null)	return 0;
		else if(root.left != null)	return find(target, root.left);
		else	return find(target, root.right);
	
	}
	/** Starter find method
	@param item the item
	 @return mode value of the item
	 */
	public int find_mode(E item){

		//return find_mode(item, theData.root);
		return 1;
	
	}
	/** Finds the mode value of an item
	@param item the item
	@param root the localroot of the BSTHeapTree
	 @return mode value of the item
	 */
	private int find_mode(E item, Node<Heap<E>> root){
	
		if(root.data == item)	return root.mode;
		else if(root.left == null && root.right == null)	return 0;
		else if(root.left != null)	return find_mode(item, root.left);
		else	return find_mode(item, root.right);
	
	}

}
