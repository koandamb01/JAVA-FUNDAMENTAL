package d.linked.list;

public class DLLTest {
	public static void main(String[] args) {
		DLL dll = new DLL();
        Node n1 = new Node(30);
        Node n2 = new Node(10);
        Node n3 = new Node(25);
        Node n4 = new Node(10);
        Node n5 = new Node(30);
        Node n6 = new Node(100);
//        Node n7 = new Node(11);
        
        dll.push(n1);
        dll.push(n2);
        dll.push(n3);
        dll.push(n4);
        dll.push(n5);
        dll.push(n6);
        
        dll.printValuesForward();
//        dll.printValuesBackward();
//        dll.contains(3);
//        dll.size();
//        dll.pop();
//        dll.insertAt(n7, 2);
//        dll.removeAt(2);
        dll.isPalindrome();
//        dll.printValuesForward();
        
	}
}
