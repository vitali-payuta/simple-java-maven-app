package com.mycompany.app;

/**
 * Hello world!
 */
public void infiniteLoopUsingWhile() {
    while (true) {
        // do something
    }
}


public class App
{

    private final String message = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());        
    }

    private final String getMessage() {
        return message;
    }

}
