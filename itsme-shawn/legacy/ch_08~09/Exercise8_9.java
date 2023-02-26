class Exercise8_9{
  public static void main(String[] args) throws Exception {
    throw new UnsupportedFunctionException("지원하지 않는 기능입니다", 100);
  }
}

class UnsupportedFunctionException extends RuntimeException {
  private final int ERR_CODE;

  UnsupportedFunctionException(String msg, int code){
    super(msg);
    ERR_CODE = code;
  }

  public int getErrorCode() {
    return ERR_CODE;
  }

  public String getMessage() {
    return "[" + this.getErrorCode() + "] " + super.getMessage();
  }
}