package com.MiNeto;

public class menu {
    public static boolean opciones (int opcion) {

        switch (opcion) {
            case 1 -> {
                //agregar escribirEnArchivo
               //imprime banner(banner.java)
                variables.bannerTxt.archivo(variables.url);

                System.out.println("""
                        
                        -------------------------------------
                        Registro Iniciado.
                        
                        """);

                System.out.print("fecha: DD/MM/YYYY: ");
                String fecha = variables.scanner.nextLine();

                System.out.print("Kilómetros: ");
                double kilometros = variables.scanner.nextDouble();

                System.out.print("Gastos: ");
                long gastos = variables.scanner.nextLong();

                System.out.print("Propinas: ");
                long propinas = variables.scanner.nextLong();

                System.out.print("Ganancia: ");
                long ganancia = variables.scanner.nextLong();

                //crear objeto y enviar parámetros al constructor
                constructor datos = new constructor(fecha, kilometros, gastos, propinas, ganancia);

                //guardar datos en el archivo de texto(escribirEnArchivo.java)
                escribirEnArchivo.agregar(datos);

                variables.scanner.nextLine();

            }

            case 2 -> variables.calcular.archivo(variables.url2);//ver ganancia mensual(calcularGanancia.java)

            case 3 -> {
                //salir
                System.out.println("""
                        
                        --------------------------
                        --   Hasta pronto!..    --
                        --------------------------
                        """);

                variables.scanner.close();
                return false;

            }

            //opcion no existe
            default -> {
                System.out.printf("""
                    
                    --------------------------
                    opción incorrecta ¿ %d ?
                    --------------------------
                    
                    oprime (enter) para reintentar.
                    
                    """, opcion);
                variables.scanner.nextLine();

            }

        }

        return true;

    }


}
