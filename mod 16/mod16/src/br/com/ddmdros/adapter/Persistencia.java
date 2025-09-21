package br.com.ddmdros.adapter;

import java.io.File;

public interface Persistencia {
    public void gravar (File file);

    public void ler(String path);
}
