public class Main {
    public static void main(String[] args) {

        int numberOfSentence = Integer.parseInt(args[0]);
        for (int i = 1; i < numberOfSentence + 1; i++){

           StringBuilder firstHalf = new StringBuilder();
           firstHalf.append(args[i], 0, args[i].length() / 2);
           firstHalf.reverse();

           StringBuilder secondHalf = new StringBuilder();
           secondHalf.append(args[i], args[i].length() / 2, args[i].length());
           secondHalf.reverse();

           System.out.println(firstHalf + secondHalf.toString());

        }
    }
}