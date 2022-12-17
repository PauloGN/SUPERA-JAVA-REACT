import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int arraySize = Integer.parseInt(args[0]);
        int keyValue = Integer.parseInt(args[1]);

        int[] myArray = new int[arraySize];

        Random rand = new Random();

        for (int i = 0; i < myArray.length; i++){

            myArray[i] = rand.nextInt(11);

        }

        int amountOfResults = 0;

        for (int i = 0; i < myArray.length; i++){

            for (int j = i+1; j < myArray.length; j++ ){
                if((myArray[i] - myArray[j] == keyValue) || (myArray[j] - myArray[i] == keyValue)){
                  amountOfResults++;
                }
            }
        }


        System.out.println(amountOfResults);


    }
}