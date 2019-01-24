package br.com.dcardoso.cartascriticas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SobreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);
    }


    public void creditoDungeonsDragons(View v)
    {
        startActivity(new Intent(this, CreditosDungeonsDragonsActivity.class));
    }

    public void creditoRpgNext(View v)
    {
        startActivity(new Intent(this, CreditosRpgNextActivity.class));
    }

    public void creditoImagens(View v)
    {
        startActivity(new Intent(this, CreditoUsoImagemActivity.class));
    }
}
