public class ex4_10 {
  public static void main(String[] args) {
    int num = 12345;
    int sum = 0;

    // 문자열로 변환하지 말고 숫자로만 처리

    while (num != 0) {
      sum += num % 10;
      num /= 10;
    }

    System.out.println("sum=" + sum);
  }

}
