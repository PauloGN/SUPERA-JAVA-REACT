import java.util.Random;


//getting two values by args size of collection number and target value, create an array of random values and then subtract the inner values one each other and compare if the values is equal the target value
//print the amount of positive results.


public class Main {
    public static void main(String[] args) {

        //getting external values from args
        int arraySize = Integer.parseInt(args[0]);//size of the collection of numbers
        int keyValue = Integer.parseInt(args[1]);//the target value

        int[] myArray = new int[arraySize];//create an array
        Random rand = new Random();

        //Filling up the array
        for (int i = 0; i < myArray.length; i++){
            myArray[i] = rand.nextInt(11);
        }

        int amountOfResults = 0;//to get the amount of results

        //Making comparisons
        for (int i = 0; i < myArray.length; i++){

            for (int j = i+1; j < myArray.length; j++ ){
                if((myArray[i] - myArray[j] == keyValue) || (myArray[j] - myArray[i] == keyValue)){
                  amountOfResults++;
                }
            }
        }

        //Printing up the final result
        System.out.println(amountOfResults);
    }
}