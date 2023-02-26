public class ch08_09 {
  public static void main(String[] args) {
    throw new UnsupportedFuctionException("지원하지 않는 기능입니다 .",100);
  }

}

class UnsupportedFuctionException extends RuntimeException {
  private final int ERR_CODE;

  public UnsupportedFuctionException(String str, int code) {
    super(str);
    ERR_CODE = code;
  }

  public UnsupportedFuctionException(String str) {
    this(str, 100);
  }

  public int getErrorCode(){
    return ERR_CODE;
  }
  public String getMessage(){
    return "["+getErrorCode()+"]"+super.getMessage();
  }
}