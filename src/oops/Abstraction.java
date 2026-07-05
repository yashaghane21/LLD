package oops;


abstract class Account{
    abstract void make();
}


class Saving extends Account{

    void make(){
        System.out.println("its call");
    }
}

public class Abstraction {
    public static void main(String args[]){
        Account a=new Saving();
        a.make();
    }
}
