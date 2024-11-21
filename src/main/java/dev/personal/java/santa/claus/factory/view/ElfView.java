package dev.personal.java.santa.claus.factory.view;

public class ElfView extends View {

    public static void showElfView() {
        System.out.println("Gestor de juguetes (Tipo de sesión: Elfo)");
        System.out.println("1. Añadir juguete");
        System.out.println("2. Ver todos los juguetes");
        System.out.println("3. Eliminar juguete");
        System.out.println("4. Cerrar sesión");
        System.out.println("Seleccione una opción:");
        int option = scanner.nextInt();

        if (option == 1) typeOfChild();
        if (option == 4) closeSession();
    }

    public static void typeOfChild () {
        System.out.println("Para niño ...?:");
        System.out.println("1. Bueno");
        System.out.println("2. Malo");
        int option = scanner.nextInt(); 

        if (option==1) createGoodToy();
    }

    public static void createGoodToy (){
        System.out.println("Ingrese el titulo:");
        String title = scanner.next();
        System.out.println("Ingrese la marca:");
        String brand = scanner.next();
        System.out.println("Ingrese la edad recomendada:");
        int age = scanner.nextInt();
        System.out.println("Ingrese la categoria:");
        String category = scanner.next();
    }


}
