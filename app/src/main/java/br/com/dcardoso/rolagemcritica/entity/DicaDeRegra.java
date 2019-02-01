package br.com.dcardoso.rolagemcritica.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class DicaDeRegra {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String tag;
    private String titulo;
    private String descricao;
    private int codSistema;
    private int codIdioma;

    @Ignore
    public DicaDeRegra() {
    }

    public DicaDeRegra(String tag, String titulo, String descricao, int codSistema, int codIdioma) {
        this.tag = tag;
        this.titulo = titulo;
        this.descricao = descricao;
        this.codSistema = codSistema;
        this.codIdioma = codIdioma;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCodSistema() {
        return codSistema;
    }

    public void setCodSistema(int codSistema) {
        this.codSistema = codSistema;
    }

    public int getCodIdioma() {
        return codIdioma;
    }

    public void setCodIdioma(int codIdioma) {
        this.codIdioma = codIdioma;
    }
}
