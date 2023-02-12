
//Given a bunch of shuffled sentences create an algorithm to fix the sentences
//with the first arg equals the number of sentences and then the sentences to be fixed

public class Main {
    public static void main(String[] args) {

        int numberOfSentence = Integer.parseInt(args[0]);

        for (int i = 1; i < numberOfSentence + 1; i++){

            if(args[i].length() < 2 || args[i].length() > 100){
                continue;
            }
           StringBuilder firstHalf = new StringBuilder();
           firstHalf.append(args[i], 0, args[i].length() / 2);
           firstHalf.reverse();

           StringBuilder secondHalf = new StringBuilder();
           secondHalf.append(args[i], args[i].length() / 2, args[i].length());
           secondHalf.reverse();

           String fixedSentence = firstHalf + secondHalf.toString();

           System.out.println(fixedSentence);
        }
    }
}