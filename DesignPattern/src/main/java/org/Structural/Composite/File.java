package org.Structural.Composite;

public class File implements FileSystemNode{
    private String name;
    private long size;

    public File(String name, long size){
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public long getSize(){
        return this.size;
    }
}
