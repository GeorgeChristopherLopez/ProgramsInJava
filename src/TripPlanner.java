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
        int dollars = input.nextInt();
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
        System.out.println("If you are going to spend $" + dollars + " USD that means per day you can spend up to "+ round(dollarsPerDay) +" USD");
        System.out.println("Your total budget in "+ currency+ " is "+ round(dollarsConverted) +" " + currency + ", which per day is "+ round(dollarsPerDayConverted) + " "+currency);
        TimeDifference();

    }
        public static void TimeDifference(){
            System.out.println("****************");
            System.out.println(" ");
            System.out.println(" ");
            Scanner input = new Scanner(System.in);
            System.out.print("What is the time difference, in hours, between your home and your destination? ");
            int timeDif = input.nextInt();
            int midNiteThere = (timeDif + 0)% 24;
            int noonThere = (timeDif + 12)%24;

            System.out.println("That means that when it is midnight at home it will be "+ midNiteThere +":00 in your travel destination");
            System.out.println("and when it is noon at home it will be " + noonThere+":00");
            CountryArea();
        }
        public static void CountryArea(){
            System.out.println("****************");
            System.out.println(" ");
            System.out.println(" ");
            Scanner input = new Scanner(System.in);
            System.out.print("What is the square of your destination country in km2? ");
            double areaInKM = input.nextInt();
            double areaInMiles = areaInKM * .621371;
            System.out.println("In miles2 that is " + round(areaInMiles));
            System.out.println("****************");
        }

        static double  round (double num){
        double answerFromOne = num * 100;
        int answerFromTwo = (int) answerFromOne;
        double res =  answerFromTwo / 100.00;

        return res;
        }

        // extra fun
        public static void howFar(){
            System.out.println("****************");
            System.out.println(" ");
            System.out.println(" ");
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the longitude and latitude for your HOME? ");
            System.out.print("Home Longitude: ");
            double homeLongitude = input.nextInt();
            System.out.print("Home Latitude: ");
            double homeLatitude = input.nextInt();
            System.out.println("Enter the longitude and latitude for your DESTINATION? ");
            System.out.print("Destination Longitude: ");
            double destinationLongitude = input.nextInt();
            System.out.print("Destination Latitude: ");
            double destinationLatitude = input.nextInt();
            


        }

}
