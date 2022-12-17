import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static boolean isGreater(int n1, int n2){

        if (n1%2 == 0 && n2 % 2 != 0 ){
            return false;
        }

        if (n1%2 != 0 && n2 % 2 == 0 ){
            return true;
        }

        return n1 > n2;

    }

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();


        if(args.length < 2){

            System.out.println("Digite 10 numero inteiros: ");

            Scanner sc = new Scanner(System.in);

            for (int i = 0; i < 10; i++){
                numbers.add(sc.nextInt());
            }
        }
        for (int i = 1; i < args.length; i++){

            numbers.add(Integer.parseInt(args[i]));

        }


        for (int i = 0; i<numbers.size(); i++){

            for (int j = i+1; j<numbers.size(); j++ ) {

                if(isGreater(numbers.get(i), numbers.get(j))){

                    int temp = numbers.get(i);
                    numbers.set(i, numbers.get(j));
                    numbers.set(j, temp);
                }
            }
        }

        for (int i = 0; i<numbers.size(); i++){

            System.out.println(numbers.get(i));
        }


    }
}