public class FizzBuzz {
    public String fizzbuzz(int number) {
        String str;
        if (number % 15 == 0) {
            str = "FizzBuzz";
        } else if (number % 3 == 0) {
            str = "Fizz";
        } else if (number % 5 == 0) {
            str = "Buzz";
        } else {
            str = "" + number + "";
        }
        return str;
    }
}