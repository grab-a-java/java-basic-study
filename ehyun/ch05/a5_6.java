package ehyun.ch05;

public class a5_6 {
    public static void main(String args[]){
        int[] coinUnit = {500, 100, 50, 10};

        int money = 2680;
        System.out.println("money="+money);

        for (int j : coinUnit) {
            System.out.println(j + "원: " + money / j);
            money %= j;
        }
    }
}
