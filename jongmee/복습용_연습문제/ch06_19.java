public class ch06_19 {
  /**
   *  다음 코드의 실행 결과를 예측하여 적으시오.
   */
  public static void change(String str) {
    str += "456";
  }
  public static void main(String[] args)
  {
    String str = "ABC123";
    System.out.println(str);
    change(str);
    System.out.println("After change:"+str);
  }
}

/**
 * ABC123
 * After change:ABC123
 */