package br.com.ddmdros.singleton;

public class SingletonPropriedades {
    private static SingletonPropriedades singleton;
    private String value;

    private SingletonPropriedades(String value){
        this.value = value;
    }

    public static SingletonPropriedades getInstance(String value){
        if(singleton == null){
            singleton = new SingletonPropriedades(value);
        }
        return singleton;
    }

    public String getValue() {
        return value;
    }
}
