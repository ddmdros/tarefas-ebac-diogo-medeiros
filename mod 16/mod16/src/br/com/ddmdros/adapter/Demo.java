package br.com.ddmdros.adapter;

import java.io.File;

public class Demo {
    public static void main(String[] args) {

        String file = "adsassda";
        DropBox drop = new DropBox();
        Persistencia arquivos = new DropBoxAdapter(drop);
        arquivos.gravar(new File(file));


    }
}
