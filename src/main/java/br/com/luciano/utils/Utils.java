package br.com.luciano.utils;

import java.util.UUID;

public class Utils {

    public static String gerarStringAleatoria() {

        return UUID.randomUUID().toString().substring(0, 5);
    }

    public static String gerarNumeroAleatorio() {
        return  gerarStringAleatoria();
    }
}