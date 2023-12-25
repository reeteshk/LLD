package org.Structural.Composite;

public class Main {
    public static void main(String[] args) {
        Directory root=new Directory("root");
        File file1=new File("file1.txt",100);
        File file2=new File("file2.txt",200);
        Directory subDir=new Directory("subDir");
        File file3=new File("file3.txt",300);
        root.addNode(file1);
        root.addNode(file2);
        root.addNode(subDir);
        subDir.addNode(file3);
        System.out.println("Size of root : "+root.getSize());
        System.out.println("Size of subDir : "+subDir.getSize());

    }
}
