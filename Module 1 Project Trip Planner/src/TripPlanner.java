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
        int days = input.nextInt();
        System.out.print("How much money, in USD, are you planning to spend on your trip? ");
        double dollars = input.nextDouble();
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String currency = input.next();
        System.out.print("How many " + currency + " are there in 1 USD? ");
        double conversionRate = input.nextDouble();
        int hours = days * 24;
        int minutes = hours * 60;
        double dollarsPerDay = dollars / days;
        double dollarsConverted = dollars * conversionRate;
        double dollarsPerDayConverted = dollarsConverted / days;
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("If you are traveling for " + days + " days that is the same as "+hours +" hours or " + minutes + " minutes");
        System.out.println("If you are going to spend $" + dollars + " USD that means per day you can spend up to "+ dollarsPerDay +"USD");
        System.out.println("Your total budget in "+ currency+ " is "+ dollarsConverted +" " + currency + ", which per day is "+ dollarsPerDayConverted+ " "+currency);

    }
}
