package second;

public class a6_22 {
    public static boolean isNumber(String str){
        if (str==null)
            return false;
        char[] arr = str.toCharArray();

        for (char c : arr) {
            if (!Character.isDigit(c))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "123";
        System.out.println(str+"는 숫자입니까? "+isNumber(str));
        str = "1234o";
        System.out.println(str+"는 숫자입니까? "+isNumber(str));
    }
}
