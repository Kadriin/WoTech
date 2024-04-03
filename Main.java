public class Main {
  public static void main(String[] args) {    
    System.out.println("Hello world!");
    // winter, spring, summer, autumn
    // warm jacket, t-shirt, swimming suite, rain coat
    double temperature = 50;

    if (temperature <= 5) {
      System.out.println("Wear a super warm clothes!");
    }
    else if (temperature <= 15) {
      System.out.println("Wear warm!");
    }
    else if (temperature <= 30) {
      System.out.println("Wear normal!");
    }
    else {
      System.out.println("You need cooling!");
    }    
  }
}
