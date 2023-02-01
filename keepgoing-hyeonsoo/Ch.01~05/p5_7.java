public class p5_7 {
  public static void main(String[] args) {
    if(args.length!=1) {
      System.out.println("USAGE: java p5_7 3120");
      System.exit(0);
    }

    int money = Integer.parseInt(args[0]);
    System.out.println("money="+money);

    int[] coinUnit = {500, 100, 50, 10}; // 동전의 단위
    int[] coin = {5,5,5,5}; // 단위별 동전의 개수

    for(int i=0; i<coinUnit.length; i++){
      int coinNum = 0;

      /* (1) 아래의 로직에 맞게 코드를 작성하시오.
          1. 금액(money)을 동전단위로 나눠서 필요한 동전의 개수(coinNum)를 구한다. 
          2. 배열 coin에서 coinNum만큼의 동전을 뺀다.
        (만일 충분한 동전이 없다면 배열 coin에 있는 만큼만 뺀다.) 
          3. 금액에서 동전의 개수(coinNum)와 동전단위를 곱한 값을 뺀다.
      */

      coinNum = money / coinUnit[i]; // 1. 필요한 동전 개수 구함

      if (coinNum > coin[i]) { // 필요한 동전이 주어진 동진 개수보다 많을 때
        coinNum = coin[i]; // 주어진 동전을 다 씀
      }
      coin[i] -= coinNum; // 2. 사용한 동전 뺌
      money -= (coinNum * coinUnit[i]);  // 3. 전체 금액에서 거스러준 금액 뺌

      System.out.println(coinUnit[i]+"원: "+coinNum);
    }

    if (money > 0) {
      System.out.println("거스름돈이 부족합니다");
      System.exit(0);
    }

    System.out.println("=남은 동전의 개수 =");

    for(int i=0; i<coinUnit.length; i++){
      System.out.println(coinUnit[i]+"원: "+coin[i]);
    }
  }
}
