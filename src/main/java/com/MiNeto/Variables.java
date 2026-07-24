package com.MiNeto;

import java.util.Scanner;

public class Variables {
    protected static final Scanner SCANNER = new Scanner(System.in);
    protected static final LeerArchivos BANNER_TXT = new Banner();
    protected static final LeerArchivos CALCULAR = new CalcularGanancia();
    protected static final String URL = "src/main/java/com/MiNeto/Banner.txt";
    protected static final String URL_2 = System.getProperty("user.dir") + java.io.File.separator + "dias.txt";

}
