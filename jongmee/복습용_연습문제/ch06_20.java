public class ch06_20 {
  /*
  (1) shuffle 메서드를 작성하시오
  */
  public static int[] shuffle(int[] arr){
    for(int i=0;i<arr.length;i++){
      int tmp = arr[i];
      int index = (int)(Math.random()*arr.length);
      arr[i] = arr[index];
      arr[index] = tmp;
    }
    return arr;
  }
  public static void main(String[] args) {
    int[] original = {1,2,3,4,5,6,7,8,9};
    System.out.println(java.util.Arrays.toString(original));
    int[] result = shuffle(original);
    System.out.println(java.util.Arrays.toString(result));
  }
}
