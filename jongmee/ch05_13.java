import java.util.Scanner;
public class ch05_13 {
    public static void main(String[] args) {
        String[] words = { "television", "computer", "mouse", "phone" };
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<words.length;i++) {
            char[] question = words[i].toCharArray(); // String char[] 을 로 변환
            for(int j = 0; j<question.length;j++) {
                int index = (int) (Math.random()*10000 % words.length);
                char tmp = question[j];
                question[j] = question[index];
                question[index] = tmp;
            }
            System.out.printf("Q%d. %s 의 정답을 입력하세요>", i+1, new String(question));
            String answer = scanner.nextLine();
            if(words[i].equals(answer.trim()))
                System.out.printf("맞았습니다.%n%n");
            else
                System.out.printf("틀렸습니다.%n%n");
        }
    }
}
