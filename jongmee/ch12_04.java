import java.util.ArrayList;

public class ch12_04 {
  public static ArrayList<? extends Product> 문제(
      ArrayList<? extends Product> list, ArrayList<? extends Product> list2) {
    ArrayList<? extends Product> newList = new ArrayList<>(list);
//    newList.addAll(list2);
    return newList;
  }
  public static <T extends Product> ArrayList<T> 답(
      ArrayList<T> list, ArrayList<T> list2) {
    ArrayList<T> newList = new ArrayList<>(list);
    newList.addAll(list2);
    return newList;
  }
}

class Product{ }