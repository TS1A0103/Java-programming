package Coreconcepts;

import java.util.Arrays;

enum Status{
    Success (200),Failed(404),Running(0), Waiting(500);
    private final int code;
    Status(int code){this.code = code;} //parameterized constructor
    public int getCode(){
        return code;
    }
}

public class EnumExample {
    public static void main(String[] args){
        Status s = Status.Success;
        System.out.println(s.getCode());        //Returns the code of particular staaus
        System.out.println(Arrays.toString(Status.values()));   //Returns the array of all status
        System.out.println((String.valueOf(Status.Running)));  //converts  String to enum
        System.out.println(Status.Failed.ordinal());         //Returns the index value
    }
}
