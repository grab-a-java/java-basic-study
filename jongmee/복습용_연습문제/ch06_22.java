public class ch06_22 {
  /*
  (1) isNumber . 메서드를 작성하시오
  */
  public static boolean isNumber(String str){
    for(int i=0;i<str.length();i++){
      char c = str.charAt(i);
      if((int)c < 48 || (int)c > 57){
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args) {
    String str = "123";
    System.out.println(str+"는 숫자입니까? "+isNumber(str));
    str = "1234o";
    System.out.println(str+"는 숫자입니까? "+isNumber(str));
  }
}
