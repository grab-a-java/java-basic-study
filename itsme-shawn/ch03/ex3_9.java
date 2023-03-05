public class ex3_9 {
  public static void main(String[] args) {
    char ch = '3';

    boolean b = (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' || ch >= '0' && ch <= '9') ? true : false;

    System.out.println(b);
  }
}
