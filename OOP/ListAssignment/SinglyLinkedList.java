import com.sun.org.apache.xpath.internal.operations.And;

public class SinglyLinkedList {
    public Node head;

    public SinglyLinkedList() {
        head = null;
    }

    // SLL methods go here. As a starter, we will show you how to add a node to the
    // list.
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while (runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }

    public void remove() {
        if (head == null) {
            System.out.println("No node to remove");
        } else if (head.next == null) {
            head = null;
        } else {
            Node runner = head;
            while (runner.next.next != null) {
                runner = runner.next;
            }
            runner.next = null;
        }
    }

    public void removeAt(int idx) {
        if (head == null) {
            System.out.println("No node to remove");
        } else if (head.next == null && idx == 0) {
            head = null;
        } else {
            Node runner = head.next;
            Node previous = head;
            int counter = 0;
            while (runner.next != null) {
                counter++;
                if (counter == idx) {
                    previous.next = runner.next;
                }
                previous = previous.next;
                runner = runner.next;
            }
        }
    }

    public Node find(int target) {
        if (head == null) {
            System.out.println("No node");
        } else if (head.next == null && head.value == target) {
            return head;
        } else {
            Node runner = head;
            while (runner.next != null) {
                if (runner.value == target) {
                    return runner;
                }
                runner = runner.next;
            }
            runner.next = null;
        }
        Node newNode = new Node(0);
        return newNode;
    }

    public void printValues() {
        Node runner = head;
        String mylist = "root -> ";
        while (runner != null) {
            mylist += " " + runner.value + " -> ";
            runner = runner.next;
        }
        System.out.println(mylist);
    }

}