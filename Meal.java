import java.io.Console;

public class Meal{



    public static void main(String[] args){
      askWhatYouAteFor("Breakfast");
      askWhatYouAteFor("Lunch");
      askWhatYouAteFor("Dinner");
    }
    public static void askWhatYouAteFor(String meal){
      Console myConsole = System.console();
      System.out.printf("What did you eat for %s?\n",meal);
      String yourMeal = myConsole.readLine();
      System.out.printf("I ate %s\n",yourMeal);
    }

}
