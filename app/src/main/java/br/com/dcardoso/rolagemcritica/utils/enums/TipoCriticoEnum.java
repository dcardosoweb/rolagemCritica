package br.com.dcardoso.rolagemcritica.utils.enums;

public enum TipoCriticoEnum {

    Ataque(1), Falha(2);

    private final int valor;

    TipoCriticoEnum(int valorOpcao){
        valor = valorOpcao;
    }
    public int getValor(){
        return valor;
    }
}
