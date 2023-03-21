package ehyun.ch05;

public class a5_4 {
    public static void main(String[] args)
    {
        int[][] arr = {
            {5, 5, 5,5,5},
            {10,10,10,10,10},
            {20,20,20,20,20},
            {30,30,30,30,30}
        };

        int total = 0;
        float average = 0;
        int num = 0;

        for(int[] i: arr){
            for(int j: i){
                total += j;
                num++;
            }
        }
        average = total / (float)num;

        System.out.println("total="+total);
        System.out.println("average="+average);
    }
}
