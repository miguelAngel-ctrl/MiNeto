package com.MiNeto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*Utilización de lombok.
* Facilitar creación de constructores vacíos y con parámetros
* y getters and setters
*/
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Constructor {
    private String fecha;
    private double kilometros;
    private long gastos, propinas, ganancia;

    //dar formato al objeto
    @Override
    public String toString() {
        return "fecha:" + fecha + ",kilómetros:" + kilometros +
                ",gastos:" + gastos + ",propinas:" + propinas  + ",ganancia:" + ganancia;

    }


}

