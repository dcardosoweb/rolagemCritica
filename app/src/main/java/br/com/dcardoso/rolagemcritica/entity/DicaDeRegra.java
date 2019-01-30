package br.com.dcardoso.rolagemcritica.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class DicaDeRegra {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private int tipoRegra;
    private String tag;
    private String titulo;
    private String descricao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTipoRegra() {
        return tipoRegra;
    }

    public void setTipoRegra(int tipoRegra) {
        this.tipoRegra = tipoRegra;
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
}
