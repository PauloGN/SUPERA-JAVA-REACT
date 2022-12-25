import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    /*
    Checks two integers and decides if the order must be changed,
    Numbers must follow even crescent and odd crescent order respectively.
    */
    public static boolean SwitchPos(int n1, int n2){

        if (n1 % 2 == 0 && n2 % 2 != 0 ){
            return false;
        }

        if (n1%2 != 0 && n2 % 2 == 0 ){
            return true;
        }

        return n1 > n2;
    }

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        //just in case of no external arguments
        if(args.length < 1){

            System.out.println("Digite 10 numero inteiros: ");

            Scanner sc = new Scanner(System.in);

            for (int i = 0; i < 10; i++){
                numbers.add(sc.nextInt());
            }
        }

        //In case of external args convert from string to int and save into an array list;
        for (int i = 0; i < args.length; i++){

            numbers.add(Integer.parseInt(args[i]));
        }

        //Simple bubble sort algorithm.
        for (int i = 0; i<numbers.size(); i++){

            for (int j = i+1; j<numbers.size(); j++ ) {

                if(SwitchPos(numbers.get(i), numbers.get(j))){

                    int temp = numbers.get(i);
                    numbers.set(i, numbers.get(j));
                    numbers.set(j, temp);
                }
            }
        }

        //Print final Result
        for (int i = 0; i<numbers.size(); i++){

            System.out.println(numbers.get(i));
        }
    }
}