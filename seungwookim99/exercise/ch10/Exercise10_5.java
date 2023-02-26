import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

class Exercise10_5 {
  /* My Code */
  static int getDayDiff(String yyyymmdd1, String yyyymmdd2) {
    DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyyMMdd");
    try {
      LocalDate date1 = LocalDate.parse(yyyymmdd1, pattern);
      LocalDate date2 = LocalDate.parse(yyyymmdd2, pattern);
      Period pe = Period.between(date2, date1);
      return pe.getDays();
    } catch (DateTimeParseException e) {
      return 0;
    }
  }

  public static void main(String[] args) {
    System.out.println(getDayDiff("20010103", "20010101"));
    System.out.println(getDayDiff("20010103", "20010103"));
    System.out.println(getDayDiff("20010103", "200103"));
  }
}