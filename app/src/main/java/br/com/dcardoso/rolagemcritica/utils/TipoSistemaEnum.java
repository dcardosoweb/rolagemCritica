package br.com.dcardoso.rolagemcritica.utils;

public enum TipoSistemaEnum {
    DungeonsDragons(1);

    private final int valor;

    TipoSistemaEnum(int valorOpcao){
        valor = valorOpcao;
    }
    public int getValor(){
        return valor;
    }
}
