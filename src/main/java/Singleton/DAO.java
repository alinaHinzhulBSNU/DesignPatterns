package Singleton;

import java.util.ArrayList;

// Data Access Object
public class DAO {
    private static DAO instance;

    private DAO(){
        // link to DB server, read data from file, read data from list etc.
    }

    public static DAO getInstance(){
        // check other threads

        if(DAO.instance == null){
            DAO.instance = new DAO();
        }

        return instance;
    }

    // CRUD
    public boolean create(Object object){
        // write object to db
        return true; // success of operation
    }

    public ArrayList<Object> read(String query){
        ArrayList<Object> objects = new ArrayList<>();
        // read objects from db by query
        return objects; // return
    }

    public boolean update(Object object){
        // update object in DB
        return true; // success of operation
    }

    public boolean delete(Object object){
        // delete object from db
        return true; // success of operation
    }
}