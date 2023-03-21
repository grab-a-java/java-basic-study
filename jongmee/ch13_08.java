import java.util.*;
class ch13_08
{
  Vector words = new Vector();
  String[] data = {"태연","유리","윤아", "효연", "수영", "서현", "티파니", "써니", "제시카"};
  int interval = 2 * 1000; // 2초
  WordGenerator wg = new WordGenerator();
  public static void main(String args[])
  {
    ch13_08 game = new ch13_08();
    game.wg.start();
    Vector words = game.words;
    while(true) {
      System.out.println(words);
      String prompt = ">>";
      System.out.print(prompt);
// . 화면으로부터 라인단위로 입력받는다
      Scanner s = new Scanner(System.in);
      String input = s.nextLine().trim();
      int index = words.indexOf(input);
      if(index!=-1) {
        words.remove(index);
      }
    }
  } // main
  class WordGenerator extends Thread {
    public void run() {
      while(true){
        int index = (int)(Math.random()*data.length);
        words.add(data[index]);
        try {
          Thread.sleep(interval);
        }catch (Exception e) {}
      }
    } // end of run()
  } // class WordGenerator
} // Exercise13_9