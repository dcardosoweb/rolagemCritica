package br.com.dcardoso.rolagemcritica;

import android.content.Context;
import android.content.SharedPreferences;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import br.com.dcardoso.rolagemcritica.databinding.ActivityConfiguracaoBinding;
import br.com.dcardoso.rolagemcritica.utils.enums.IdiomaEnum;
import br.com.dcardoso.rolagemcritica.utils.enums.TipoSistemaEnum;

public class ConfiguracaoActivity extends AppCompatActivity {

    ActivityConfiguracaoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracao);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_configuracao);
        SharedPreferences sharedPref = this.getSharedPreferences(getString(R.string.shared_file_key), Context.MODE_PRIVATE);
        int sistemaEscolhido = sharedPref.getInt(getString(R.string.shared_key_sistema), 0);


        switch (sistemaEscolhido) {
            case 0:
                binding.rdbDdPortugues.setChecked(true);
                break;
            case 1:
                binding.rdbDdIngles.setChecked(true);
                break;
        }

    }

    public void salvarConfiguracao(View v)
    {
        if(binding.rdbDdIngles.isChecked())
        {
            SharedPreferences sharedPref = this.getSharedPreferences(getString(R.string.shared_file_key), Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPref.edit();
            editor.putInt(getString(R.string.shared_key_idioma), IdiomaEnum.Ingles.getValor());
            editor.putInt(getString(R.string.shared_key_sistema), TipoSistemaEnum.DungeonsDragons.getValor());
            editor.commit();
        }else if(binding.rdbDdPortugues.isChecked())
        {
            SharedPreferences sharedPref = this.getSharedPreferences(getString(R.string.shared_file_key), Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPref.edit();
            editor.putInt(getString(R.string.shared_key_idioma), IdiomaEnum.Portugues.getValor());
            editor.putInt(getString(R.string.shared_key_sistema), TipoSistemaEnum.DungeonsDragons.getValor());
            editor.commit();
        }
    }
}
