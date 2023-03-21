import java.util.function.BiConsumer;

public class ch14_01 {
  // (a)
  void printVar(String name, int i) {
    System.out.println(name+"="+i );
  }
  /**
  * (String name, int i) -> System.out.println(name+"="+i )
  */

  // (b)
  int square(int x) {
    return x * x;
  }
  /**
   * (x) -> x*x
   */

  // (c)
  int roll() {
    return (int)(Math.random() * 6);
  }

  /**
   * () -> (int)(Math.random() * 6)
   */

  // (d)
  int sumArr(int[] arr) {
    int sum = 0;
    for(int i : arr)
      sum += i;
    return sum;
  }

  /**
   * (int[] arr) -> {int sum = 0;
   *     for(int i : arr)
   *       sum += i;
   *     return sum;}
   */

  // (e)
  int[] emptyArr() {
    return new int[]{};
  }
  /**
   * () -> new int[]{}
   */
}
