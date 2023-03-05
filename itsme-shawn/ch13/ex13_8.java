import java.util.*;

class ex13_8 {

  Vector<String> words = new Vector<>();
  String[] data = { "태연", "유리", "윤아", "효연", "수영", "서현", "티파니", "써니", "제시카" };

  int interval = 2 * 1000; // 2초

  WordGenerator wg = new WordGenerator();

  public static void main(String[] args) throws Exception {
    ex13_8 game = new ex13_8();

    game.wg.start();

    Vector<String> words = game.words;

    while (true) {
      System.out.println(words);

      String prompt = ">>";
      System.out.print(prompt);

      Scanner s = new Scanner(System.in);
      String input = s.nextLine().trim();

      int index = words.indexOf(input);

      if (index != -1) {
        words.remove(index);
      }
    }
  }

  class WordGenerator extends Thread {
    public void run() {
      while (true) {
        /* 1. interval(2초)마다 배열 data의 값 중 하나를 임의로 선택해서 */
        int idx = (int) (Math.random() * data.length);
        /* 2. words 에 저장한다. */
        words.add(data[idx]);

        try {
          sleep(interval);
        } catch (Exception e) {
        }
      }
    }
  }

}