package br.com.dcardoso.rolagemcritica;


import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import br.com.dcardoso.rolagemcritica.entity.CardCritico;
import br.com.dcardoso.rolagemcritica.entity.DicaDeRegra;
import br.com.dcardoso.rolagemcritica.repository.ICardRepository;

@Database(entities = {CardCritico.class, DicaDeRegra.class},version = 2, exportSchema = false)

public abstract class DataBaseApplication extends RoomDatabase {
    public abstract ICardRepository cardRepository();

    private static DataBaseApplication INSTANCE;


}
