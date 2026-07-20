package com.MiNeto;

import java.util.Scanner;

public class variables {
    public static Scanner scanner = new Scanner(System.in);
    public static leerArchivos bannerTxt = new banner();
    public static leerArchivos calcular = new calcularGanancia();
    public static String url = "src/main/java/com/MiNeto/banner.txt";
    public static String url2 = System.getProperty("user.dir") + java.io.File.separator + "dias.txt";

}
