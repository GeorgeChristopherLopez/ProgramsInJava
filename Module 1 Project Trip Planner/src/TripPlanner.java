import java.util.Scanner;

public class TripPlanner {
  public static void main (String [] args) {
      Greeting();
  }

  public static void Greeting (){
      Scanner input = new Scanner(System.in);
      System.out.println("Welcome to Vacation Planner!");
      System.out.print("What is your name? ");
      String name = input.nextLine();
      System.out.print("Nice to meet you "+ name +", where are you traveling to? ");
      String tripLocation = input.nextLine();
      System.out.println("Great! "+ tripLocation + " sounds like a great trip");
      TimeAndBudget();
    }

    public static void TimeAndBudget (){
        System.out.println("****************");
        System.out.println(" ");
        System.out.println(" ");
        Scanner input = new Scanner(System.in);
        System.out.print("How many days are you going to spend traveling? ");
        String days = input.nextLine();
        System.out.print("How much money, in USD, are you planning to spend on your trip? ");
        String budget = input.nextLine();
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String currency = input.nextLine();
        System.out.print("How many " + currency + " are there in 1 USD? ");
        String conversionRate = input.nextLine();

        System.out.println(" ");
        System.out.println(" ");





    }
}
