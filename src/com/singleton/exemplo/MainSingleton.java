package com.singleton.exemplo;

public class MainSingleton {
    public static void main(String[] args) {
        Configuracoes c1 = Configuracoes.getInstance();
        Configuracoes c2 = Configuracoes.getInstance();
        if(c1==c2){
            System.out.println("Singleton funcionou !");
        }else {
            System.out.println("Singleton nao funcionou !");
        }
    }
}
