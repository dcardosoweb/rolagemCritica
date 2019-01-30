package br.com.dcardoso.rolagemcritica.utils;

public enum TipoRegra {

    RolagemDado(1), TipoDanoEspecial(2),Habilidades(3), SavingThrows(4),CondicaoEspecial(5), RegraExtra(6);

    private final int valor;

    TipoRegra(int valorOpcao){
        valor = valorOpcao;
    }
    public int getValor(){
        return valor;
    }
}
