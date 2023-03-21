public class ch06_03 {

  /**
   * ch06_03, ch06_04, ch06_05
   */
  public static void main(String[] args) {
    // ch06_03, ch06_04
//    Student s = new Student();
//    s.name = "홍길동";
//    s.ban = 1;
//    s.no = 1;
//    s.kor = 100;
//    s.eng = 60;
//    s.math = 76;
//    System.out.println("이름:"+s.name);
//    System.out.println("총점:"+s.getTotal());
//    System.out.println("평균:"+s.getAverage());
    // ch06_05
    Student s2 = new Student("홍길동",1,1,100,60,76);
    System.out.println(s2.info());
  }
}

class Student {
  String name;
  int ban;
  int no;
  int kor;
  int eng;
  int math;

  public Student(String name, int ban, int no, int kor, int eng, int math) {
    this.name = name;
    this.ban = ban;
    this.no = no;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
  }

  public int getTotal(){
    return kor+eng+math;
  }
  public float getAverage(){
    float average = (float)(kor+eng+math)/3;
    return (float)(Math.round(average*10)/10.0);
  }
  public String info(){
    return name+","+ban+","+no+","+kor+","+eng+","+math+","+getTotal()+","+getAverage();
  }
}