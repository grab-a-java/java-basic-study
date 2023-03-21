public class ch06_09 {

  /**
   * 다음은 컴퓨터 게임의 병사(marine)를 클래스로 정의한 것이다. 이 클래스의 멤버
   * 중에 static을 붙여야 하는 것은 어떤 것들이고 그 이유는 무엇인가?
   *
   * 이유: 모든 병사(인스턴스)의 공격력과 방어력이 같아야 하기 때문
   */
}
class Marine {
  int x=0, y=0; // Marine (x,y) 의 위치좌표
  int hp = 60; // 현재 체력
  static int weapon = 6; // 공격력
  static int armor = 0; // 방어력
  static void weaponUp() {
    weapon++;
  }
  static void armorUp() {
    armor++;
  }
  void move(int x, int y) {
    this.x = x; // this.x , x 는 인스턴스 변수 는 지역변수
    this.y = y; // this.y , y 는 인스턴스 변수 는 지역변수
  }
}
