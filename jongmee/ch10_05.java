import java.time.LocalDate;
import java.util.*;
class ch10_05 {
  static int getDayDiff(String  yyyymmdd1, String  yyyymmdd2){
    int result = 0;
    try{
      int y1 = Integer.parseInt(yyyymmdd1.substring(0,4));
      int m1 = Integer.parseInt(yyyymmdd1.substring(4,6))-1; // month는 0부터 시작
      int d1 = Integer.parseInt(yyyymmdd1.substring(6,8));
      int y2 = Integer.parseInt(yyyymmdd2.substring(0,4));
      int m2 = Integer.parseInt(yyyymmdd2.substring(4,6))-1;
      int d2 = Integer.parseInt(yyyymmdd2.substring(6,8));
      Calendar date1 = Calendar.getInstance();
      Calendar date2 = Calendar.getInstance();
      date1.set(y1, m1, d1);
      date2.set(y2, m2, d2);
      result = (int)((date1.getTimeInMillis()-date2.getTimeInMillis()) /(24*60*60*1000)); // 1일 = 24 * 60 * 60
    }catch (Exception e){
      result = 0;
    }
    return  result;
  }
  public static void main(String[] args){
    System.out.println(getDayDiff("20010103","20010101"));
    System.out.println(getDayDiff("20010103","20010103"));
    System.out.println(getDayDiff("20010103","200103"));
  }
}