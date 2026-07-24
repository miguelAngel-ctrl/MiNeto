package com.MiNeto;

public class Main {
    public static void main(String[] args) {

        int opcion;

        do {
            //mostrar Banner(Banner.java)
            Variables.BANNER_TXT.archivo(Variables.URL);

            System.out.println("""
                    Menu.
                    
                        1. registrar dia | 2. ver mes | 3. salir
                    
                    """);
            System.out.print("Ingrese opción: ");
            opcion = Variables.SCANNER.nextInt();

            Variables.SCANNER.nextLine();

        } while (Menu.opciones(opcion));


    }


}