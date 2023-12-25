package org.creational.prototype.with;

public class Main {

    public static void main(String[] args) {
        Student student = new Student(20, 1, "John");
        Student studentClone = (Student) student.Clone();
        System.out.println(studentClone.name);
    }
}
