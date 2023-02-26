class uncheckedException {
	public static void main(String[] args) {
    try {
      method1();
    } catch (Exception e) {
      System.out.println("main메서드에서 예외가 처리되었습니다.");
      e.printStackTrace();
    }
  	}	// main메서드의 끝

	static void method1(){
		method2();
	}	// method1의 끝

	static void method2() {
		throw new RuntimeException(); // throws를 사용하지 않아도 된다.
	}	// method2의 끝
}
