package AllEnum.Stack;

public class Stacking {
    private boolean isEmpty = true;
    private int counter = 0;
    private int element =0;
    public boolean isEmpty() {
        return isEmpty;
    }

    public void push(int element) {
        this.element = element;
        isEmpty = false;
        counter++;
    }

    public int getNumberOfElementsInTheStack() {
        return counter;
    }

    public int getPushedElement() {
        return element;
    }
}
