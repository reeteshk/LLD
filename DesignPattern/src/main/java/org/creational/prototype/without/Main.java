package org.creational.prototype.without;

public class Main {
    public static void main(String[] args) {
        Student obj=new Student(20, 1, "John");
        Student cloneObj=new Student();
//        cloneObj.age=obj.age;
//        cloneObj.rollNumber=obj.rollNumber; //here we are getting error while creating clone
//        // object as rollNumber is private
//        cloneObj.name=obj.name;
    }
}
// #################### PROBLEMS IN CLONING ####################
//Problem: Here we are getting error while creating clone object as rollNumber is private.

//Problem : Here we are not aware of all the fields of Student class. So, we may miss some fields
// while creating clone object.

//Cloning Logic: We have to write cloning logic for each class. So, it is time consuming and error prone.