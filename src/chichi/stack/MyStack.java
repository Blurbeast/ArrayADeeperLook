package chichi.stack;

public class MyStack {
    private int counter;
    String [] elements;

    public MyStack(int size_Of_Size) {
        elements = new String[size_Of_Size];
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