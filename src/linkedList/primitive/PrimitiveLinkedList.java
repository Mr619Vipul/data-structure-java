package linkedList.primitive;

public class PrimitiveLinkedList {
    private PrimitiveNode head;

    public void addToFront(int i){
        PrimitiveNode node = new PrimitiveNode(i);
        node.setNext(head);
        head = node;
    }
    public void printList(){
        PrimitiveNode current = head;
        System.out.print("Head ->");
        while (current !=null){
            System.out.print(current.getI()+"->");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
