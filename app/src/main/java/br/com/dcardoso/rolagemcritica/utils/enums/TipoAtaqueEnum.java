package br.com.dcardoso.rolagemcritica.utils.enums;

public enum TipoAtaqueEnum {

    Contusao(1),
    Perfurante(2),
    Cortante(3),
    Magico(4),
    CorpoACorpo(5),
    Distancia(6),
    Natural(7);

    private final int valor;

    TipoAtaqueEnum(int valorOpcao){
        valor = valorOpcao;
    }
    public int getValor(){
        return valor;
    }

}
