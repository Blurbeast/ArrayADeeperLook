package chichi.stack;

import java.util.List;

public class ListImplementation {
    private List<String> list;
    private boolean isEmpty =true;
    private int sizeOfList = 0;
    public ListImplementation(int sizeOfElement) {

    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void add(String[] elements) {
        sizeOfList++;
        isEmpty = false;
    }
    public void add(int index, String[] elements) {
        sizeOfList++;
        isEmpty = false;
    }
    public int size() {
        return sizeOfList;
    }

    public void clear() {
        isEmpty = true;
        sizeOfList = 0;
    }

//    public String get(int index) {
//        return list;
//    }
}
