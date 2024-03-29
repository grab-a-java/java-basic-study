//before
public static ArrayList<? extends Product> merge(
  ArrayList<? extends Product> list, ArrayList<? extends Product> list2) {
    ArrayList<? extends Product> newList = new ArrayList<>(list);

    newList.addAll(list2);

    return newList;
}

//after
public static <T extends Product> ArrayList<T> merge(
  ArrayList<T> list, ArrayList<T> list2) {
  ArrayList<T> newList = new ArrayList<>(list);

  newList.addAll(list2);

  return newList;
}