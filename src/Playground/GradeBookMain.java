package Playground;

public class GradeBookMain {
    public static void main(String[] args) {
        GradeBookClass gradeBookClass = new GradeBookClass();
        int[][] grades = {{87, 96, 70},
                {68, 87, 90},
                {94, 100, 90},
                {100, 81, 82},
                {83, 65, 85},
                {78, 87, 65},
                {85, 75, 83},
                {91, 94, 100},
                {76, 72, 84},
                {87, 93, 73},
                {55,69,44},
                {57,65,33},
                {10,50,30}};
        gradeBookClass.barChart(grades);
    }
}
