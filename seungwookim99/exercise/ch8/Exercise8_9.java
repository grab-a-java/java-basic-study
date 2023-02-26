class Exercise8_9 {
  public static void main(String[] args) throws Exception {
    throw new UnsupportedFuctionException("지원하지 않는 기능입니다.", 100);
  }
}

class UnsupportedFuctionException extends RuntimeException {
  final private int ERR_CODE;

  UnsupportedFuctionException(String msg, int code) {
    super(msg);
    this.ERR_CODE = code;
  }

  UnsupportedFuctionException(String msg) {
    this(msg, 100);
  }

  public int getErrorCode() {
    return ERR_CODE;
  }

  public String getMessage() {
    return "[" + this.ERR_CODE + "]" + super.getMessage();
  }
}