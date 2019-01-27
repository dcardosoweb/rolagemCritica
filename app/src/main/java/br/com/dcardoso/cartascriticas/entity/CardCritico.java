package br.com.dcardoso.cartascriticas.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

import br.com.dcardoso.cartascriticas.utils.TipoAtaqueEnum;
import br.com.dcardoso.cartascriticas.utils.TipoCriticoEnum;
import br.com.dcardoso.cartascriticas.utils.TipoSistemaEnum;

@Entity
public class CardCritico {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String titulo;
    private String descricao;
    private int codTipo;
    private int codAtaque;
    private int codSistema;

    @Ignore
    private String tipoAtaqueDescricao;

    @Ignore
    public CardCritico() {
    }

    public CardCritico(String titulo, String descricao, int codAtaque, int codTipo,int codSistema) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.codTipo = codTipo;
        this.codAtaque = codAtaque;
        this.codSistema = codSistema;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getCodTipo() {
        return codTipo;
    }

    public void setCodTipo(int codTipo) {
        this.codTipo = codTipo;
    }

    public int getCodAtaque() {
        return codAtaque;
    }

    public void setCodAtaque(int codAtaque) {
        this.codAtaque = codAtaque;
    }

    public String getTipoAtaqueDescricao() {
        return tipoAtaqueDescricao;
    }

    public void setTipoAtaqueDescricao(String tipoAtaqueDescricao) {
        this.tipoAtaqueDescricao = tipoAtaqueDescricao;
    }

    public int getCodSistema() {
        return codSistema;
    }

    public void setCodSistema(int codSistema) {
        this.codSistema = codSistema;
    }

    public static CardCritico[] populateData() {
        return new CardCritico[] {
                //region Card Ataque Critico

                //cart critico 01
                new CardCritico("traqueia esmagada", "Dano Crítico, e o alvo fica incapacitado (Ldj p.288) e não pode falar e respirar, até o nicio de seu próximo turno", TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("mão perfurada", "Dano Crítico, e o alvo solta um item que tiver segurado e não pode usar aquele membro, até o início do seu próximo turno", TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("testa cortada", "Dano Crítico, e o alvo fica cego (Ldj p.287), até o início de seu próximo turno.", TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("vulnerabilidade mágica", "Dano Crítico, e o alvo tem vulnerabilidade a dano mágico (Ldj p. 197), até o nício de seu próximo turno.", TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),

                //cart critico 02
                new CardCritico("pancada na barriga", "Dano Crítico, e o alvo não consegue se alimentar ou ingerir liquidos, até receber tratamento.", 1,1, TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("ciatico pincado", "Dano Crítico, e o alvo faz um teste de resistência de constituição CD 15. Se falhar, fica impedido (Lpj p.288), até receber tratamento", 2,1, TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("coluna machucada", "Dano Crítico, e o alvo fica caído (Ldj p.287), não podendo se levantar, até receber tratamento.", 3,1, TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("encolhimento", "Dano Crítico, e o alvo tem seu tamanho reduzido como na Magia 'Aumentar/Reduzir' (Ldj p.217), até receber tratamento.", 4,1, TipoSistemaEnum.DungeonsDragons.getValor()),

                //cart critico 03
                new CardCritico("ombro deslocado", "Dano Crítico, e o alvo não pode realizar um 'Encontrão', até receber tratamento.", 1,1, TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("pulmão perfurado", "Dano Crítico, e o alvo adquire 2 níveis de exaustão (Ldj p.288), que podem ser removidos com tratamento.", 2,1, TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("artéria cortada", "Dano Crítico, e o alvo faz um teste de resistência de constituição CD 15, Se falhar sofre dano igual a metade dos pontos de vida restantes.", 3,1, TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("afeto mágico", "Dano Crítico, e o alvo fica enfeitiçado (Ldj p.288) por voce até o início do seu próximo turno", 4,1, TipoSistemaEnum.DungeonsDragons.getValor()),

                //endregion

                //region Card falha Critica

                //cart critico 01
                new CardCritico("OFENSA COLETIVA", "Faça um teste de Carisma CD I 5.Se falhar, fica marcado, até que o alvo esteja morto, derrotado, ou fora do seu alcance.", TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("MÁ PONTARIA", "Uma criatura aleatória mais distante do alvo se torna o novo alvo.", TipoAtaqueEnum.Distancia.getValor(),TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("ENJOADO", "Você fica envenenado (LdJ p.288).até o fim do encontro.", TipoAtaqueEnum.Natural.getValor(),TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("FENDA MÁGICA", "Você é teleportado para o local mais próximo adjacente ao alvo.", TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),

                //cart critico 02
                new CardCritico("PULSO TORCIDO", "Suas jogadas de ataque corpo a corpo perdem o bónus de proficiência, até o fim do encontro.", TipoAtaqueEnum.CorpoACorpo.getValor(),TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("ATRAPALHADO", "Toda sua munição cai no chão.", TipoAtaqueEnum.Distancia.getValor(),TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("GUARDA BAIXA", "A próxima jogada de ataque realizada contra você tem vantagem.", TipoAtaqueEnum.Natural.getValor(),TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("ENERGIA DRENADA", "Você perde um espaço de magia aleatório.", TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),

                //cart critico 03
                new CardCritico("ESCAPULIU", "Sua arma cai no chão atrás do alvo.", TipoAtaqueEnum.CorpoACorpo.getValor(),TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("AGORA É PESSOAL", "Você fica marcado apenas pelo alvo, até que ele esteja morto, derrotado, ou fora do seu alcance.", TipoAtaqueEnum.Distancia.getValor(),TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("LEi DE ENCONTRO", "A arma do alvo causa dano em você. Na auséncia de uma arma, você sofre pontos de dano igual ao seu nivel de personagem, ou nível de desafio (mínimo 1).", TipoAtaqueEnum.Natural.getValor(),TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("MAGIA INVERTIDA", "A magia recupera pontos de vida do alvo ao invés de causar dano.", TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor())


                //endregion
        };
    }
}
