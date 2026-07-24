package com.MiNeto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirEnArchivo {
    public static void agregar(Constructor rf){
        try (BufferedWriter escribir = new BufferedWriter(new FileWriter("dias.txt",true))) {
            //escribir objeto en el archivo de texto
            escribir.write(rf.toString());
            escribir.newLine();

            System.out.print("""
                    
                    Se guardo ¡correctamente!.
                    
                    oprime (enter) para continuar...
                    
                    """);
            Variables.SCANNER.nextLine();

        }catch (IOException e){
            System.out.println("""
                    
                    Error al guardar tu registro.
                    
                    oprime (enter) para continuar...
                    
                    """);
            Variables.SCANNER.nextLine();

        }


    }


}
