package linkedList.primitive;

public class PrimitiveDriver {
    public static void main(String[] args) {
        PrimitiveLinkedList primitiveLinkedList = new PrimitiveLinkedList();
        primitiveLinkedList.addToFront(4);
        primitiveLinkedList.addToFront(3);
        primitiveLinkedList.addToFront(2);
        primitiveLinkedList.addToFront(1);
        primitiveLinkedList.printList();
    }

}
