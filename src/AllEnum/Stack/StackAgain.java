package AllEnum.Stack;

public class StackAgain {
    private int counter = 0;
    private String[] elements;
    public StackAgain(int sizeOfStack){
        elements = new String[sizeOfStack];
    }
    public boolean isEmpty() {
        return counter == 0;
    }
    public void push(String element) {
        this.elements[counter] = element;
        counter++;
    }
    public String pop() {
        counter--;
        return elements[counter];
    }
}
