package org.creational.singleton.with;

public class DBConnection {

    private static DBConnection conObj;

    //private constructor to avoid client applications to use constructor
    //This is called Double Locking for Object initialization
    private DBConnection(){

    }
     public static DBConnection getInstance(){
        if(conObj == null){
            synchronized (DBConnection.class){
                if(conObj == null){
                    conObj = new DBConnection();
                }
            }
        }
        return conObj;
    }
}
