package edu.TTss.Exception;

public class InventoryNotfoundException extends RuntimeException{
    public InventoryNotfoundException(Long id){
        super("could not find id"+id);
    }
    public InventoryNotfoundException(String message){
        super(message);
    }
}
