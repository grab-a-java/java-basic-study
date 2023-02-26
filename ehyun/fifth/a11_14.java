package ehyun.fifth;

import java.util.*;

public class a11_14 {
    static ArrayList record = new ArrayList(); // 성적데이터를 저장할 공간
    static Scanner s = new Scanner(System.in);
    public static void main(String args[]) {
        while(true) {
            switch (displayMenu()) {
                case 1 -> inputRecord();
                case 2 -> displayRecord();
                case 3 -> {
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                }
            }
        } // while(true)
    }
    // menu를 보여주는 메서드
    static int displayMenu(){
        System.out.println("**************************************************");
        System.out.println("*성적 관리 프로그램*");
        System.out.println("**************************************************");
        System.out.println();
        System.out.println(" 1. 학생성적 입력하기");
        System.out.println();
        System.out.println(" 2. 학생성적 보기");
        System.out.println();
        System.out.println(" 3. 프로그램 종료");
        System.out.println();
        System.out.print("원하는 메뉴를 선택하세요.(1~3) : ");
        int menu = 0;

        while(true){
            menu = Integer.parseInt(s.nextLine().trim());
            if(1 > menu || menu > 3){
                System.out.println("메뉴를 잘못 선택하셨습니다. 다시 입력해 주세요.");
            }
            else{
                break;
            }
        }
        return menu;
    } // public static int displayMenu(){
// 데이터를 입력받는 메서드
static void inputRecord() {
    System.out.println("1. 학생성적 입력하기");
    System.out.println(" 이름 반 번호 국어성적 영어성적 수학성적 의 순서로 공백없이 입력하세요.");
    System.out.println("입력을 마치려면 q를 입력하세요 메인화면으로 돌아갑니다");
    while(true) {
        try{
            System.out.print(">>");

            String input = s.nextLine().trim();

            if(input.equals("q") || input.equals("Q")){
                break;
            }

            Scanner s2 = new Scanner(input).useDelimiter(",");
            record.add(new Student2(s2.next(), s2.nextInt(), s2.nextInt(), s2.nextInt(), s2.nextInt(), s2.nextInt()));
        }
        catch(Exception e){
            System.out.println("입력 오류입니다.");
        }

    } // end of while
} // public static void inputRecord() {
    // 데이터 목록을 보여주는 메서드
    static void displayRecord() {
        int koreanTotal = 0;
        int englishTotal = 0;
        int mathTotal = 0;
        int total = 0;
        int length = record.size();
        if(length > 0) {
            System.out.println();
            System.out.println("이름 반 번호 국어 영어 수학 총점 평균 전교등수 반등수");
            System.out.println("====================================================");
            for (Object o : record) {
                Student2 student = (Student2) o;
                System.out.println(student);
                koreanTotal += student.kor;
                mathTotal += student.math;
                englishTotal += student.eng;
                total += student.total;
            }
            System.out.println("====================================================");
            System.out.println("총점 : "+koreanTotal+" "+englishTotal
                    +" "+mathTotal+" "+total);
            System.out.println();
        } else {
            System.out.println("====================================================");
            System.out.println("데이터가 없습니다.");
            System.out.println("====================================================");
        }
    } // static void displayRecord() {
}

class Student2 implements Comparable {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
    int total;
    int schoolRank;
    int classRank; // 반등수
    Student2(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        total = kor+eng+math;
    }
    int getTotal() {
        return total;
    }
    float getAverage() {
        return (int)((getTotal()/ 3f)*10+0.5)/10f;
    }
    public int compareTo(Object o) {
        if(o instanceof Student2) {
            Student2 tmp = (Student2)o;
            return tmp.total - this.total;
        } else {
            return -1;
        }
    }
    public String toString() {
        return name
                +","+ban
                +","+no
                +","+kor
                +","+eng
                +","+math
                +","+getTotal()
                +","+getAverage()
                +","+schoolRank
                +","+classRank
                ;
    }
} // class Student