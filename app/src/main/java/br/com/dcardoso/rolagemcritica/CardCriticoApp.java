package br.com.dcardoso.rolagemcritica;

import android.app.Application;
import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;

import java.util.concurrent.Executors;

import br.com.dcardoso.rolagemcritica.entity.CardCritico;

public class CardCriticoApp extends Application {

    private static DataBaseApplication database;
    private static CardCriticoApp instance;
    private static AppCompatActivity sharedActivityToViewModel;

    public static AppCompatActivity getSharedActivityToViewModel() {
        return sharedActivityToViewModel;
    }

    public static void setSharedActivityToViewModel(AppCompatActivity sharedActivityToViewModel) {
        CardCriticoApp.sharedActivityToViewModel = sharedActivityToViewModel;
    }

    public static CardCriticoApp getInstance() {
        return instance;
    }

    public static Context getContext(){
        return instance.getApplicationContext();
    }


    @Override
    public void onCreate() {
        super.onCreate();
        database =
                Room.databaseBuilder(this,
                        DataBaseApplication.class,
                        "rolagem_critica")
                        .allowMainThreadQueries()
                        .fallbackToDestructiveMigration()
                        .addCallback(new RoomDatabase.Callback() {
                            @Override
                            public void onCreate(@NonNull final SupportSQLiteDatabase db) {
                                super.onCreate(db);
                                Executors.newCachedThreadPool().execute(new Runnable() {
                                    @Override
                                    public void run() {
                                       database.cardRepository().SaveAll(CardCritico.populateData());
                                    }
                                });
                            }
                        })
                        .build();

        instance = this;
    }

    public static DataBaseApplication obterInstanciaDB()
    {
        return database;
    }
}
