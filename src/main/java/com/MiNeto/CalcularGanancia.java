package com.MiNeto;

public class CalcularGanancia extends LeerArchivos {
    String fecha;
    double kilometros = 0, sumaKilometros = 0;
    long gastos = 0, propinas = 0, ganancia = 0, sumaGanancia = 0, sumaPropinas = 0, sumaGastos = 0;

    //sobreescribir método padre(LeerArchivos.java)
    @Override
    protected void leeLinea(String linea) {

        //separar valores por "," y guardarlos en el array
        String[] dias = linea.split(",");

        /*separar nombre(referencia) del valor que se va a sustraer.
        (se eliminan los nombres de las Variables del archivo de texto)
        y se guardan en Variables en memoria(ram)*/
        for (String dia : dias) {
            if (dia.trim().startsWith("kilómetros:")) {
                kilometros = Double.parseDouble(dia.substring("kilómetros:".length()));

            } else if (dia.trim().startsWith("fecha:")) {
                fecha = dia.substring("fecha:".length());

            } else if (dia.trim().startsWith("gastos:")) {
                gastos = Long.parseLong(dia.substring("gastos:".length()));

            } else if (dia.trim().startsWith("propinas:")) {
                propinas = Long.parseLong(dia.substring("propinas:".length()));

            } else if (dia.trim().startsWith("ganancia:")) {
                ganancia = Long.parseLong(dia.substring("ganancia:".length()));

            }


        }

        //sumamos los valores de todos los dias
        sumaGastos += gastos;
        sumaPropinas += propinas;
        sumaGanancia += ganancia;
        sumaKilometros += kilometros;

    }

    //mostrar ganancia total del mes
    @Override
    protected void totalNeto() {
        //reutilizo Variables
        ganancia = (sumaGanancia + sumaPropinas) - sumaGastos;

        System.out.printf("""
                --------------------------------------------------
                Resumen mensual.
                
                1. Kilómetros recorridos: %.2f
                2. propinas: +$%d
                3. Gastos:   -$%d
                4. Ganancia: +$%d
                
                Ganancia real después de propinas y deducciones de gastos:
                
                total ganado: $%d
                
                presiona (enter) para continuar.
                
                """, sumaKilometros, sumaPropinas, sumaGastos, sumaGanancia, ganancia);

        Variables.SCANNER.nextLine();

    }


}

