package linkedList.primitive;

public class PrimitiveNode {
    private int data;
    private PrimitiveNode next;

    public PrimitiveNode(int i) {
        this.data = i;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public PrimitiveNode getNext() {
        return next;
    }

    public void setNext(PrimitiveNode next) {
        this.next = next;
    }

}
