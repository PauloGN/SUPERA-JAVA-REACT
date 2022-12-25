import java.util.ArrayList;
import java.util.Currency;

public class Main {
    public static void main(String[] args) {

        //Getting the values from external source
        float value = Float.parseFloat(args[0]);

        //Currency used to split the value
        ArrayList<Float> currency = new ArrayList<>();

        currency.add(100.f);
        currency.add(50.f);
        currency.add(20.f);
        currency.add(10.f);
        currency.add(5.f);
        currency.add(2.f);
        currency.add(1.f);
        currency.add(.5f);
        currency.add(.25f);
        currency.add(.1f);
        currency.add(.05f);
        currency.add(.01f);

        //Store the amount of currency into respective index
        int[] amount = new int[currency.size()];

        //The value remaining after calculating each banknote and coin
        float remainingValue = value;

        for(int i = 0 ; i < currency.size();i++){

            //Truncate the amount value to get only the integer part (amount of currency)
            amount[i] = (int)(remainingValue / currency.get(i));
            //Get the remaining value
            remainingValue = (remainingValue - amount[i] * currency.get(i));
            //remainingValue = remainingValue % currency.get(i); another way to calculate remaining value
            if(remainingValue == 0.f){
                break;
            }
        }

        //Printing out back notes
        System.out.println("NOTAS: ");
        for (int i = 0; i < 7; i++){

            if(amount[i] == 0)
                continue;

            System.out.printf("%d notas de R$ %.2f\n", amount[i], currency.get(i));
        }
        //Printing out coins
        System.out.println("MOEDAS: ");
        for (int i = 7; i < currency.size(); i++){

            if(amount[i] == 0)
                continue;

            System.out.printf("%d moedas de R$ %.2f\n", amount[i], currency.get(i));
        }
    }
}