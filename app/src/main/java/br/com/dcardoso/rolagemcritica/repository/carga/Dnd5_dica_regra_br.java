package br.com.dcardoso.rolagemcritica.repository.carga;

import br.com.dcardoso.rolagemcritica.entity.DicaDeRegra;
import br.com.dcardoso.rolagemcritica.utils.enums.IdiomaEnum;
import br.com.dcardoso.rolagemcritica.utils.enums.TipoSistemaEnum;

public class Dnd5_dica_regra_br {

    public static DicaDeRegra[] populateData() {
        return new DicaDeRegra[]{
                new DicaDeRegra(
                        "ADVANTAGE",
                        "Vantagem",
                        "Quando você tiver que fazer o teste, use um d20 adicional. Use o maior dos dois testes como resultado. <Ul> <li> Se duas situações favoráveis concederem vantagem a ele, você ainda jogará apenas um d20 adicional. </ Li> <li> Se as circunstâncias fizerem um teste ter ambas as vantagens e desvantagem, você é considerado não ter nenhum deles, e você rola apenas um d20. </ li> </ ul>",
                        TipoSistemaEnum.DungeonsDragons.getValor(), IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "DISADVANTAGE",
                        "Desvantagem",
                        "Quando você tiver que fazer o teste, use um d20 adicional. Use o menor dos dois testes como resultado. <Ul> <li> Se duas situações favoráveis impuserem desvantagem a ele, você ainda jogará apenas um d20 adicional. </ Li> <li> Se as circunstâncias fizerem com que um teste tenha ambas as vantagens e desvantagem, você é considerado não ter nenhum deles, e você rola apenas um d20. </ li> </ ul>",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "OBJECT-DAMAGE",
                        "Danificando um objeto",
                        "Objetos são imunes ao veneno e dano psíquico, mas podem ser afetados por ataques físicos e mágicos como criaturas podem. <Ul> <li> O Mestre determina a Classe de Armadura de um objeto e pontos de vida, e pode decidir que certos objetos têm resistência. ou imunidade a certos tipos de ataques (É difícil cortar uma corda com um taco, por exemplo) </ li> <li> Objetos sempre falham nos testes de Resistência e Destreza, e eles são imunes a efeitos que exigem outras defesas </ li > <li> Quando um objeto cai para 0 pontos de vida, ele quebra </ li> </ ul>",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "ABILITY-REDUCTION",
                        "Redução de habilidade",
                        "A redução de habilidade é curada geralmente depois de um longo descanso, mas pode exigir o uso de magias como <em> Maior Restauração </ em>.",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "ABILITY-STR",
                        "Redução de força",
                        "O personagem recebe penalidade em: <ul> <li> Verificações de força </ li> <li> Arremessos de resistência </ li> <li> Verificações de atletismo </ li> <li> Ataques corpo-a-corpo e danos feitos com falta de sutileza armas </ li> <li> Capacidade de carga </ li> </ ul>",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "ABILITY-DEX",
                        "Redução de Destreza",
                        "O personagem recebe penalidade em: <ul> <li> Verificações de Destreza </ li> <li> Testes de resistência de Destreza </ li> <li> Acrobacia, Prova de Mão e Furtividade </ li> <li> Ataque à distância e arma rolagens de dano </ li> <li> Ataques corpo a corpo e jogadas de dano feitas com armas sutis </ li> <li> Verificações de iniciativa </ li> <li> Classe de Armadura </ li> </ ul>",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "ABILITY-CON",
                        "Redução de Constituição",
                        "O personagem recebe penalidade em: <ul> <li> Verificações de Constituição </ li> <li> Arremessos de economia de Constituição </ li> <li> Total de Pontos de Vida para cada Dado de Vida </ li> </ ul> Um personagem com um A pontuação de constituição de 0 está morta.",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "ABILITY-INT",
                        "Redução de Inteligência",
                        "O personagem recebe penalidade em: <ul> <li> Verificações de Inteligência </ li> <li> Testes de Inteligência </ li> <li> Verificações de Arcana, Histórico, Investigação, Natureza e Religião </ li> <li> Magia baseada em Inteligência </ li> </ ul>",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "ABILITY-WIS",
                        "Redução de Sabedoria",
                        "O personagem recebe penalidade em: <ul> <li> Verificações de sabedoria </ li> <li> Testes de economia de sabedoria </ li> <li> Testes de manejo de animais, insights, medicina, percepção e sobrevivência </ li> <li> Magias baseadas em Sabedoria </ li> </ ul>",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "ABILITY-CHA",
                        "Redução de carisma",
                        "O personagem recebe penalidade em: <ul> <li> Verificações de carisma </ li> <li> Testes de resistência de carisma </ li> <li> Verificações de Decepção, Intimidação, Desempenho e Persuasão </ li> <li> Magias baseadas em Carisma </ li> <li> Nível de Desafio para resistir energia canalizada </ li> </ ul>",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "SAVE-CRITICAL",
                        "Nivel de Desafio (ND) ataque crítico",
                        "Use o teste de ataque como o ND de salvamento.",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "SAVE-FUMBLE",
                        "Nivel de Desafio (ND) falha crítica",
                        "Use a armadura do alvo como o ND de salvamento.",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "UNTIL-HEALED",
                        "Até que seja curado",
                        "Isso se refere ao efeito ou dano adicional causado, não ao dano de arma ou feitiço.",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "STATUS-BLINDED",
                        "Cego",
                        "O personagem não pode ver. <Ul> <li> Falha em qualquer teste de habilidade que exija visão </ li> <li> Rolagem de ataque contra o personagem tem vantagem, e as jogadas de ataque do personagem têm desvantagem </ li> </ ul>",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "STATUS-CHARMED",
                        "Encantado",
                        "O personagem considera o outro como um amigo amigável. <Ul> <li> Não pode atacar o encantador ou mirar no encantador com habilidades prejudiciais ou efeitos mágicos </ li> <li> O encantador tem vantagem em qualquer habilidade para interagir socialmente com o personagem </ li> </ ul>",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "STATUS-CONFUSED",
                        "Confuso",
                        "O personagem tem sua mente distorcida e não pode agir normalmente ou reagir. A cada rodada, role 1d10: <ol> <li> 1: O personagem usa todo o seu movimento para se mover em uma direção aleatória. Para determinar a direção, role um d8 e atribua uma direção a cada face do dado. O personagem não executa uma ação neste turno </ li> <li> 2–6: O personagem não se move ou realiza ações neste turno </ li> <li> 7–8: O personagem usa sua ação para fazer um ataque corpo-a-corpo contra um personagem determinado aleatoriamente ao seu alcance. Se não houver nenhum personagem ao seu alcance, o personagem não faz nada neste turno </ li> <li> 9–10: O personagem pode agir e se mover normalmente </ li> </ ol>",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "STATUS-DEAFENED",
                        "Surdo",
                        "O personagem não pode ouvir e automaticamente falha em qualquer teste de habilidade que exija audição.",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "STATUS-DYING",
                        "Morrendo",
                        "Sempre que você iniciar seu turno com 0 pontos de vida, você deve fazer um teste de resistência especial, chamado teste de resistência à morte, para determinar se você se aproxima da morte ou se agarra à vida. Ao contrário de outros testes de resistência, este não está vinculado a qualquer valor de habilidade. Você está nas mãos do destino agora, auxiliado apenas por magias e recursos que melhoram suas chances de sucesso em um teste de resistência. <br> <b> Jogue um d20: </ b> Se o teste tiver 10 ou mais, você será bem-sucedido. Caso contrário, você falha. Um sucesso ou fracasso não tem efeito por si só. No seu terceiro sucesso, você se torna <i> estável </ i>. Na sua terceira falha, você morre. Os sucessos e fracassos não precisam ser consecutivos; acompanhe os dois até que você receba um trio. O número de ambos é redefinido para zero quando você recupera qualquer ponto de vida ou fica estável. <B> Rolling 1 ou 20: </ b> Quando você faz um teste de resistência à morte e rola um 1 no d20, ele conta como dois fracassos. Se você rolar um 20 no d20, você recuperará 1 ponto de vida. <br> <b> Dano em 0 Pontos de Vida: </ b> Se você receber qualquer dano enquanto tiver 0 pontos de vida, sofrerá uma falha no teste de salva-vidas. Se o dano for de um acerto crítico, você sofrerá dois fracassos. Se o dano for igual ou maior que seu ponto de vida máximo, você sofrerá morte instantânea.",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "STATUS-EXHAUSTED",
                        "Exausto",
                        "O personagem está esgotado de energia. A exaustão é medida em seis níveis. Um efeito pode dar a um personagem um ou mais níveis de exaustão, conforme especificado na descrição do efeito. <Ol> <li> 1: Desvantagem nas verificações de habilidade </ li> <li> 2: Velocidade reduzida </ li> <li> 3: Desvantagem em jogadas de ataque e testes de resistência </ li> <li> 4: Máximo de pontos de vida dividido pela metade </ li> <li> 5: Velocidade reduzida para 0 </ li> <li> 6: Morte </ li> < / ol> <br> <ul> <li> Se já está esgotado, o seu nível atual de exaustão aumenta na quantidade especificada </ li> <li> Suporta o efeito do seu nível atual de exaustão, bem como todos os níveis inferiores < / li> <li> Um efeito que elimina o esgotamento reduz seu nível conforme especificado na descrição do efeito, com todos os efeitos de exaustão terminando se o nível de exaustão de um personagem for reduzido abaixo de 1 </ li> <li> Finalizar um descanso longo reduz o esgotamento de um nível de personagem por 1, desde que o personagem também tenha ingerido alguma comida e bebida </ li> </ ul>",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "STATUS-FRIGHTENED",
                        "Assustado",
                        "O personagem está cheio de medo. <Ul> <li> Tem desvantagem em testes de habilidade e jogadas de ataque enquanto a fonte de seu medo está dentro da linha de visão </ li> <li> Não pode se aproximar da fonte de seu medo </ li> </ ul>",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "STATUS-INCAPACITATED",
                        "Incapacitado",
                        "O personagem não pode realizar ações ou reações.",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "STATUS-INCORPOREAL",
                        "Incorpóreo",
                        "O personagem não tem um corpo físico e pode se mover através de outros personagens e objetos como se fossem terreno difícil.",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "STATUS-INVISIBLE",
                        "Invisivel",
                        "O personagem é visualmente indetectável. <Ul> <li> Um personagem invisível é impossível de ver sem a ajuda de magia ou um sentido especial </ li> <li> Com a finalidade de esconder, o personagem é fortemente obscurecido </ li> <li> A sua localização pode ser detectada por qualquer ruído que faça ou por quaisquer faixas que saia </ li> <li> As jogadas de ataque contra ele têm desvantagem </ li> <li> As jogadas de ataque têm vantagem </ li> </ ul >",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "STATUS-LIFE-DRAIN",
                        "Dreno de Vida",
                        "A essência da vida do personagem é consumida. <Ul> <li> Seu ponto de vida máximo é reduzido em um valor igual ao dano recebido </ li> <li> Esta redução dura até que o personagem termine um longo descanso </ li> <li > O alvo morre se este efeito reduzir seu ponto de vida máximo para 0 </ li> </ ul>",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "STATUS-PARALYZED",
                        "Paralizado",
                        "O personagem está congelado no lugar e incapaz de agir ou falar. <Ul> <li> Um personagem paralisado está incapacitado (veja a condição) e não pode se mexer ou falar </ li> <li> Falha automática em resistência e destreza </ li> <li> Jogadas de ataque contra o personagem têm vantagem </ li> <li> Qualquer ataque que atinja o personagem é um acerto crítico se o atacante estiver a menos de 1,5 metro do personagem </ li> </ ul>",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "STATUS-PETRIFIED",
                        "Petrificado",
                        "O personagem é transformado, junto com qualquer objeto não-mágico que está usando ou carregando, em uma substância inanimada sólida (geralmente pedra). <Ul> <li> Seu peso aumenta em um fator de dez, e cessa o envelhecimento </ li> < li> Está incapacitado (veja a condição), não pode se mover ou falar e não tem consciência do seu entorno </ li> <li> Rolos de Ataque contra o personagem têm vantagem </ li> <li> Rolos de Ataque contra ele têm vantagem < / li> <li> Automaticamente falha Força e Destreza testes de resistência </ li> <li> Tem resistência a todos os danos </ li> <li> É imune a veneno e doença, embora um veneno ou doença já esteja em seu sistema está suspenso, não neutralizado </ li> </ ul>",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "STATUS-POISONED",
                        "Envenenado",
                        "O personagem está se sentindo mal ou tem uma substância tóxica em seu corpo. Ele sofre desvantagem nas jogadas de ataque e nas verificações de habilidade.",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "STATUS-PRONE",
                        "Propenso",
                        "O personagem está deitado no chão. <Ul> <li> Sua única opção de movimento é rastejar, a menos que ele se levante e acabe com a condição </ li> <li> Tem desvantagem nas jogadas de ataque </ li> <li> Jogadas de ataque contra o personagem têm vantagem se o atacante estiver a 1,5 m do personagem. Caso contrário, o teste de ataque tem desvantagem </ li> </ ul>",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "STATUS-RESTRAINED",
                        "Contido",
                        "O personagem tem seu movimento restrito. <Ul> <li> Sua velocidade se torna 0, e ele não pode se beneficiar de nenhum bônus em sua velocidade </ li> <li> As jogadas de ataque contra ele têm vantagem </ li> <li> Suas jogadas de ataque têm desvantagem </ li> <li> Tem desvantagem em testes de resistência de Destreza </ li> </ ul>",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "STATUS-STABLE",
                        "Estável",
                        "O personagem não está mais morrendo, mas ainda esta inconsciente. <Ul> <li> Não faz testes de morte, mesmo que tenha 0 pontos de vida, mas permanece inconsciente </ li> <li> Pára de ficar estável, e deve começar a fazer a morte se arremessar novamente, se sofrer algum dano </ li> <li> Recupera 1 ponto de vida após 1d4 horas se não for curado </ li> </ ul>",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "STATUS-STUNNED",
                        "Atordoado",
                        "O personagem tem dormência mental. <Ul> <li> Está incapacitado (veja a condição), não pode se mover e pode falar apenas vacilantemente </ li> <li> Falha automática nos testes de resistência de Força e Destreza </ li> <li > Jogadas de ataque contra o personagem têm vantagem </ li> </ ul>",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "STATUS-UNCONSCIOUS",
                        "Inconsciente",
                        "O personagem está nocauteado e desamparado. <Ul> <li> Está incapacitado (veja a condição), não pode se mover ou falar, e não tem consciência do que está ao redor </ li> <li> O personagem cai o que quer que esteja segurando e cai propenso </ li> <li> O personagem falha automaticamente Arremessos de resistência de Força e Destreza </ li> <li> Jogadas de ataque contra o personagem têm vantagem </ li> <li> Qualquer ataque que atinja o personagem é um acerto crítico se atacante está a menos de 1,5 m do personagem </ li> </ ul>",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "DESCRIPTION-ROD-OF-WONDER",
                        "Cajado das Maravilhas",
                        "O Cajado das Maravilhas é um dispositivo estranho e imprevisível que gera aleatoriamente qualquer número de efeitos estranhos cada vez que é usado. Role um d100 e aplique seus efeitos: <ul> <li> 01–05: <em> Lento </ em> alvo por 10 rodadas (Wis DC 12 nega). </ Li> <li> 06–10: <em > Fogo das Fadas </ em> envolve o alvo. </ Li> <li> 11-15: Elogia o usuário por 1 rodada para acreditar que a vara funciona como indicado por um segundo teste (sem salvar). </ Li> <li > 16–20: <rajada> Rajada de vento </ em>, mas com força de vendaval (Str DC 14 nega). </ Li> <li> 21–25: Wielder aprende os pensamentos da superfície do alvo (como em <em> detectar pensamentos </ em>) por 1d4 rodadas (sem salvar). </ li> <li> 26–30: <em> Nuvem fedorenta </ \u200B\u200Bem> aparece em 30-ft. intervalo (Con DC 15 nega). </ li> <li> 31-33: Chuva forte cai por 1 rodada em 60-ft. raio centrado no usuário do bastão. </ li> <li> 34–36: <em> Convocar </ em> um animal - um rinoceronte (01-25 em d%), elefante (26–50) ou mouse (51 –100). </ Li> <li> 37–46: <em> Relâmpago </ em> (70 pés de comprimento, 5 pés de largura), 6d6 de dano (Dex DC 15 meio). </ Li> < li> 47–49: Um fluxo de 600 borboletas grandes aparece e flutua por 2 rodadas, cegando todos dentro de 25 pés (Dex DC 14 nega). </ li> <li> 50–53: <em> Ampliar < / em> no alvo se dentro de 60 pés de haste (Con DC 13 nega). </ li> <li> 54–58: <em> Trevas </ em>, hemisfério de 30 pés de diâmetro, centralizado 30 pés longe da haste. </ li> <li> 59–62: A grama cresce em 160 pés quadrados. a área antes da haste, ou a grama lá existente cresce até 10 vezes o tamanho normal. </ li> <li> 63–65: Torne etéreo qualquer objeto não vivo de até 1.000 libras. massa e até 30 pés cúbicos de tamanho. </ li> <li> 66–69: <em> Reduzir </ em> o portador duas categorias de tamanho (sem salvar) por 1 dia. </ li> <li> 70 -79: <em> Bola de fogo </ em> no alvo ou 100 pés à frente, 6d6 de dano (Dex DC 15 meio). </ Li> <li> 80–84: <em> Invisibilidade </ em> cobre haste portador. </ li> <li> 85-87: As folhas crescem do alvo se dentro de 60 pés de vara. Essas últimas 24 horas. </ Li> <li> 88–90: 10–40 gemas, valor 1 gp cada, dispare em um fluxo de 30 pés de comprimento. Cada gema causa 1 ponto de dano a qualquer criatura em seu caminho: role 5d4 para o número de acertos e divida-os entre os alvos disponíveis. </ Li> <li> 91–95: Cores cintilantes dançam e tocam em um raio de 40 pés -por-30-ft. área na frente da haste. As criaturas ali ficam cegas por 1d6 rodadas (Con DC 15 nega). </ Li> <li> 96–97: Wielder (50% de chance) ou alvo (50% de chance) fica permanentemente azul, verde ou roxo (sem salvamento) . </ li> <li> 98–100: <em> Carne para pedra </ em> (ou <em> pedra para carne </ em> se o alvo já estiver em pedra) se o alvo estiver dentro de 60 pés (Con DC 18 negates). </ Li> </ ul>",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "DESCRIPTION-ITEM-DRAWBACKS",
                        "Desvantagens de item",
                        "Itens com desvantagens geralmente ainda são benéficos para o possuidor, mas carregam algum aspecto negativo. Embora às vezes as desvantagens ocorram somente quando o item é usado (ou mantido, no caso de algumas armas), geralmente a desvantagem permanece com o personagem enquanto ele tiver o item. Salvo indicação em contrário, os inconvenientes permanecem em vigor enquanto o item estiver em posse. Role um d100: <ul> <li> 01-04: O cabelo do personagem cresce 1 polegada a mais a cada hora. </ Li> <li> 05–09: O caractere encolhe 6 polegadas (01–50 em d%) ou cresce esse muito mais alto (51–100). Acontece apenas uma vez. </ Li> <li> 10–13: A temperatura ao redor do item é 10 ° F mais fria que a normal. </ Li> <li> 14–17: A temperatura ao redor do item é 10 ° F mais quente que o normal. li> <li> 18–21: A cor do cabelo do personagem muda. </ li> <li> 22–25: A cor da pele do personagem muda. </ li> <li> 26–29: O personagem agora tem alguma marca de identificação (tatuagem, brilho estranho, ou algo parecido). </ li> <li> 30–32: Alterações de gênero do personagem. </ li> <li> 33–34: A raça ou o tipo de personagem muda. </ li> <li> 35 O caractere é afligido com uma doença aleatória que não pode ser curada. </ li> <li> 36-39: item emite continuamente um som perturbador (gemidos, choro, gritos, xingamentos, insultos). </ li> <li> 40 item parece ridículo (cor estranhamente boba, cor-de-rosa brilhante). </ li> <li> 41–45: O caráter torna-se egoisticamente possessivo. </ li> <li> 46–49: Personagem fica paranoico por perder o item e tem medo de dano </ li> <li> 50–51: Alterações de alinhamento do personagem. </ li> <li> 52–54: O personagem deve atacar a criatura mais próxima (5% de chance [01 05 em d%] a cada dia). </ Li> <li> 55–57: O personagem fica atordoado por 1d4 rodadas quando a função do item é finalizada (ou aleatoriamente, 1 / dia). </ Li> <li> 58–60 : A visão do personagem é desfocada (desvantagem nas jogadas de ataque, testes e verificações de habilidade que exigem visão). </ Li> <li> 61–64: O personagem ganha um nível negativo. </ Li> <li> 65 O personagem ganha dois níveis negativos . </ li> <li> 66–70: O personagem deve fazer um Wis salvar a cada dia ou receber 1 ponto de dano de Inteligência. </ li> <li> 71–75: O personagem deve fazer um Wis salvar a cada dia ou levar 1 ponto de dano de Sabedoria. </ li> <li> 76–80: O personagem deve fazer um Wis salvar a cada dia ou receber 1 ponto de dano de Carisma. </ li> <li> 81–85: O personagem deve fazer um Con salvar cada dia ou recebe 1 ponto de dano na Constituição. </ li> <li> 86–90: O personagem deve fazer um teste de defesa a cada dia ou receber 1 ponto de dano de Força. </ li> <li> 91–95: O personagem deve fazer um Con salva a cada dia ou recebe 1 ponto de dano por Destreza. </ li> <li> 96: O personagem é <em> polimorado </ em> em uma criatura específica (5% de chance [ 01–05 em d%] a cada dia). </ Li> <li> 97: O personagem não pode lançar magias arcanas. </ Li> <li> 98: O personagem não pode conjurar magias divinas. </ Li> <li> 99: O personagem não pode conjurar mágicas. </ Li> <li> 100: Escolha uma das opções acima que seja apropriado ou crie uma desvantagem específica para esse item. </ Li> </ ul>",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
        };
    }
}
