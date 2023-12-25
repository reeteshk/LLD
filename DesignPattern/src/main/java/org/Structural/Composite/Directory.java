package org.Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemNode{
    private String name;
    private List<FileSystemNode> children=new ArrayList<>();
    public Directory(String name){
        this.name = name;
    }
    public void addNode(FileSystemNode node){
        children.add(node);
    }
    public void removeNode(FileSystemNode node){
        children.remove(node);
    }
    @Override
    public String getName(){
        return this.name;
    }
    @Override
    public long getSize(){
        long size = 0;
        for(FileSystemNode node : children){
            size += node.getSize();
        }
        return size;
    }
}
