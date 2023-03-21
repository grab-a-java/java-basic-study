public class ch06_01 {
  /**
   * ch06_01, ch06_02
   */
  public static void main(String[] args) {
    SutdaCard card1 = new SutdaCard(3, false);
    SutdaCard card2 = new SutdaCard();
    System.out.println(card1.info());
    System.out.println(card2.info());
  }
}

class SutdaCard {
  private int num;
  private boolean isKwang;
  public SutdaCard(int num, boolean isKwang){
    this.num = num;
    this.isKwang = isKwang;
  }
  public SutdaCard(){
    this(1, true);
  }
  public String info(){
    if(isKwang == true){
      return num+"K";
    } else {
      return num+"";
    }
  }
}