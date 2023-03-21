public class ch05_03 {
  /**
   * 배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하시오 .
   */
  public static void main(String[] args) {
    int[] arr = {10, 20, 30, 40, 50};
    int sum = 0;
    // 빈칸 시작
    for(int i:arr){
      sum += i;
    }
    // 빈칸 끝
    System.out.println("sum="+sum);
  }

}
