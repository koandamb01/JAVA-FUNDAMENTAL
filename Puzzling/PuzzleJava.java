import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 1, 2, 7, 9, 8, 13, 25, 32 };
        ArrayList<String> namesArray = new ArrayList<String>();
        namesArray.add("Nancy");
        namesArray.add("Fujibayashi");
        namesArray.add("Monochi");
        namesArray.add("Ishikawa");

        PuzzleJava myPuzzle = new PuzzleJava();
        // ArrayList<Integer> tempArr = new ArrayList<Integer>();
        // tempArr = myPuzzle.greaterThan(arr);

        // ArrayList<String> resNameArray = new ArrayList<String>();
        // resNameArray = myPuzzle.longCharacterThan5(namesArray);
        // System.out.println("List: " + resNameArray);

        // char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
        // 'l', 'm', 'n', 'o', 'p', 'q', 'r',
        // 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        // myPuzzle.myAlphabet(letters);

        // ArrayList<Integer> tempArr = new ArrayList<Integer>();
        // tempArr = myPuzzle.random55To100();
        // System.out.println("List: " + tempArr);

        // String str = myPuzzle.randomString();
        // System.out.println("String: " + str);
    }

    public ArrayList<Integer> greaterThan(int[] arr) {
        int sum = arr[0];
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] > 10) {
                newArr.add(arr[i]);
            }
        }
        System.out.println("The sum is: " + sum);
        return newArr;
    }

    public ArrayList<String> longCharacterThan5(ArrayList<String> arr) {
        ArrayList<String> longerNames = new ArrayList<String>();
        Collections.shuffle(arr);
        for (int i = 0; i < arr.size(); i++) {
            System.out.println("Name: " + arr.get(i));

            String tempName = arr.get(i);
            if (tempName.length() > 5) {
                System.out.println("Name with more than 5 characters: " + tempName);
                longerNames.add(tempName);
            }
        }
        return longerNames;
    }

    public void myAlphabet(char[] letters) {
        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

        ArrayList<Character> myLetters = new ArrayList<Character>();
        for (int i = 0; i < letters.length; i++) {
            myLetters.add(letters[i]);
        }
        // shuffle now
        Collections.shuffle(myLetters);
        System.out.println("The last element is: " + myLetters.get(myLetters.size() - 1));

        for (int i = 0; i < myLetters.size(); i++) {
            char temp = myLetters.get(i);
            for (int j = 0; j < vowels.length; j++) {
                if (temp == vowels[j]) {
                    System.out.println("Found a vowel: " + temp);
                }
            }

        }
    }

    public ArrayList<Integer> random55To100() {
        ArrayList<Integer> randArr = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 1; i <= 10; i++) {
            randArr.add(rand.nextInt(100 - 55) + 55);
        }
        // Sort the arrayList
        Collections.sort(randArr);
        return randArr;
    }

    public String randomString() {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuffer randStr = new StringBuffer();
        Random rand = new Random();

        for (int i = 1; i <= 5; i++) {
            int num = rand.nextInt(23);
            randStr.append(alphabet.charAt(num));
        }
        return randStr.toString();
    }

}