class PlayingCard {
  int kind;
  int num;
  static int width;
  static int height;
  PlayingCard(int k, int n) {
    kind = k;
    num = n;
  }
  public static void main(String args[]) {
    PlayingCard card = new PlayingCard(1,1);
  }
}
public class ch06_08 {
/**
 * 정의된 변수들을 종류별로 구분해서 적으시오.
 *
 * Answer
 * - 클래스변수(static 변수) : width, height
 * - 인스턴스변수 : k, n
 * - 지역변수 : kind, num, card, args
 */
}
