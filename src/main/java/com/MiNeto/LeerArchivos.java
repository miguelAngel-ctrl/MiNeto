package com.MiNeto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public abstract class LeerArchivos {

    public final void archivo(String rutaArchivo) {
        //leer archivos de texto
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))){
            String linea;

            while ( (linea = br.readLine()) != null ) {
                if (linea.trim().isEmpty()) continue;
                //enviar linea al método personalizable
                leeLinea(linea);
            }

            //método secundario personalizable
            totalNeto();

        } catch (IOException e) {
            System.out.println("Error al cargar archivo : " + rutaArchivo);

        }


    }
    //método personalizable para clases hijas
    protected abstract void leeLinea(String linea);
    protected abstract void totalNeto();

}
