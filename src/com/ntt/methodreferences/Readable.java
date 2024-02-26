package com.ntt.methodreferences;
//REFERENCE TO A INSTANCE METHOD
public interface Readable {

        void read();
    }
    class InstanceMethodReference {
        public void readSomething(){
            System.out.println("this is Instance method");
        }
        public static void main(String[] args) {
            InstanceMethodReference methodReference = new InstanceMethodReference(); // Creating object
            // Referring non-static method using reference
            Readable readable = methodReference::readSomething;
            // Calling interface method
            readable.read();
            // Referring non-static method using anonymous object
            Readable readable2 = new InstanceMethodReference()::readSomething; // You can use anonymous object also
            // Calling interface method
            readable.read();
        }
    }

