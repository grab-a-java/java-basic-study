package third;

class Outer {
    int value=10;
    class Inner {
        int value=20;
        void method1() {
            int value=30;
            System.out.println(value);
            System.out.println(this.value);
            System.out.println(Outer.this.value);
        }
    } // Inner클래스의 끝
} // Outer클래스의 끝

public class a7_27 {
    public static void main(String args[]) {
        /*
        (4) . 알맞은 코드를 넣어 완성하시오
        */
        Outer out = new Outer();
        Outer.Inner inner = out.new Inner();
        inner.method1();
    }
}
