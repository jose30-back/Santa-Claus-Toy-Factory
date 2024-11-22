package dev.personal.java.santa.claus.factory.view;

public class HomeView extends View {

    public static void showMainMenu() {
        System.out.println("<-------------Santa Claus Toy Factory------------->");
        System.out.println("Iniciar sesión como:");
        System.out.println("1. Elfo");
        System.out.println("2.Santa Claus");
        System.out.println("3. Salir");
        System.out.println("Seleccione una opcion: ");
        int option = scanner.nextInt();

        if (option == 1) ElfView.showElfView();
        if (option == 2) SantaView.showSantaView();
        if (option == 3) quit();
    }
}
