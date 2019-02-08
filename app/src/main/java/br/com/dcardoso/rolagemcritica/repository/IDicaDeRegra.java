package br.com.dcardoso.rolagemcritica.repository;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

import br.com.dcardoso.rolagemcritica.entity.CardCritico;
import br.com.dcardoso.rolagemcritica.entity.DicaDeRegra;

@Dao
public interface IDicaDeRegra {

    @Query("SELECT * FROM cardcritico where codTipo = :tipoCritico and codAtaque =  :tipoAtaque and codSistema = :tipoSistema ORDER BY RANDOM() limit 1")
    public CardCritico ObterCard(int tipoAtaque, int tipoCritico, int tipoSistema);

    @Query("SELECT * FROM dicaderegra")
    public List<DicaDeRegra> ListarDicas();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void Save(DicaDeRegra DicaDeRegra);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void SaveAll(DicaDeRegra... listDicaDeRegra);
}
