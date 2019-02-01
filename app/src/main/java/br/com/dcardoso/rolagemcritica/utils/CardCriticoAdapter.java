package br.com.dcardoso.rolagemcritica.utils;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

import br.com.dcardoso.rolagemcritica.R;
import br.com.dcardoso.rolagemcritica.entity.CardCritico;
import br.com.dcardoso.rolagemcritica.databinding.FragmentCardItemBinding;
import br.com.dcardoso.rolagemcritica.utils.enums.TipoAtaqueEnum;

public class CardCriticoAdapter extends RecyclerView.Adapter<CardCriticoAdapter.CardCriticoViewHolder>  {

    private List<CardCritico> cardList;
    private Context context;

    public CardCriticoAdapter(List<CardCritico> itemList, Context ctx){
        cardList = itemList;
        context = ctx;
    }

    @NonNull
    @Override
    public CardCriticoViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
       FragmentCardItemBinding binding = DataBindingUtil.inflate(
                LayoutInflater.from(viewGroup.getContext()),
                R.layout.fragment_card_item, viewGroup, false);

        CardCriticoViewHolder viewHolder = new CardCriticoViewHolder(binding);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CardCriticoViewHolder cardCriticoViewHolder, int i) {
        CardCritico card = cardList.get(i);
        card.setTipoAtaqueDescricao(obterDescricaoAtaque(card.getCodAtaque()));

        if(card.getCodAtaque() == TipoAtaqueEnum.Contusao.getValor())
        {
            cardCriticoViewHolder.binding.iconCard.setImageResource(R.drawable.ic_spiked_bat);

        }else if(card.getCodAtaque() == TipoAtaqueEnum.Perfurante.getValor())
        {
            cardCriticoViewHolder.binding.iconCard.setImageResource(R.drawable.ic_sai);
        }else if(card.getCodAtaque() == TipoAtaqueEnum.Cortante.getValor())
        {
            cardCriticoViewHolder.binding.iconCard.setImageResource(R.drawable.ic_war_axe);
        }else if(card.getCodAtaque() == TipoAtaqueEnum.CorpoACorpo.getValor())
        {
            cardCriticoViewHolder.binding.iconCard.setImageResource(R.drawable.ic_giant);
        }else if(card.getCodAtaque() == TipoAtaqueEnum.Distancia.getValor())
        {
            cardCriticoViewHolder.binding.iconCard.setImageResource(R.drawable.ic_arrowed);
        }else if(card.getCodAtaque() == TipoAtaqueEnum.Natural.getValor())
        {
            cardCriticoViewHolder.binding.iconCard.setImageResource(R.drawable.ic_internal_injury);
            //cardCriticoViewHolder.binding.iconCard.setColorFilter(Color.parseColor("#ED4337"));
        }else if(card.getCodAtaque() == TipoAtaqueEnum.Magico.getValor())
        {
            cardCriticoViewHolder.binding.iconCard.setImageResource(R.drawable.ic_magic_swirl);
        }
        cardCriticoViewHolder.binding.setCard(card);

        setAnimation(cardCriticoViewHolder.itemView, i);
    }

    @Override
    public int getItemCount() {
        return cardList.size();
    }

    private String obterDescricaoAtaque(int codAtaque)
    {
        String result="";

        if(codAtaque == TipoAtaqueEnum.Contusao.getValor())
        {
            result = "Contusão";
        }else if(codAtaque == TipoAtaqueEnum.Perfurante.getValor())
        {
            result = "Perfurante";
        }else if(codAtaque == TipoAtaqueEnum.Cortante.getValor())
        {
            result = "Cortante";
        }else if(codAtaque == TipoAtaqueEnum.CorpoACorpo.getValor())
        {
            result = "Corpo-A-Corpo";
        }else if(codAtaque == TipoAtaqueEnum.Distancia.getValor())
        {
            result = "à Distância";
        }else if(codAtaque == TipoAtaqueEnum.Natural.getValor())
        {
            result = "Natural";
        }else if(codAtaque == TipoAtaqueEnum.Magico.getValor())
        {
            result = "Mágico";
        }

        return result;
    }

    private String obterDescricaoTipoCritico(int codDescricao)
    {
        return null;
    }

    public class CardCriticoViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {

        FragmentCardItemBinding binding;

        public CardCriticoViewHolder(FragmentCardItemBinding itemLayoutBinding) {
            super(itemLayoutBinding.getRoot());
            binding = itemLayoutBinding;
        }

        public CardCriticoViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        @Override
        public void onClick(View v) {

        }

        @Override
        public boolean onLongClick(View v) {
            return false;
        }
    }

    private int lastPosition = -1;
    private boolean on_attach = true;

    private void setAnimation(View view, int position) {
        if (position > lastPosition) {
            ItemAnimation.animate(view, on_attach ? position : -1, ItemAnimation.RIGHT_LEFT);
            lastPosition = position;
        }
    }
}
