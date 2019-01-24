package br.com.dcardoso.cartascriticas;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import br.com.dcardoso.cartascriticas.entity.CardCritico;
import br.com.dcardoso.cartascriticas.utils.CardCriticoAdapter;
import br.com.dcardoso.cartascriticas.utils.TipoAtaqueEnum;
import br.com.dcardoso.cartascriticas.utils.TipoCriticoEnum;
import br.com.dcardoso.cartascriticas.databinding.ActivityMainBinding;
import br.com.dcardoso.cartascriticas.utils.TipoSistemaEnum;

import static br.com.dcardoso.cartascriticas.CardCriticoApp.getContext;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ActivityMainBinding binding;
    DataBaseApplication db;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_setting, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.option_sobre:
                startActivity(new Intent(this, SobreActivity.class));
                return true;
            default:
                return true;
        }
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.acerto_critico:
                    carregarListaAcertoCritico();
                    return true;
                case R.id.falha_critica:
                    carregarListaFalhaCritica();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        BottomNavigationView navigation = binding.navigation;
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.setSelected(false);
        recyclerView = binding.rcvListCards;

        db = CardCriticoApp.obterInstanciaDB();
    }

    private void carregarListaAcertoCritico()
    {
        List<CardCritico> listCards = new ArrayList<>();
        listCards.add(db.cardRepository().ObterCard(TipoAtaqueEnum.Contusao.getValor(), TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()));
        listCards.add(db.cardRepository().ObterCard(TipoAtaqueEnum.Perfurante.getValor(), TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()));
        listCards.add(db.cardRepository().ObterCard(TipoAtaqueEnum.Cortante.getValor(), TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()));
        listCards.add(db.cardRepository().ObterCard(TipoAtaqueEnum.Magico.getValor(), TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()));

        CardCriticoAdapter adapter = new CardCriticoAdapter(listCards, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    private void carregarListaFalhaCritica()
    {
        List<CardCritico> listCards = new ArrayList<>();
        listCards.add(db.cardRepository().ObterCard(TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()));
        listCards.add(db.cardRepository().ObterCard(TipoAtaqueEnum.Distancia.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()));
        listCards.add(db.cardRepository().ObterCard(TipoAtaqueEnum.Natural.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()));
        listCards.add(db.cardRepository().ObterCard(TipoAtaqueEnum.Magico.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()));

        CardCriticoAdapter adapter = new CardCriticoAdapter(listCards, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}
