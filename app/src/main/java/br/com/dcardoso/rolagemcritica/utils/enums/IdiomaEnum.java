package br.com.dcardoso.rolagemcritica.utils.enums;

public enum IdiomaEnum {

    Portugues(1), Ingles(2), Espanhol(3);

    private final int valor;

    IdiomaEnum(int valorOpcao){
        valor = valorOpcao;
    }
    public int getValor(){
        return valor;
    }
}
