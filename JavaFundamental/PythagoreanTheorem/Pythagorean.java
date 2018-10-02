
// import PythagoreanTheorem.MyMath.*;
import JAVA.MyMath.*;

public class Pythagorean {
    public static void main(String[] args) {
        MathHouse obj = new MathHouse();
        double legC = obj.calculateHypotenuse(5, 9);
        System.out.println("Hypotenuse is: " + legC);
    }
}