package phone.src;

public class PhoneTester {
	public static void main(String[] args) {
		Galaxy s9 = new Galaxy("S9", 78, "T-Mobile", "Ring Ring Ring!!!");
		Iphone Iphone5 = new Iphone("5", 90, "Simple Mobile", "Serge Benaud Qoui!!!");
		
		s9.displayInfo();
		System.out.println(s9.ring());
		System.out.println(s9.unlock());
		
		Iphone5.displayInfo();
		System.out.println(Iphone5.ring());
		System.out.println(Iphone5.unlock());
		
	}
}
