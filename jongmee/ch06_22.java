public class ch06_22 {
    static boolean isNumber(String str){
        for(int i = 0; i< str.length(); i++){
            char obj = str.charAt(i);
            if((int)'0'<=(int)obj && (int)'9'>= (int)obj) {}
            else {
                return false;
            }
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
