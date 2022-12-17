import java.util.ArrayList;
import java.util.Currency;

public class Main {
    public static void main(String[] args) {

        float value = Float.parseFloat(args[0]);
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

        int[] amount = new int[currency.size()];

        float remainValue = value;

        for(int i = 0 ; i < currency.size();i++){

            amount[i] = (int)(remainValue / currency.get(i));
            remainValue = (remainValue - amount[i] * currency.get(i));
            //remainValue = remainValue % currency.get(i);
            if(remainValue == 0.f){
                break;
            }
        }

        //Print
        System.out.println("NOTAS: ");
        for (int i = 0; i < 7; i++){

            System.out.printf("%d notas de R$ %.2f\n", amount[i], currency.get(i));

        }
        System.out.println("MOEDAS: ");
        for (int i = 7; i < currency.size(); i++){

            System.out.printf("%d moedas de R$ %.2f\n", amount[i], currency.get(i));

        }

    }
}