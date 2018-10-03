package d.linked.list;

public class DLL {
	public Node head;
	public Node tail;
	
	public DLL() {
		this.head = null;
		this.tail = null;
	}
	
	public void push(Node newNode) {
        if(this.head == null) {
            this.head = newNode;
            this.tail = newNode;
            return;
        }
        
        Node lastNode = this.tail;
        lastNode.next = newNode;
        newNode.prev = lastNode;
        this.tail = newNode;
    }
	
	public void printValuesForward() {
		if(this.head == null) {
			System.out.println("The DLL is empty!");
			
		} else if(this.head.next.next == null) {
			System.out.println("<- Root -> " + this.head.next.value);
		}
		
		Node runner =  this.head;
		String output = "List Forward: Head";
		while(runner.next != null) {
			output += " -> " + runner.value;
			runner = runner.next;
		}
		output += " -> " + runner.value + " -> Tail";
		System.out.println(output);
	}
	
	public void printValuesBackward() {
		if(this.head == null) {
			System.out.println("The DLL is empty!");
			
		} else if(this.head.next.next == null) {
			System.out.println("<- Root -> " + this.head.next.value);
		}
		
		Node runner =  this.tail;
		String output = "List Backward: Tail";
		while(runner.prev != null) {
			output += " -> " + runner.value;
			runner = runner.prev;
		}
		output += " -> " + runner.value + " -> Head";
		System.out.println(output);
	}
	
	public Node pop() {
		Node resNode;
		if(this.head == null) {
			System.out.println("The DLL is empty!");
			
		} else if(this.head.next.next == null) {
			resNode = this.head;
			return resNode;
		}
		
		resNode = this.tail;
		this.tail = this.tail.prev;
		this.tail.next = null;
		return resNode;
	}
	
	public boolean contains(Integer value) {
		if(this.head == null) {
			System.out.println("The DLL is empty!");
			
		} else if(this.head.next.next == null && this.head.value == value) {
			System.out.println("Found it!!!");
			return true;
		}
		
		Node runner = head;
		while(runner != null) {
			if(runner.value == value) { 
				System.out.println("Found it!!!");
				return true; 
			}
			runner = runner.next;
		}
		System.out.println("Value was not Found!!!");
		return false;
	}
	
	public int size() {
		int counter = 0;
		if(this.head == null) {
			System.out.println("The DLL is empty!");
			
		} else if(this.head.next.next == null) {
			counter++;
			System.out.println("There are " + counter + " values in this DLL");
			return counter;
		}
		
		Node runner = head;
		while(runner != null) {
			counter++;
			runner = runner.next;
		}
		System.out.println("There are " + counter + " values in this DLL");
		return counter;
	}
	
	public void insertAt(Node newNode, int index) {
		if(this.head == null) {
			this.head = newNode;
			this.tail = newNode;
		}
		
		Node runner =  this.head;
		int counter = 0;
		while(runner != null) {
			if(counter == index) {
				newNode.prev = runner.prev;
				newNode.prev.next = newNode;
				runner.prev = newNode;
				newNode.next = runner;
			}
			counter++;
			runner = runner.next;
		}
	}
	
	public void removeAt(int index) {
		if(this.head == null) {
			System.out.println("The DLL is empty!");
		}
		
		Node runner =  this.head;
		int counter = 0;
		while(runner != null) {
			if(counter == index) {
				runner.prev.next = runner.next;
				runner.next.prev = runner.prev;
			}
			counter++;
			runner = runner.next;
		}
	}
	
	
	public boolean isPalindrome() {
		if(this.head == null) {
			System.out.println("The DLL is empty!");
			System.out.println("This DLL is NOT a Palindrome");
//			return false;
		}
		
		Node headRunner = this.head;
		Node tailRunner = this.tail;
		
		while(headRunner.next != tailRunner.prev && headRunner.next != tailRunner) {
			
			if(headRunner.value != tailRunner.value) {
				System.out.println("This DLL is NOT a Palindrome");
				return false;
			}
			
			headRunner = headRunner.next;
			tailRunner = tailRunner.prev;
		}
		
		if(headRunner.value != tailRunner.value) {
			System.out.println("This DLL is NOT a Palindrome");
			return false;
		}
		
		System.out.println("This DLL is a Palindrome");
		return true;
	}
	
	
	
	
	
	
	
}
