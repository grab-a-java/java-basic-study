package ehyun.ch05;

public class a5_8 {
    public static void main(String[] args){
        int[] answer = {1,4,4,3,1,4,4,2,1,3,2};
        int[] counter = new int[4];

        for (int j : answer) {
            counter[j-1]++;

        }

        for (int k : counter) {
            System.out.print(k);
            for (int j = 0; j < k; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
