package ehyun.fifth;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class a10_5 {
    static int getDayDiff(String yyyymmdd1, String yyyymmdd2){
        int days;
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
            LocalDateTime date1 = LocalDate.parse(yyyymmdd1, formatter).atStartOfDay();
            LocalDateTime date2 = LocalDate.parse(yyyymmdd2, formatter).atStartOfDay();

            days = (int) Duration.between(date2, date1).toDays();
        }
        catch(Exception e) {
            days = 0;
        }
        return days;
    }
    public static void main(String[] args){
        System.out.println(getDayDiff("20010103","20010101"));
        System.out.println(getDayDiff("20010103","20010103"));
        System.out.println(getDayDiff("20010103","200103"));
    }
}
