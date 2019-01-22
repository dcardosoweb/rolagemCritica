package br.com.dcardoso.cartascriticas.repository;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

import br.com.dcardoso.cartascriticas.entity.CardCritico;

@Dao
public interface ICardRepository {

    @Query("SELECT * FROM cardcritico where codTipo = :tipoCritico and codAtaque =  :tipoAtaque and codSistema = :tipoSistema ORDER BY RANDOM() limit 1")
    public CardCritico ObterCard(int tipoAtaque, int tipoCritico, int tipoSistema);

    @Query("SELECT * FROM cardcritico")
    public List<CardCritico> ListarCards();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void Save(CardCritico cardCritico);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void SaveAll(CardCritico... listCardCritico);
}
