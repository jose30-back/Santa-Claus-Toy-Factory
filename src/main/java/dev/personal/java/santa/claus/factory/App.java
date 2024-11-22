package dev.personal.java.santa.claus.factory;

import dev.personal.java.santa.claus.factory.controller.HomeController;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        HomeController.startApp();
    }
}
