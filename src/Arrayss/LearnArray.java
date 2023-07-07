package Arrayss;

public class LearnArray {
    private int[] array = new int[0];
    public void assignSize(int length) {
        array = new int[length];
    }
    public int[] checkResult() {return array;}
    public void populateArray(int[] actual) {
        array = actual;
    }
    public int sumOfArray() {
        int total =0;
        for (int i : array) {
            total += i;
        }
        return total;
    }
    public double getElementsAverage() {
        return (double) sumOfArray()/array.length;
    }
}
