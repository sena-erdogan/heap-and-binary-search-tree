JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES =  Heap.java BinaryTree.java BinarySearchTree.java BSTHeapTree.java driver.java

default: classes

classes: $(CLASSES:.java=.class)
	java driver

clean:
	$(RM) *.class
