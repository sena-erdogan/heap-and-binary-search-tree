# heap-and-binary-search-tree

The following features are implemented for the Heap structure:
- Search for an element
- Merge with another heap
- Removing ith largest element from the Heap
- Extend the Iterator class by adding a method to set the value (value passed as parameter) of the last element returned by the next methods.

A BSTHeapTree class is implemented that keeps the elements in a Binary Search Tree where the nodes store max-Heap with a maximum depth of 2 (maximum number of elements
included in a node is 7).

1. Each node in the heap holds two data: a value and the number of occurrences of the value (how many that number is added to the tree).
2. Movement on BST is based on values at the root nodes of the Heap.
3. If the Heap at a node of BST is full and a new number still needs to be added, a new BST node should be created as the left or the right child of the BST node.
4. Remove operation removes only one occurrence of the value. If the number of
occurrences becomes zero than the value should be removed.
5. During a remove operation, if the heap at a node becomes empty, the corresponding
BST node should be removed as well.
6. The mode is the value in the BSTHeapTree that occurs most frequently.

Assignment from the Data Structures and Algorithms course (GTU, 2021)
