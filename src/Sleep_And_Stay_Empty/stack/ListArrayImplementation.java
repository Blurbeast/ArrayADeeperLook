package Sleep_And_Stay_Empty.stack;

public class ListArrayImplementation {
    private boolean isEmpty = true;
    private int numberOfAdds = 0;
    private final String[] elements;
    private final String[] newElements;
    private int indexOfElement;
    public ListArrayImplementation (int sizeOfList){
        elements = new String[sizeOfList];
        newElements = new String[sizeOfList - 1];
    }
    public boolean isEmpty() {
        return isEmpty;
    }
    public void add(String element){
        this.elements[numberOfAdds] = element;
        numberOfAdds++;
        isEmpty = false;
    }
    public void add(int index, String element) {
        this.elements[index] = element;
        numberOfAdds++;
        isEmpty = false;
    }
    public int size() {
        return numberOfAdds;
    }
    public void remove(int index) {
        for (int element =0, newElement = 0; element < elements.length ; element++) {
            if (element != index) {
                newElements[newElement] =elements[element];
                newElement++;
            }
        }
        numberOfAdds--;
    }
    public void remove(String element){
        for (int index =0, newElement = 0; index < elements.length ; index++) {
            if (elements[index] != element) {
                newElements[newElement] =elements[index];
                newElement++;
            }
        }
        numberOfAdds--;
    }
    public String get(int index) {
        return this.elements[index];
    }
    public void set(int index, String element) {
        this.elements[index] = element;
    }
    public String[] getListElement() {
        return newElements;
    }
    public int indexOf(String element) {
        String[] newArray;
        newArray = elements;
        for (int index = 0; index < newArray.length; index++) {
            if (newArray[index].equals(element)) {return index;}
        }
        return -1;
    }
    public boolean contains(String element) {
        String[] newArray;
        newArray = elements;
        for (String array : newArray) {
            return array.equals(element);
        }
        return false;
    }
}
