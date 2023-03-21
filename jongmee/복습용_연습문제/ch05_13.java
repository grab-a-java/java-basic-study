import java.util.Scanner;
public class ch05_13 {
  public static void main(String[] args) {
    String[] words = { "television", "computer", "mouse", "phone" };
    Scanner scanner = new Scanner(System.in);
    for(int i=0;i<words.length;i++) {
      char[] question = words[i].toCharArray(); // String char[] 을 로 변환
      /*
      (1) 알맞은 코드를 넣어 완성하시오.
          char 배열 question에 담긴 문자의 위치를 임의로 바꾼다
      */
      for(int j=0;j<question.length;j++){
        char temp = question[j];
        question[j] = question[(int)Math.random()*question.length];
        question[(int)Math.random()*question.length] = temp;
      }
      System.out.printf("Q%d. %s 의 정답을 입력하세요.>",
          i+1, new String(question));
      String answer = scanner.nextLine();
      // trim() answer , equals word[i] 으로 의 좌우 공백을 제거한 후 로 와 비교
      if(words[i].equals(answer.trim()))
        System.out.printf("맞았습니다.%n%n");
      else
        System.out.printf("틀렸습니다.%n%n");
    }
  }
}
