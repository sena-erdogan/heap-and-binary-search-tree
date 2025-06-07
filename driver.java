import java.util.*;
import java.util.Random.*;
@SuppressWarnings("unchecked")
public class driver{
	public static void main(String args[]){
	
		Heap<Integer> heap1 = new Heap();
		System.out.println("New heap named heap1 is created");
		
		System.out.println("heap1's size is " + heap1.size());
		
		heap1.offer(25);
		System.out.println("25 is added to heap1");
		System.out.println("heap1's size is " + heap1.size());
		System.out.println("heap1.peek() = " + heap1.peek());
		System.out.println("Item 25's position is " + heap1.search(25));
		
		heap1.offer(23);
		System.out.println("23 is added to heap1");
		System.out.println("heap1's size is " + heap1.size());
		System.out.println("heap1.peek() = " + heap1.peek());
		System.out.println("Item 23's position is " + heap1.search(23));
		
		heap1.offer(34);
		System.out.println("34 is added to heap1");
		System.out.println("heap1's size is " + heap1.size());
		System.out.println("heap1.peek() = " + heap1.peek());
		System.out.println("Item 34's position is " + heap1.search(34));
		
		heap1.offer(71);
		System.out.println("71 is added to heap1");
		System.out.println("heap1's size is " + heap1.size());
		System.out.println("heap1.peek() = " + heap1.peek());
		System.out.println("Item 71's position is " + heap1.search(71));
		
		heap1.offer(98);
		System.out.println("98 is added to heap1");
		System.out.println("heap1's size is " + heap1.size());
		System.out.println("heap1.peek() = " + heap1.peek());
		System.out.println("Item 98's position is " + heap1.search(98));
		
		heap1.removeith(0);
		System.out.println("0th element is removed.");
		System.out.println("heap1's size is " + heap1.size());
		
		heap1.offer(14);
		System.out.println("14 is added to heap1");
		System.out.println("heap1's size is " + heap1.size());
		System.out.println("heap1.peek() = " + heap1.peek());
		System.out.println("Item 14's position is " + heap1.search(14));
		
		heap1.offer(68);
		System.out.println("68 is added to heap1");
		System.out.println("heap1's size is " + heap1.size());
		System.out.println("heap1.peek() = " + heap1.peek());
		System.out.println("Item 68's position is " + heap1.search(68));
		
		heap1.offer(52);
		System.out.println("52 is added to heap1");
		System.out.println("heap1's size is " + heap1.size());
		System.out.println("heap1.peek() = " + heap1.peek());
		System.out.println("Item 52's position is " + heap1.search(52));
		
		heap1.offer(47);
		System.out.println("47 is added to heap1");
		System.out.println("heap1's size is " + heap1.size());
		System.out.println("heap1.peek() = " + heap1.peek());
		System.out.println("Item 47's position is " + heap1.search(47));
		
		System.out.println("heap1's size is " + heap1.size());
		System.out.println("heap1's 4th item is " + heap1.get(4));
		heap1.remove(4);
		System.out.println("4th item of heap1 is removed.");
		System.out.println("heap1's size is " + heap1.size());
		System.out.println("heap1's 4th item is " + heap1.get(4));
		
		heap1.offer(10);
		System.out.println("10 is added to heap1");
		System.out.println("heap1's size is " + heap1.size());
		System.out.println("heap1.peek() = " + heap1.peek());
		System.out.println("Item 10's position is " + heap1.search(10));
		
		heap1.offer(10);
		System.out.println("10 is added to heap1");
		System.out.println("heap1's size is " + heap1.size());
		
		heap1.removeith(3);
		System.out.println("3rd element is removed.");
		System.out.println("heap1's size is " + heap1.size());
		
		System.out.println("heap1.poll() = " + heap1.poll());
		System.out.println("heap1's size is " + heap1.size());
		
		System.out.println("heap1.poll() = " + heap1.poll());
		System.out.println("heap1's size is " + heap1.size());
		
		System.out.println("heap1's 0 index item is " + heap1.get(0));
		System.out.println("heap1.peek() = " + heap1.peek());
		
		Heap<Integer> heap2 = new Heap();
		System.out.println("New heap named heap2 is created");
		
		System.out.println("heap2's size is " + heap2.size());
		
		heap2.offer(36);
		System.out.println("36 is added to heap2");
		System.out.println("heap2's size is " + heap2.size());
		
		heap2.offer(53);
		System.out.println("53 is added to heap2");
		System.out.println("heap2's size is " + heap2.size());
		
		heap2.offer(10);
		System.out.println("10 is added to heap2");
		System.out.println("heap2's size is " + heap2.size());
		
		heap2.offer(52);
		System.out.println("52 is added to heap2");
		System.out.println("heap2's size is " + heap2.size());
		
		heap2.offer(25);
		System.out.println("25 is added to heap2");
		System.out.println("heap2's size is " + heap2.size());
		
		heap2.offer(96);
		System.out.println("96 is added to heap2");
		System.out.println("heap2's size is " + heap2.size());
		
		heap2.offer(57);
		System.out.println("57 is added to heap2");
		System.out.println("heap2's size is " + heap2.size());
		
		heap2.offer(27);
		System.out.println("27 is added to heap2");
		System.out.println("heap2's size is " + heap2.size());
		
		System.out.println("heap1's items");
		
		for(int i: heap1){
		
			System.out.println(i);
		
		}
		
		System.out.println("heap2's items");
		
		for(int i: heap2){
		
			System.out.println(i);
		
		}
		
		System.out.println("heap1's root is " + heap1.peek());
		System.out.println("heap2's root is " + heap2.peek());
		System.out.println("This will print positive if heap1's root is greater than heap2's: " + heap1.compareTo(heap2));
		
		System.out.println("This will print positive if heap1's root is greater than 10: " + heap1.compareTo(10));
		
		System.out.println("heap1's size is " + heap1.size());
		System.out.println("heap2's size is " + heap2.size());
		heap1.merge(heap2);
		System.out.println("heap1 is merged with heap2");
		System.out.println("heap1's size is " + heap1.size());
		
		heap1.iterator();
		System.out.println("Created an iterator for heap1");
		
		System.out.println("heap1's items");
		
		for(int i: heap1){
		
			System.out.println(i);
		
		}
		
		Heap<String> heap3 = new Heap();
		System.out.println("New heap named heap3 is created");
		
		System.out.println("heap3's size is " + heap3.size());
		
		heap3.offer("This item will be removed ");
		System.out.println("\"This item will be removed \" is added to heap1");
		System.out.println("heap3's size is " + heap3.size());
		System.out.println("heap3.peek() = " + heap3.peek());
		
		heap3.offer("If ");
		System.out.println("\"If \" is added to heap1");
		System.out.println("heap3's size is " + heap3.size());
		System.out.println("heap3.peek() = " + heap3.peek());
		
		heap3.offer("you ");
		System.out.println("\"you \" is added to heap1");
		System.out.println("heap3's size is " + heap3.size());
		System.out.println("heap3.peek() = " + heap3.peek());
		
		heap3.offer("make ");
		System.out.println("\"make \" is added to heap1");
		System.out.println("heap3's size is " + heap3.size());
		System.out.println("heap3.peek() = " + heap3.peek());
		
		heap3.offer("a ");
		System.out.println("\"a \" is added to heap1");
		System.out.println("heap3's size is " + heap3.size());
		System.out.println("heap3.peek() = " + heap3.peek());
		
		heap3.offer("plan ");
		System.out.println("\"plan \" is added to heap1");
		System.out.println("heap3's size is " + heap3.size());
		System.out.println("heap3.peek() = " + heap3.peek());
		System.out.println("Item \"plan\"'s position is " + heap3.search("plan"));
		
		heap1.poll();
		System.out.println("0th item of heap3 is removed.");
		System.out.println("heap3's size is " + heap3.size());
		System.out.println("heap3's 4th item is " + heap3.peek());
		
		Heap<String> heap4 = new Heap();
		System.out.println("New heap named heap4 is created");
		
		System.out.println("heap4's size is " + heap4.size());
		
		heap4.offer("Life ");
		System.out.println("\"Life \" is added to heap4");
		System.out.println("heap4's size is " + heap4.size());
		
		heap4.offer("never ");
		System.out.println("\"never \" is added to heap2");
		System.out.println("heap4's size is " + heap4.size());
		
		heap4.offer("works ");
		System.out.println("\"works \" is added to heap2");
		System.out.println("heap4's size is " + heap4.size());
		
		heap4.offer("out ");
		System.out.println("\"out \" is added to heap2");
		System.out.println("heap4's size is " + heap4.size());
		
		heap4.offer("this item will be removed");
		System.out.println("\"this item will be removed\" is added to heap2");
		System.out.println("heap4's size is " + heap4.size());
		
		heap4.offer("that ");
		System.out.println("\"that \" is added to heap2");
		System.out.println("heap4's size is " + heap4.size());
		
		heap4.offer("way ");
		System.out.println("\"way \" is added to heap2");
		System.out.println("heap4's size is " + heap4.size());
		
		heap1.remove(4);
		System.out.println("4th item of heap4 is removed.");
		System.out.println("heap4's size is " + heap4.size());
		System.out.println("heap4's 4th item is " + heap4.get(4));
		
		System.out.println("heap3's items");
		
		for(String i: heap3){
		
			System.out.println(i);
		
		}
		
		System.out.println("heap4's items");
		
		for(String i: heap4){
		
			System.out.println(i);
		
		}
		
		System.out.println("heap3's root is " + heap3.peek()); 
		System.out.println("heap4's root is " + heap4.peek());
		System.out.println("This will print positive if heap3's root is greater than heap4's: " + heap3.compareTo(heap4));
		
		System.out.println("This will print positive if heap3's root is greater than \"hey\": " + heap3.compareTo("hey"));
		
		System.out.println("heap3's size is " + heap3.size());
		System.out.println("heap4's size is " + heap4.size());
		heap3.merge(heap4);
		System.out.println("heap3 is merged with heap4");
		System.out.println("heap3's size is " + heap3.size());
		
		heap4.iterator();
		System.out.println("Created an iterator for heap4");
		
		System.out.println("heap3's items");
		
		for(String i: heap3){
		
			System.out.println(i);
		
		}
		
		BSTHeapTree<Integer> heaptree1 = new BSTHeapTree();
		System.out.println("Created an Integer BSTHeapTree named heaptree1");
		
		BSTHeapTree<String> heaptree2 = new BSTHeapTree();
		System.out.println("Created a String BSTHeapTree named heaptree2");
		
		Heap<Integer> heap5 = new Heap(259);
		System.out.println("Created an Integer Heap named heap5");
		System.out.println("heap5's initial value is " + heap5.peek());
		System.out.println("size of heap5 is " + heap5.size());
		
		Heap<String> heap6 = new Heap("First Item");
		System.out.println("Created a String Heap named heap6");
		System.out.println("heap6's initial value is " + heap6.peek());
		System.out.println("size of heap6 is " + heap6.size());
		
		Integer[] arr = new Integer[3000];
		
		Random r = new Random();
		
		for(int i=0; i<3000; i++){
		
			Integer num = r.nextInt(5000);
		
			heaptree1.add(num);
			arr[i] = num;
		
		}
		
	}
	
}
