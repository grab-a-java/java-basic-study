public class ex3_2 {
  public static void main(String[] args) {
    int numOfApples = 123;
    int sizeOfBucket = 10;
    double ceil = Math.ceil((double) numOfApples / sizeOfBucket);
    int numOfBucket = (int) ceil;

    System.out.println("필요한 바구니의 수 :" + numOfBucket);
  }
}
