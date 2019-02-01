package br.com.dcardoso.rolagemcritica.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

import br.com.dcardoso.rolagemcritica.utils.enums.TipoAtaqueEnum;
import br.com.dcardoso.rolagemcritica.utils.enums.TipoCriticoEnum;
import br.com.dcardoso.rolagemcritica.utils.enums.TipoSistemaEnum;

@Entity
public class CardCritico {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String titulo;
    private String descricao;
    private int codTipo;
    private int codAtaque;
    private int codSistema;
    private int codIdioma;

    @Ignore
    private String tipoAtaqueDescricao;

    @Ignore
    public CardCritico() {
    }

    @Ignore
    public CardCritico(String titulo, String descricao, int codAtaque, int codTipo,int codSistema) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.codTipo = codTipo;
        this.codAtaque = codAtaque;
        this.codSistema = codSistema;
    }

    public CardCritico(String titulo, String descricao, int codAtaque, int codTipo,int codSistema, int codIdioma) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.codTipo = codTipo;
        this.codAtaque = codAtaque;
        this.codSistema = codSistema;
        this.codIdioma = codIdioma;
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

    public int getCodIdioma() {
        return codIdioma;
    }

    public void setCodIdioma(int codIdioma) {
        this.codIdioma = codIdioma;
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

                //cart critico 04
                new CardCritico("ENXERGANDO ESTRELAS", "Dano Crítico, e o alvo fica com sensibilidade à luz,  desvantagem em jogadas de ataques e testes de (Percepção), até o fim do encontro.", TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("BEM NO NERVO", "Dano Crítico, e o alvo fica atordoado (LdJ p. 287), até o início de seu próximo turno.", TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("CICATRIZ NO ROSTO", "Dano Crítico, e o alvo tem desvantagem em testes de Carisma (Persuasão) e vantagem em testes de Carisma (Intimidação), até receber tratamento.", TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("TRANSPOSIÇÃO", "Dano Crítico. e o alvo troca de lugar com você.", TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),

                //cart critico 05
                new CardCritico("PANCADA NA TÊMPORA", "Dano Critico, e o alvo fica inconsciente(Lclf p. 288), até o início de seu próximo turno.", TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("FRAGMENTOS ALOJADOS", "Dano Critico, e o alvo apenas consegue se curar magicamente, até realizar um descanso curto ou longo.", TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("FATIADO", "Dano Critico, e o alvo não pode usar seus modificadores de habilidade nas jogadas, até receber tratamento.", TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("LOBOTOMIA ARCANA", "Dano Crítico, e o alvo muda a sua tendência em um grau entre leal e caótico. Se ele for neutro, muda aleatoriamente.", TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),

                //cart critico 06
                new CardCritico("TREME TERRA", "Dano Critico, e o local d© alvo e toda área ao redor dele de até 1,5m (1 quadrado), se torna terreno difícil.", TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("BARRIGA PERFURADA", " Dano Critico, e o alvo sofre -1 de penalidade em todas o jogadas, até receber tratamento.", TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("CORTE NO NERVO", "Dano Critico, e o alvo sofre -1 de penalidade na CA, até receber tratamento.", TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("DESCONTROLE", "Dano Crítico, e o alvo realiza um ataque de oportunidade contra um aliado aleatório dele.", TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),

                //cart critico 07
                new CardCritico("IMPACTO PROFUNDO", "Dano Critico, e o alvo sofre 1 ponto de dano por nível de personagem, ou nível de desafio (mínimo 1), causado por um objeto do ambiente da cena.", TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("LÍNGUA PERFURA", "Dano Critico, e o alvo passa a falar com a língua entre os dentes, ate receber tratamento.", TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("ADRENALINA", "Dano Critico, e você tem +1 em jogadas de ataque, até o fim do encontro. Então perca 1 dado de vida ou adquira 1 nível de exaustão (1dj p.288).", TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("CONFUSÃO", "Dano Crítico, e a próxima jogada de ataque que o alvo realizar, e feita contra uma criatura aleatória.", TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),

                //cart critico 08
                new CardCritico("HEMATOMA", "Dano Critico, e o alvo sofre -2 de penalidade nas jogadas que utilizam Força, até receber tratamento.", TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("ATRAVESSADO", "Dano Crítico, e outro alvo, localizado atrás e adjacente a esse, pode sofrer metade do dano.", TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("CORTE COMPRIMIDO", "Dano Critico, e o alvo sofre 1 ponto de dano por nível de personagem, ou nível de desafio (mínimo 1), e deixa cair algo preso por cordas, tiras ou alço.", TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("MUDANÇA DE PERSONALIDADE", "Dano Crítico, e o alvo escolhe entre ter um traço de personalidade substituído por outro, à sua escolha, ou sofrer 5 (1d10) pontos de dano psíquico.", TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),

                //cart critico 09
                new CardCritico("COSTELAS QUEBRADAS", "Dano Critico, e o alvo sofre -2 de penalidade nas jogadas_que utilizam Força, até realizar um descanso curto ou longo.", TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("PREGADO NO LUGAR", "Dano Crítico, e o alvo fica impedido (LdJ p. 288), até ser bem-sucedido em um teste de Força (Atletismo) CD 15.", TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("REAÇÃO ALÉRGICA", "Dano Critico, e o alvo faz um teste de resistência de Constituição CD 10. Se falhar, fica envenenado (LdJ p. 288), até receber tratamento.", TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("DESCARGA CEREBRAL", "Dano Crítico, e o alvo muda a sua tendência em um grau entre bom e mal. Se ele for neutro, muda aleatoriamente.", TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),

                //cart critico 10
                new CardCritico("BEIJANDO O CHÃO", "Dano Crítico, e o alvo fica caído (LdJ p.287).", TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("COLUNA PERFURADA", "Dano Crítico, e o alvo faz um teste de resistência de Constituição CD 10.Se falhar, fica inconsciente (LdJ p. 288), até receber tratamento.", TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("CORTE DILACERANTE", "Dano Critico, e o alvo tem seu deslocamento igual a 0. Qualquer jogada envolvendo Força é uma falha, até o inicio de seu próximo turno.", TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("EFEITO MÁXIMO", "Dano Crítico, com todas as variáveis da magia maximizadas.", TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),

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
                new CardCritico("MAGIA INVERTIDA", "A magia recupera pontos de vida do alvo ao invés de causar dano.", TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),

                //cart critico 04
                new CardCritico("PIRIRI", "Você tem desvantagem em testes de Carisma, até realizar um descanso curto ou longo.", TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("CALCANHAR DO AMIGO", "Um alíado aleatório mais próximo ao alvo perde um dado de vida.", TipoAtaqueEnum.Distancia.getValor(),TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("FRESCURA", "Seus ataques causam metade do dano, até o fim de seu próximo  turno.", TipoAtaqueEnum.Natural.getValor(),TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("KA-GA'DA", "Um aliado aleatório fica marcado, até que o alvo esteja morto, derrotado, ou fora do seu alcance.", TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),

                //cart critico 05
                new CardCritico("TODO TORTO", "Seu ataque acerta você mesmo, causando metade do dano.", TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("PERDA DE CONFIANÇA", "Você possui desvantagem em jogadas contra esse alvo, até o fim do encontro.", TipoAtaqueEnum.Distancia.getValor(),TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("PÉ TORCIDO	", "Seu deslocamento cai pela metade, até o fim do encontro.", TipoAtaqueEnum.Natural.getValor(),TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("QUEDA DE RESISTÊNCIA", "Você tem desvantagem em testes de resistência contra magia, até o fim do encontro.", TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),

                //cart critico 06
                new CardCritico("DEFECADA NA CALÇA", "Qualquer criatura com olfato, e que estiver a 1,5 metro(I quadrado) de distáncia de você, fica envenenada (LdJ p. 288), até o inicio de seu próximo turno.", TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("MÃO MOLE", "Sua arma cai no chão.", TipoAtaqueEnum.Distancia.getValor(),TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("BATIDA NO ESTOMAGO", "Você regurgita sua última refeição.", TipoAtaqueEnum.Natural.getValor(),TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("CANSAÇO MENTAL", "Sua habilidade de conjuração perde o bónus de proficiência nos ataques e CD, até o fim do encontro.", TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),


                //cart critico 07
                new CardCritico("ATRAÇÃO PELO SOLO", "Vê fica caído (LdJ p.287).", TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("DANCINHA RIDÍCULA", "Faça um teste de Carisma CD 15.Se falhar, você se torna o alvo predileto dos inimigos que possam te ver, até o início de seu próximo turno.", TipoAtaqueEnum.Distancia.getValor(),TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("ERROU BONITO", "Seu ataque acerta um objeto aleatório, não mágico, e de uma categoria de tamanho igual ou menor que a sua. Sofra pontos de dano iguais ao seu bônus de proficiência.", TipoAtaqueEnum.Natural.getValor(),TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("MAGIA TRAICOEIRA", "Você se torna o novo alvo.", TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),


                //cart critico 08
                new CardCritico("BRAÇO QUEBRADO", "Você só pode usar umas das mãos, até receber tratamento.", TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("NÃO ERA BEM ISSO", "Seu ataque acerta um objeto aleatório, não mágico, e de uma categoria de tamanho igual ou menor que a sua. Ele é empurrado 1d10 metros (1d6 quadrados).", TipoAtaqueEnum.Distancia.getValor(),TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("CHOQUE NO NERVO", "Sua próxima ação não pode ser uma jogada de ataque.", TipoAtaqueEnum.Natural.getValor(),TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("CEGUEIRA ARCANA", "Uma criatura aleatória mais próxima de você se torna o novo alvo.", TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),

                //cart critico 09
                new CardCritico("ESTILHAÇOS", "Seu ataque acerca um objeto aleatório, não mágico, e de uma categoria de tamanho igual ou menor que a sua. Ele é destruído.", TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("DESCONCENTRADO", "Você sofre -5 de penalidade na próxima jogada de ataque com armas à distância.", TipoAtaqueEnum.Distancia.getValor(),TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("EGO FERIDO", "Você não pode atacar outro alvo, até que esse esteja morto, derrotado ou fora do seu alcance.", TipoAtaqueEnum.Natural.getValor(),TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("ALVO NA TESTA", "Um abado aleatório mais próximo ao alvo fica marcado, até o fim do encontro.", TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),

                //cart critico 10
                new CardCritico("ARMA DANIFICADA", "Sua arma não mágica tem seu dado de dano reduzido em um, até ser reparada.", TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("VERTIGEM", "Você sofre -5 de penalidade na próxima jogada de ataque com armas naturais.", TipoAtaqueEnum.Distancia.getValor(),TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("FALTA DE ALONGAMENTO", "A próxima jogada de ataque que o alvo realizar será um ACERTO CRÍTICO.", TipoAtaqueEnum.Natural.getValor(),TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),
                new CardCritico("TRANSFERÊNCIA DE PODER", "Toda vez que você se mover, fica envenenado (LdJ p. 288) até o inicio de seu próximo turno, até o fim do encontro.", TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor()),

                //endregion
        };
    }
}
