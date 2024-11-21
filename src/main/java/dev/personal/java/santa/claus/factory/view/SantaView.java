package dev.personal.java.santa.claus.factory.view;

public class SantaView extends View {

    public static void showSantaView(){
        System.out.println("Gestor de juguetes (Tipo de sesión: Santa)");
        System.out.println("1. Ver lista de juguetes niños buenos");
        System.out.println("2. Ver lista de juguetes niños malos");
        System.out.println("3. Guargar lista de todos los juguetes (.csv)");
        System.out.println("4. Cerrar sesión");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                
                break;
        
            default:
                break;
        }
    }
}
