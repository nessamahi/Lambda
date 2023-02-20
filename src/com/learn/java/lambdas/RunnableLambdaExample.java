package com.learn.java.lambdas;

public class RunnableLambdaExample {
    public static void main(String[] args) {
        //prior java 8
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside runnable 1");
            }
        };

        //Runnable instance is ready
        //Now we'll pass this instance inside the thread and the thread will run whatever we implemented
        //in the method run()
        new Thread(runnable).start();

        //Now implement this using java 8 lambda syntax
        //syntax : ()->{};
        Runnable runnableLambda = () -> {
            System.out.println("Inside runnable 2");
        };

        //if you have one statement to execute inside the lambda - you can avoid the curly braces
        Runnable runnableLambda1 = () -> System.out.println("Inside runnable 3");

        new Thread(runnableLambda).start();
        new Thread(runnableLambda1).start();

        //you can pass a runnable without creating an instance variable
        new Thread(() -> System.out.println("Inside lambda 4")).start();

        //legacy way to create the same thing
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside lambda 4.1");
            }
        }).start();


    }
}
