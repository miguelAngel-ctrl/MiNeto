package com.MiNeto;

public class Menu {
    public static boolean opciones (int opcion) {

        switch (opcion) {
            case 1 -> {
                //agregar EscribirEnArchivo
               //imprime Banner(Banner.java)
                Variables.BANNER_TXT.archivo(Variables.URL);

                System.out.println("""
                        
                        -------------------------------------
                        Registro Iniciado.
                        
                        """);

                System.out.print("fecha: DD/MM/YYYY: ");
                String fecha = Variables.SCANNER.nextLine();

                System.out.print("Kilómetros: ");
                double kilometros = Variables.SCANNER.nextDouble();

                System.out.print("Gastos: ");
                long gastos = Variables.SCANNER.nextLong();

                System.out.print("Propinas: ");
                long propinas = Variables.SCANNER.nextLong();

                System.out.print("Ganancia: ");
                long ganancia = Variables.SCANNER.nextLong();

                //crear objeto y enviar parámetros al Constructor
                Constructor datos = new Constructor(fecha, kilometros, gastos, propinas, ganancia);

                //guardar datos en el archivo de texto(EscribirEnArchivo.java)
                EscribirEnArchivo.agregar(datos);

                Variables.SCANNER.nextLine();

            }

            case 2 -> Variables.CALCULAR.archivo(Variables.URL_2);//ver ganancia mensual(CalcularGanancia.java)

            case 3 -> {
                //salir
                System.out.println("""
                        
                        --------------------------
                        --   Hasta pronto!..    --
                        --------------------------
                        """);

                Variables.SCANNER.close();
                return false;

            }

            //opcion no existe
            default -> {
                System.out.printf("""
                    
                    --------------------------
                    opción incorrecta ¿%d?
                    --------------------------
                    
                    oprime (enter) para reintentar.
                    
                    """, opcion);
                Variables.SCANNER.nextLine();

            }

        }

        return true;

    }


}
