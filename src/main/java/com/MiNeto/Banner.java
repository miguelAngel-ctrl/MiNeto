package com.MiNeto;

public class Banner extends LeerArchivos {
    //Sobreescribir método del padre(polimorfismo)
    @Override
    protected void leeLinea(String linea) {
        System.out.println(linea);

    }

    @Override
    protected void totalNeto() {}

}
