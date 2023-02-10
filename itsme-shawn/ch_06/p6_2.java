public class p6_2 {
  public static void main(String[] args) {
    SutdaCard card1 = new SutdaCard(3, false);
    SutdaCard card2 = new SutdaCard();

    System.out.println(card1.info());
    System.out.println(card2.info());  
  }
}

class SutdaCard{
  int num;
  boolean isK;

  SutdaCard(){
    this(1, true);
  }

  SutdaCard(int num, boolean isK){
    this.num = num;
    this.isK = isK;
  }

  String info(){
    return num + (isK ? "K" : "");
  }
}
