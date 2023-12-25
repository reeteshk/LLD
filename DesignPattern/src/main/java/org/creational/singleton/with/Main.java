package org.creational.singleton.with;

public class Main {
    public static void main(String[] args) {
        DBConnection conObj = DBConnection.getInstance();
        System.out.println(conObj);
        DBConnection conObj2 = DBConnection.getInstance();
        System.out.println(conObj2);
    }
}
