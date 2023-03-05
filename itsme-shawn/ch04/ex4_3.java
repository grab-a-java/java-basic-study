public class ex4_3 {
  public static void main(String[] args) {
    int res = 0;
    int now = 0;

    for (int i = 1; i <= 10; i++) {
      now += i;
      res += now;
    }

    System.out.println("res : " + res);

  }
}
