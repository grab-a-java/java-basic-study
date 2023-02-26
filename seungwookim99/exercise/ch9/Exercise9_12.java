import java.util.*;

class Exercise9_12 {

  static int getRand(int from, int to) {
    int range = Math.abs(from - to) + 1; // 수 범위
    int minVal = Math.min(from, to);
    return (int) (Math.random() * range) + minVal;
  }

  public static void main(String[] args) {
    for (int i = 0; i < 20; i++)
      System.out.print(getRand(1, -3) + ",");
  }
}