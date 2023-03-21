public class ch05_04 {
  /**
   * 2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오.
   */
  public static void main(String[] args) {
    int[][] arr = {
        { 5, 5, 5, 5, 5},
        {10,10,10,10,10},
        {20,20,20,20,20},
        {30,30,30,30,30}
    };
    int total = 0;
    float average = 0;
    // 빈칸 시작
    int size = 0;
    for(int[] arr1: arr){
      for(int num: arr1){
        total += num;
      }
      size += arr1.length;
    }
    average = (float)total/size;
    // 빈칸 끝
    System.out.println("total="+total);
    System.out.println("average="+average);
  }
}
