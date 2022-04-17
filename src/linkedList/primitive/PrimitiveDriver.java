package linkedList.primitive;

public class PrimitiveDriver {
    public static void main(String[] args) {
        PrimitiveLinkedList primitiveLinkedList = new PrimitiveLinkedList();

        primitiveLinkedList.addToFront(4);
        primitiveLinkedList.addAfter(5,6);
        primitiveLinkedList.printList();
        primitiveLinkedList.addToFront(3);
        primitiveLinkedList.addToFront(2);
        primitiveLinkedList.addToFront(1);
        primitiveLinkedList.printList();
        primitiveLinkedList.addToEnd(5);
        primitiveLinkedList.printList();
        primitiveLinkedList.addAfter(4,5);
        primitiveLinkedList.printList();
        primitiveLinkedList.addAfter(5,6);
        primitiveLinkedList.printList();
        primitiveLinkedList.deleteNode(5);
        primitiveLinkedList.deleteNode(5);
        primitiveLinkedList.printList();
    }

}
