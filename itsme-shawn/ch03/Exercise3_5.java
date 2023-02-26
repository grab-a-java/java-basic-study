package ch03;

public class Exercise3_5 {
	public static void main(String[] args) {
		int num = 777;
		String numToString = String.valueOf(num);
		numToString = numToString.substring(0, numToString.length() - 1) + "1";
		System.out.println(numToString);
	}
}
