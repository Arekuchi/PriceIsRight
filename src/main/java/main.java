import java.util.Scanner;





public class main {

    public static void PriceIsRight(){

        Scanner sc = new Scanner(System.in);

        int number = 1 + (int) (100*Math.random());

        int K = 7;
        int i, guess;

        System.out.println(
                "A number is chosen"
                + " between 1 and 100"
                + "Guess the number"
                + " within 5 trial.");

        for (i = 0; i < K; i++) {

            System.out.println(
                    "Guess the number : ");

            guess = sc.nextInt();

            if (number == guess) {
                System.out.println(
                        "Congratulations !!"
                        + " You have guessed the number."
                );
                break;
            } else if (number > guess && i != K - 1){
                System.out.println(
                        "The number is greater than " + guess
                );


            } else if (number < guess && i != K -1) {
                System.out.println(
                        "The number is lesser than " + guess
                );
            }
        }

        if (i == K) {
            System.out.println("You have exhausted your 7 chances"
            + "The number was " + number);

        }


    }

    public static void main (String arg[]) {
        PriceIsRight();
    }



}
