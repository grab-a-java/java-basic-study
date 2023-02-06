public class ch06_23 {
    static int max(int[] arr){
        int max = Integer.MIN_VALUE;
        if (arr == null) return -999999;
        if (arr.length == 0) return -999999;
        for(int i = 0; i < arr.length; i++){
            if (arr[i]>max) {
                    max = arr[i];
                }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] data = {3,2,9,4,7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값:"+max(data));
        System.out.println("최대값:"+max(null));
        System.out.println("최대값:"+max(new int[]{})); // 크기가 0인 배열
    }
}


