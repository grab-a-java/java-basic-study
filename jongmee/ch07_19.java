public class ch07_19 {
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
    Product[] cart = new Product[3]; // 구입한 제품을 저장하기 위한 배열
    int i = 0; // Product배열 cart에 사용될 index

    void buy(Product p) {
        if (p.price > money) {
            System.out.printf("잔액이 부족하여 "+p+"을/를 살 수 없습니다.\n");
            return;
        }
        money -= p.price;
        add(p);
    }

    void add(Product p) {
        if (i >= cart.length) {
            Product[] newCart = new Product[cart.length*2];
            for(int k = 0; k<cart.length;k++) {
                newCart[k] = cart[k];
            }
            cart = newCart;
        }
        cart[i] = p;
        i++;
    }

    void summary() {
        System.out.printf("구입한 물건:");
        int sum = 0;
        for(int k = 0; k<i;k++) {
            System.out.printf(cart[k]+",");
            sum += cart[k].price;
        }
        System.out.println("\n사용한 금액:"+sum);
        System.out.println("남은 금액:"+money);
    }
}
class Product {
    int price;
    Product(int price) {
        this.price = price;
    }
}
class Tv extends Product {
    Tv() {
        super(100);
    }

    public String toString() {
        return "Tv";
    }
}
class Computer extends Product {
    Computer() {super(200);}
    public String toString() {return "Computer";}
}
class Audio extends Product {
    Audio() { super(50); }
    public String toString() { return "Audio"; }
}