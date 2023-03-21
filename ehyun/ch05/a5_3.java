package ehyun.ch05;

public class a5_3 {
    public static void main(String[] args)
    {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int j : arr) {
            sum += j;
        }

        System.out.println("sum="+sum);
    }
}
