package doublyLinkedList.object;

public class EmployeeDoublyLinkedList {
    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addToFront(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        if(head==null){
            tail = node;
        }else{
            head.setPrev(node);
        }
        head = node;
        size++;
    }

    public void addToEnd(Employee employee ){
        EmployeeNode node = new EmployeeNode(employee);
        if(tail==null){
            head = node;
        }else{
            tail.setNext(node);
            node.setPrev(tail);
        }
        tail = node;
        size++;
    }

    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return head == null;
    }

    public void printList(){
        EmployeeNode current = head;
        System.out.print("Head ->");
        while (current !=null){
            System.out.println(current+"<->");
            current = current.getNext();
        }
        System.out.println("null");
    }
    public EmployeeNode removeFromFront(){
        if (isEmpty()){
            return null;
        }
        EmployeeNode removedNode = head;
        if(head.getNext()==null){
            head = tail = null;
            return removedNode;
        }

        head  = head.getNext();
        head.setPrev(null);

        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public EmployeeNode removeFromEnd(){
        if (isEmpty()){
            return null;
        }
        EmployeeNode removedNode = tail;
        if(head.getNext()==null){
            head = tail = null;
            return removedNode;
        }
        tail =tail.getPrev();
        tail.setNext(null);
        removedNode.setPrev(null);
        return removedNode;
    }
}
