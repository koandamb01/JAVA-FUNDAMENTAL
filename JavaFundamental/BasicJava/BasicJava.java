import java.util.ArrayList;

public class BasicJava {
    public static void main(String[] args) {

    }

    public print1To255(){
        for (int i = 1; i <= 255; i++){
            System.out.println(i);
        }
    }

    printOdd1To255(){
        for (int i = 1; i <= 255; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }

    printSumFrom1To255(){
        int sum = 0;
        for (int i = 0; i <= 255; i++){
            System.out.println("New Number: " + i +" Sum: "+ sum);
            sum += i;
        }
    }

    iteratingArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println("Array element at "+ i + " is: "+ arr[i]);
        }
    }

    findMax(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("The Maximum Value of this array is: " + max);
    }

    getAverage(int[] arr){
        int sum = arr[0];
        for(int i = 1; i < arr.length; i++){
            sum += arr[i];
        }
        double avg = sum / arr.length;
        System.out.println("The average value of this array is: " + avg);
    }

    arrayWithOddNumbers(){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i <= 255; i++){
            if(i % 2 != 0){
                arr.add(i);
            }
            System.out.println("Array with all odd numbers from 0 to 255: " + arr);
        }
    }

    greaterThanY(int[] arr, int y){
        int counter = 0;
        for(int i = 1; i < arr.length; i++){
            if(i > y){
                counter++;
            }
        }
        System.out.println("There are " + counter + " elements that are greater than y: "+y);
    }

    squareArrayvalues(int[] arr){
        for(int i = 1; i < arr.length; i++){
            arr[i] = arr[i] * arr[i];
        }
    }

    eliminateNegativeNumbers(int[] arr){
        for(int i = 1; i < arr.length; i++){
            if(arr[i] == 0){
                arr[i] = 0;
            }
        }
    }

    maxMinAvg(int[] arr){
        int max = min = sum = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            } else if(arr[i] < min){
                min = arr[i];
            }
            sum += arr[i];
        }
        int avg = sum / arr.length;
        int[] myArr = {max, min, avg};
        return myArr;
    }

    shiftingArrayValues(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(i == arr.length - 1){
                arr[i] = 0;
            }else{
                arr[i] = arr[i+1];
            }
        }
    }
}
