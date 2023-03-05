public class ex3_7 {
  public static void main(String[] args) {
    int fahrenheit = 100;
    float celcius = (float) (fahrenheit - 32) * 5 / 9;

    System.out.println("fahrenheit: " + fahrenheit);
    System.out.printf("celcius : %.2f", celcius);
    System.out.println();
  }
}
