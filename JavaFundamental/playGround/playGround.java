import java.util.ArrayList;

public class playGround {
    public static void main(String[] args) {
        // String FirstName = "Mohamed";
        // String LastName = "Koanda";
        // String HomeTown = "New York, NY";
        // int age = 23;
        // double avg;
        // boolean isValid = false;
        // char letter = 'M';

        // long start = System.currentTimeMillis();
        // int sum = 0;
        // for (int i = 0; i < Integer.MAX_VALUE; i++) {
        // sum += i;
        // }
        // System.out.println("Sum: " + sum);
        // long end = System.currentTimeMillis();
        // double total = (double) (end - start) / 1000;
        // System.out.println("Time of execution: " + total + " seconds");

        // String firstName = "mohamed";
        // String lastName = "Koanda";
        // int age = 23;
        // String greetings = String.format("Hi, My name is %s, and I'm year old.",
        // firstName);
        // System.out.println(greetings);
        // String fullName = firstName.concat(" " + lastName);
        // String fullName = firstName + " " + lastName;
        // System.out.println("FirstName: " + firstName);
        // System.out.println("LastName: " + lastName);
        // System.out.println("FullName: " + fullName);

        ArrayList<String> dynamicArray = new ArrayList<String>();
        dynamicArray.add("hello");
        dynamicArray.add("world");
        dynamicArray.add("etc");
        for (int i = 0; i < dynamicArray.size(); i++) {
            System.out.println(dynamicArray.get(i));
        }

    }

}