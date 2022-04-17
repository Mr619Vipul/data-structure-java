package doublyLinkedList.object;

public class EmployeeDoublyLinkedListDriver {
    public static void main(String[] args) {
        Employee ajayS = new Employee("ajay", "singh", 123);
        Employee amitO = new Employee("Amit","omar",124);
        Employee amitY = new Employee("Amit", "yadav",125);
        Employee abhiP = new Employee("Abhishek", "pal", 126);


        EmployeeDoublyLinkedList list =new EmployeeDoublyLinkedList();
        System.out.println(list.isEmpty());
        list.addToFront(ajayS);
        list.addToFront(amitY);
        list.addToFront(amitO);
        list.addToEnd(abhiP);

        list.printList();
        System.out.println(list.getSize());
        System.out.println(list.isEmpty());

        list.removeFromFront();
        System.out.println(list.getSize());
        list.printList();

        list.removeFromEnd();
        System.out.println(list.getSize());
        list.printList();
    }
}
