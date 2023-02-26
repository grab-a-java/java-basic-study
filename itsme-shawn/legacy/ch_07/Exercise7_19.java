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
    if (money < p.price) 
      return;
    else {
      money -= p.price;
      add(p);
    }
  }

  void add(Product p){
    if (i >= cart.length){
      Product[] newCart = new Product[2*i];
      for(int j=0; j<i; j++){
        newCart[j] = cart[j];
      }
      cart = newCart;
    }
    cart[i++] = p;
  }

  void summary(){
    String str = "";
    int totalMoney = 0;

    for(Product s : cart) {
      str += s.toString() + ",";
      totalMoney += s.price;
    }

    System.out.println(str);
    System.out.println(totalMoney);
    System.out.println(money);


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
