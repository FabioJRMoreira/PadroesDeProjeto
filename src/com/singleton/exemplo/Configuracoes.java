package com.singleton.exemplo;

public class Configuracoes {
    //Garante que uma classe tenha apenas uma instância globalmente.
    //usado em geral para classes de configuracao
    //usado para poupar memoria do sistema
    private static Configuracoes instance;
    private Configuracoes(){

    }
    public static Configuracoes getInstance(){
        if(instance == null){
            // garante que seja thread safe
            synchronized (Configuracoes.class){
                if (instance ==null){
                    instance = new Configuracoes();
                }
            }
        }
        return instance;
    }
}
