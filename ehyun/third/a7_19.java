package third;

public class a7_19 {
    public static void main(String args[]) {
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
    Product[] cart = new Product[3]; // 구입한 제품을 저장하기 위한 배열
    int i = 0; // Product cart index 배열 에 사용될
    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액이 부족");
            return;
        }
        else{
              money -= p.price;
              add(p);
        }
    }
    void add(Product p) {
        if(i >= cart.length) {
            Product[] newcart = new Product[cart.length * 2];
            System.arraycopy(cart, 0, newcart, 0, cart.length);
            cart = newcart;
        }
        cart[i] = p;
        i++;
/*
(2) . 아래의 로직에 맞게 코드를 작성하시오
1.1 i의 값이 장바구니의 크기보다 같거나 크면
1.1.1 2 . 기존의 장바구니보다 배 큰 새로운 배열을 생성한다
1.1.2 . 기존의 장바구니의 내용을 새로운 배열에 복사한다
1.1.3 . 새로운 장바구니와 기존의 장바구니를 바꾼다
1.2 (cart) . i 1 . 물건을 장바구니 에 저장한다 그리고 의 값을 증가시킨다
*/
    } // add(Product p)
    void summary() {
        String list = "";
        int sum = 0;

        for (Product product : cart) {
            if (product == null)
                break;
            list += product + ", ";
            sum += product.price;
        }
        System.out.println(list);
        System.out.println(sum);
        System.out.println(money);
/*
(3) . 아래의 로직에 맞게 코드를 작성하시오
1.1 . 장바구니에 담긴 물건들의 목록을 만들어 출력한다
1.2 . 장바구니에 담긴 물건들의 가격을 모두 더해서 출력한다
1.3 (money) . 물건을 사고 남은 금액 를 출력한다
*/
    } // summary()
}

class Product {
    int price; // 제품의 가격
    Product(int price) {
        this.price = price;
    }
}
class Tv extends Product {
    Tv() { super(100); }
    public String toString() { return "Tv"; }
}
class Computer extends Product {
    Computer() { super(200); }
    public String toString() { return "Computer";}
}
class Audio extends Product {
    Audio() { super(50); }
    public String toString() { return "Audio"; }
}