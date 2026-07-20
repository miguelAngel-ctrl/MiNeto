package com.MiNeto;

public class Main {
    public static void main(String[] args) {

        int opcion;

        do {
            //mostrar banner(banner.java)
            variables.bannerTxt.archivo(variables.url);

            System.out.println("""
                    Menu.
                    
                        1. registrar dia | 2. ver mes | 3. salir
                    
                    """);
            System.out.print("Ingrese opción: ");
            opcion = variables.scanner.nextInt();

            variables.scanner.nextLine();

        } while (menu.opciones(opcion));


    }


}