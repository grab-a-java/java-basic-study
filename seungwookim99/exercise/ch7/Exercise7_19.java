public class Exercise7_19{
  public static void main(String[] args) {
    Buyer b = new Buyer();
    b.buy(new Tv());
    b.buy(new Computer());
    b.buy(new Tv());
    b.buy(new Audio());
    b.buy(new Computer());
    b.buy(new Computer());
    b.buy(new Computer());

    b.summary();
  }
}

class Buyer {
  int money = 1000;
  Product[] cart = new Product[3];
  int i = 0;

  void buy(Product p){
    if (money < p.price) {
      System.out.println("잔액이 부족하여 "+p+"을/를 살수 없습니다.");
      return;
    }
    else {
      money -= p.price;
      add(p);
    }
  }

  void add(Product p){
    if (i >= cart.length) {
      Product[] newCart = new Product[2*i];
      for (int j = 0 ; j < i ; j++) {
        newCart[j] = cart[j];
      }
      cart = newCart;
    }
    cart[i++] = p;
  }

  void summary(){
    String items = "";
    int totalAmount = 0;

    for (int i = 0 ; i < cart.length ; i++) {
      items += cart[i].toString() + ",";
      totalAmount += cart[i].price;
    }
    System.out.println("구입한 물건:"+items); 
    System.out.println("사용한 금액:"+totalAmount); 
    System.out.println("남은 금액:"+money);
  }
}

class Product{
  int price;
  
  Product(int price){
    this.price = price;
  }
}

class Tv extends Product{
  Tv(){
    super(100);
  }
  
  public String toString(){
    return "Tv";
  }
}

class Computer extends Product{
  Computer(){
    super(200);
  }
  
  public String toString(){
    return "Computer";
  }
}

class Audio extends Product{
  Audio(){
    super(50);
  }
  
  public String toString(){
    return "Audio";
  }
}