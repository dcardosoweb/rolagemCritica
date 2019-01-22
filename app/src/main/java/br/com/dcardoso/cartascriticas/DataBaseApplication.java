package br.com.dcardoso.cartascriticas;


import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import android.support.annotation.NonNull;

import java.util.concurrent.Executors;

import br.com.dcardoso.cartascriticas.entity.CardCritico;
import br.com.dcardoso.cartascriticas.repository.ICardRepository;

@Database(entities = {CardCritico.class},version = 1, exportSchema = false)

public abstract class DataBaseApplication extends RoomDatabase {
    public abstract ICardRepository cardRepository();

    private static DataBaseApplication INSTANCE;


}
