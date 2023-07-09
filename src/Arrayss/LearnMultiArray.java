package Arrayss;

public class LearnMultiArray {
    private int[][] array = new int[0][0];
    private int[] rowResult = new int[0];
    private double[] rowResultAverage = new double[0];
    private int[] columnResultAverage = new int[0];
    public void setLength(int outerLength, int innerLength) {
        array = new int[outerLength][innerLength];
        rowResultAverage = new double[outerLength];
        columnResultAverage = new int[innerLength];
    }
    public int[][] checkResult() {
        return array;
    }
    public void populateArray(int[][] actual) {
        array = actual;
    }
    public int[] checkRowsResult() {
        for (int index = 0; index < array.length; index++) {
            for (int indexx = 0; indexx < array[index].length; indexx++) {
                rowResult[index] += array[index][indexx];
            }
        }
        return rowResult;
    }
    public double[] checkRowResultAverage() {
        rowResultAverage = new double[array.length];
        for (int index = 0; index < array.length; index++) {
            rowResultAverage[index] = (double) checkRowsResult()[index]/array[index].length;
        }
        return rowResultAverage;
    }

    public int[] checkColumnResult() {
        for (int index = 0; index < array.length; index++) {
        }
        return columnResultAverage;
    }
}
