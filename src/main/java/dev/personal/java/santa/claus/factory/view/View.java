package dev.personal.java.santa.claus.factory.view;

import java.util.Scanner;

public class View {

    protected static Scanner scanner = new Scanner(System.in);

    public static void quit() {
        System.out.println("<----------Feliz Navidad---------->");
        scanner.close();
    }

    public static void closeSession () {
        System.out.println("Session closed");
        HomeView.showMainMenu();
    }
}
