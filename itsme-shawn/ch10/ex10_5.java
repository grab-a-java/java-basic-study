package ch10;

import java.time.LocalDate;
import java.time.Period;

import static java.lang.Math.abs;

public class Exercise10_5 {

	public static int getDayDiff(String yyyymmdd1, String yyyymmdd2) {
		try {
			LocalDate date1 = LocalDate.of(getYear(yyyymmdd1), getMonth(yyyymmdd1), getDate(yyyymmdd1));
			LocalDate date2 = LocalDate.of(getYear(yyyymmdd2), getMonth(yyyymmdd2), getDate(yyyymmdd2));

			Period period = Period.between(date1, date2);
			return abs(period.getDays());
		} catch (Exception e) {
			System.out.println("날짜 형식이 잘못되었습니다.");
			return 0;
		}
	}

	public static int getYear(String yyyymmdd) throws Exception {
		return Integer.parseInt(yyyymmdd.substring(0, 4));
	}

	public static int getMonth(String yyyymmdd) throws Exception {
		return Integer.parseInt(yyyymmdd.substring(4, 6));
	}

	public static int getDate(String yyyymmdd) throws Exception {
		return Integer.parseInt(yyyymmdd.substring(6, 8));
	}

	public static void main(String[] args) {
		System.out.println(getDayDiff("20010103", "20010101"));
		System.out.println(getDayDiff("20010103", "20010103"));
		System.out.println(getDayDiff("20010103", "200103"));
	}
}
