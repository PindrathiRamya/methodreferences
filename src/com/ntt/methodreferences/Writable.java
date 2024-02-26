package com.ntt.methodreferences;
//REFERENCE TO A STATIC METHOD
 interface Writable {

        void write();
    }
    class MethodReference {
        public static void writeSomething(){
            System.out.println("this is static method");
        }
        public static void main(String[] args) {
            // Referring static method
            Writable writable = MethodReference::writeSomething;
            // Calling interface method
            writable.write();
        }
    }

