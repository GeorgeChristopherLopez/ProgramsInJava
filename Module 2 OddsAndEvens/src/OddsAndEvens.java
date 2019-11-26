import java.util.Scanner;

public class OddsAndEvens {

    public static void main (String[] args) {
             Start();
    }


    static void Start(){
        System.out.println("Let's Play a game called \"Odds and Evens\"");
        System.out.print("What is your name? ");
        Scanner input = new Scanner(System.in);
        String username = input.nextLine();
        System.out.print("Hi "+username+" Which do you chose? (O)dds or (E)vens ");
        String userChoice = PickOddsOrEvens();
        String computerChoice = " ";
        if(userChoice.equals("odds")){
             computerChoice = "evens";

        } else if (userChoice.equals("evens")){
             computerChoice = "odds";

        }
        System.out.println(username+" has picked "+userChoice+"! The computer will be "+computerChoice+".");
        System.out.println("-------------------------------");
        String result = PlayGame();
        // declare winner
        if (userChoice.equals(result+"s")) {
        System.out.println("That means "+username+" wins! :)");

        } else{
            System.out.println("That means computer wins! :)");
        }
        System.out.println("-------------------------------");
    }
     static String PickOddsOrEvens(){
        Scanner input = new Scanner(System.in);
        boolean choice = false;
        String userChoice = " ";
        while(!choice){
             userChoice = input.nextLine();
            if(userChoice.equals("O")){
                userChoice = "odds";
                choice = true;
            } else if (userChoice.equals("E")){
                userChoice = "evens";
                choice = true;
            } else {
                System.out.print("Improper choice, try again. Which do you chose? (O)dds or (E)vens ");
            }

        }
        return userChoice;
    }
    static String PlayGame(){
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("How many \"fingers\" do you put out? ");
        int userFingers = input.nextInt();
        int computerFingers = (int) Math.floor(Math.random()*4) + 1;
        System.out.println("The computer plays "+computerFingers+" \"fingers\".");

        System.out.println("-------------------------------");
        System.out.println();
        int sum = userFingers + computerFingers;
        String result = OddOrEven(sum);
        System.out.println(userFingers+" + "+computerFingers+" = "+ sum);
        System.out.println(sum+" is ..."+result+"!");
       return result;
    }

    static String OddOrEven(int sum){
        String result = "";
        if (sum % 2 == 0){
        result = "even";
        } else {
            result = "odd";

        }
             return result;
    }

}
