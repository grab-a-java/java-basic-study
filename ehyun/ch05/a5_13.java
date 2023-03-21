package ehyun.ch05;

import java.util.Scanner;

public class a5_13 {
    public static void main(String[] args){
        String[] words = {"television", "computer", "mouse", "phone"};

        Scanner scanner = new Scanner(System.in);

        for(int i =0; i<words.length;i++){
            char[] question = words[i].toCharArray();

            for(int j=0; j<question.length; j++){
                int num = (int)(Math.random()*question.length);

                char tmp = question[j];
                question[j] = question[num];
                question[num] = tmp;
            }

            System.out.printf("Q%d. %s의 정답을 입력하세요.>", i + 1, new String(question));

            String answer = scanner.nextLine();

            if(words[i].equals(answer.trim()))
                System.out.println("맞았습니다.\n\n");
            else
                System.out.println("틀렸씁니다.\n\n");
        }
    }
}
