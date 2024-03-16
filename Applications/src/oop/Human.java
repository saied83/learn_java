package oop;

import java.util.concurrent.CancellationException;

import javax.crypto.Mac;

class Machine {
    void start(){
        System.out.println("This is machine");
    }
}

class Mobile extends Machine{ // inheritance
    void start() {
        System.out.println("This is mobile");
    }
    void stop(){
        System.out.println("Mobile Stopped");
    }
}

public class Human {
    public static void main(String[] args) {
        Machine m1 = new Machine();
        Mobile w1 = new Mobile();

        //upcasting
        Machine m2 = w1;
        m2.start();

        //downcasting
        Machine m3 = new Mobile();
        System.out.println(m3);
        Mobile w2 = (Mobile)m3;
        System.out.println(w2);
        w2.start();
        w2.stop();  
        m3.start();
    }
}


