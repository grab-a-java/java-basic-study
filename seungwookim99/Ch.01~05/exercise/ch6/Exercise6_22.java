class Exercise6_22 {
  static boolean isNumber(String str) {
    if (str == null || str.equals("")) {
      // 주의 ! str == null 체크 후 문자열비교
      return false;
    }
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) < '0' || str.charAt(i) > '9') {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    String str = null;
    System.out.println(str + "는 숫자입니까? " + isNumber(str));

    str = "1234o";
    System.out.println(str + "는 숫자입니까? " + isNumber(str));
  }
}