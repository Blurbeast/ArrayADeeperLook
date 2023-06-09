package AllEnum;

import java.util.PrimitiveIterator;

public class Student {
    private String name;
    private String address;
    private int age;

    public Student(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString(){
        return ("Name is: "+ getName()+ "\nAge is: "+ getAge()+ "\nAddress is at "+getAddress());
    }

    public static void main(String[] args) {
        Student dele = new Student("Oladele", "1, Oluobafemi Street", 23);
        System.out.println(dele);
    }
}
