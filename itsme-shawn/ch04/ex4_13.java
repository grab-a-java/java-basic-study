public class ex4_13 {
  public static void main(String[] args) {
    String value = "12o34";
    char ch = ' ';
    boolean isNumber = true;

    for (int i = 0; i < value.length(); i++) {
      // 문자열의 문자가 숫자인지 체크
      if (!Character.isDigit(value.charAt(i)))
        isNumber = false;
    }
    if (isNumber) {
      System.out.println(value + "는 숫자입니다 .");
    } else {
      System.out.println(value + "는 숫자가 아닙니다 .");
    }
  }
}
