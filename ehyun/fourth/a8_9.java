package ehyun.fourth;

public class a8_9 {
    static class UnsupportedFunctionException extends RuntimeException {
        private final int ERR_CODE;
        UnsupportedFunctionException(String msg, int errCode) {
            super(msg);
            ERR_CODE = errCode;
        }
        UnsupportedFunctionException(String msg) {
            this(msg, 100);
        }
        public int getERR_CODE(){
            return ERR_CODE;
        }
        public String getMessage(){
            return "["+getERR_CODE()+"]" + super.getMessage();
        }
    }
    public static void main(String[] args) throws Exception
    {
        throw new UnsupportedFunctionException("지원하지 않는 기능입니다.",100);
    }
}
