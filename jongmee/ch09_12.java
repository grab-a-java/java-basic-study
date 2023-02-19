public class ch09_12 {
  static int getRand(int from, int to){
    int start = Math.min(from, to);
    int size = Math.abs(from-to)+1;
    return (int)(Math.random()*size)+start;
  }

  public static void main(String[] args) {
    for(int i=0; i< 20; i++)
      System.out.print(getRand(1,-3)+",");
  }

}
