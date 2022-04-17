package linkedList.primitive;

public class PrimitiveLinkedList {
    private static PrimitiveNode head;

    public void addToFront(int data){
        PrimitiveNode node = new PrimitiveNode(data);
        node.setNext(head);
        head = node;
    }

    public void addToEnd(int data){
        PrimitiveNode node = new PrimitiveNode(data);
        if(head==null){
          head = node;
          return;
        }
        PrimitiveNode last = head;
        while(last.getNext() != null){
            last = last.getNext();
        }
        last.setNext(node);
        return;
    }

    public void addAfter(int preData,int data){
        PrimitiveNode newNode = new PrimitiveNode(data);
        PrimitiveNode preNode = head;
        while(preNode.getNext() !=null && preNode.getData()!=preData){
            preNode = preNode.getNext();
        }
        newNode.setNext(preNode.getNext());
        preNode.setNext(newNode);
        return;
    }

    public void deleteNode(int data){
        if(head.getData()==data){
            head =head.getNext();
            return;
        }
        PrimitiveNode current = head;
        PrimitiveNode previous = head;
        while(current!=null ){
            if(current.getData()==data){
                previous.setNext(current.getNext());
                return;
            }
            previous =current;
            current = current.getNext();
        }

    }

    public void printList(){
        PrimitiveNode current = head;
        System.out.print("Head ->");
        while (current !=null){
            System.out.print(current.getData()+"->");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
