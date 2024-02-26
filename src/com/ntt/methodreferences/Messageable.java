package com.ntt.methodreferences;
//REFERENCE TO A CONSTRUCTOR
//@FunctionalInterface
interface Messageable {
    Message getMessage(String msg);
}
class Message{
    Message(String msg){

        System.out.print(msg);
    }
}
 class ConstructorReference {
    public static void main(String[] args) {
        Messageable hello = Message::new;
        hello.getMessage("Hello");
    }
}

