package org.Structural.Proxy;

public class Main {
    public static void main(String[] args) {
        Image image1=new ProxyImage("photo1.jpg");
        Image image2=new ProxyImage("photo2.jpg");

        System.out.println("Image 1 :");
        image1.display();

        //Image will not load from disk ,as it is already loaded
        System.out.println("Image 1 again :");
        image1.display();

        System.out.println("Image 2 :");
        image2.display();

    }
}
