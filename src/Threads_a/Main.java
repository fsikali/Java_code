package Threads_a;

// Threads allows a program to operate more efficiently by doing multiple things at the same time
// Threads can be used to perform complicated tasks in the background without interrupting the main program

// Creating a Thread
// There are two ways to create a thread:
// It can be created by extending the Thread class and overriding its run() method:

// Extended Syntax

public class Main extends Thread {
    public void run() {
        System.out.println("This code is running in a thread");
    }
}

// Another way to create a thread is to implement the Runnable interface check in the next example Threads_b

