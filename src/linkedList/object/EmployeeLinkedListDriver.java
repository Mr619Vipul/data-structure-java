package linkedList.object;

public class EmployeeLinkedListDriver {
    public static void main(String[] args) {
        Employee ajayS = new Employee("ajay", "singh", 123);
        Employee amitO = new Employee("Amit","omar",124);
        Employee amitY = new Employee("Amit", "yadav",125);
        Employee abhiP = new Employee("Abhishek", "pal", 126);


        EmployeeLinkedList list =new EmployeeLinkedList();
        System.out.println(list.isEmpty());
        list.addToFront(ajayS);
        list.addToFront(amitY);
        list.addToFront(amitO);
        list.addToFront(abhiP);

        list.printList();
        System.out.println(list.getSize());
        System.out.println(list.isEmpty());

        list.removeFromFront();
        System.out.println(list.getSize());
    }
}
