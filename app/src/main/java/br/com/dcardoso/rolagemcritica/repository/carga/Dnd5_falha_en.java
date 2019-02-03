package br.com.dcardoso.rolagemcritica.repository.carga;

import br.com.dcardoso.rolagemcritica.entity.CardCritico;
import br.com.dcardoso.rolagemcritica.utils.enums.IdiomaEnum;
import br.com.dcardoso.rolagemcritica.utils.enums.TipoAtaqueEnum;
import br.com.dcardoso.rolagemcritica.utils.enums.TipoCriticoEnum;
import br.com.dcardoso.rolagemcritica.utils.enums.TipoSistemaEnum;

public class Dnd5_falha_en {

    public static CardCritico[] populateData() {
        return new CardCritico[]{

                //region Card Falha Critica Corpo a Corpo
                new CardCritico(
                        "Butterfingers",
                        "Drop your weapon."
                        ,TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Catch your breath",
                        "You can only take a move next round."
                        ,TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Stuck",
                        "Your weapon is stuck in a nearby surface. DC 15 Str check to free it."
                        ,TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Backswing",
                        "The attack deals damage to you instead of the target."
                        ,TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Slipped",
                        "You are knocked %STATUS-PRONE=prone%."
                        ,TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "This sword is too heavy",
                        "You are %STATUS-EXHAUSTED=exhausted by 1 stage%."
                        ,TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Awkward attack",
                        "You take -2 penalty to AC for 1d4 rounds."
                        ,TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Overextend",
                        "You provoke an opportunity attack from all adjacent opponents."
                        ,TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Pulled muscle",
                        "You have %DISADVANTAGE=disadvantage% on melee attacks, %ABILITY-STR=Strength% checks and are %STATUS-EXHAUSTED=exhausted by 1 stage%."
                        ,TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Fling",
                        "You drop your weapon and it lands 1d6 \u00D7 5 feet away in a random direction."
                        ,TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Broken blade",
                        "Your weapon is destroyed (%SAVE-FUMBLE=Dex saving throw negates%). %OBJECT-DAMAGE=Magic weapons take only 2d6 damage%."
                        ,TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Notched",
                        "Your weapon takes 1d6 %OBJECT-DAMAGE=points of damage%."
                        ,TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Parry! Dodge! Spin! Thrust!",
                        "You are %STATUS-INCAPACITATED=incapacitated% for 1 round."
                        ,TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Hand it over",
                        "Your target gains possession of your weapon (%SAVE-FUMBLE=Dex saving throw negates%)."
                        ,TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Shield crash",
                        "Your attack deals %OBJECT-DAMAGE=damage to your shield%."
                        ,TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Winded",
                        "You are %STATUS-EXHAUSTED=exhausted by 2 stages% (%SAVE-FUMBLE=Str saving throw negates%)."
                        ,TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Wide open",
                        "You are %STATUS-RESTRAINED=restrained% for 1 round."
                        ,TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Critical mistake",
                        "The attack hits you and is a critical hit."
                        ,TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Strain",
                        "You take 1d4 points of %ABILITY-DEX=Dex% %ABILITY-REDUCTION=ability reduction%."
                        ,TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Too much stuff",
                        "You become %STATUS-RESTRAINED=restrained% in your gear until you spend an action to free yourself."
                        ,TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Spinning swing",
                        "You are %STATUS-POISONED=poisoned% for 1d4 rounds."
                        ,TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "I told you it was sharp",
                        "You are %STATUS-EXHAUSTED=exhausted by 1 stage%."
                        ,TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Pin prick",
                        "You are %STATUS-EXHAUSTED=exhausted by 1 stage%."
                        ,TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Off balance",
                        "You have %DISADVANTAGE=disadvantage% on all attack rolls for 1 round."
                        ,TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Sorry",
                        "Your attack hits an ally adjacent to you or the target."
                        ,TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Bonk",
                        "You are %STATUS-STUNNED=stunned% for 1 round (%SAVE-FUMBLE=Con saving throw negates%)."
                        ,TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Catastrophic failure",
                        "You fall %STATUS-UNCONSCIOUS=unconscious% for 1d3 rounds (%SAVE-FUMBLE=Con saving throw negates%)."
                        ,TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Pointy end goes there",
                        "You take 1 point of %ABILITY-CON=Con% %ABILITY-REDUCTION=ability reduction%."
                        ,TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Broken haft",
                        "Your weapon loses reach. You have %DISADVANTAGE=disadvantage% on attack rolls with it until repaired (Requires Craft for 20% of the item value)."
                        ,TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Fog of war",
                        "You don't threat adjacent enemies for 1d6 rounds."
                        ,TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Go for the eyes",
                        "You are %STATUS-BLINDED=blinded% for 1 round."
                        ,TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Punt",
                        "Your weapon flies 2d6 \u00D7 5 feet in a random direction."
                        ,TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Bad grip",
                        "You have %DISADVANTAGE=disadvantage% on attacks for the next 3 rounds."
                        ,TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Who was that",
                        "You are %STATUS-INCAPACITATED=incapacitated% for 1d3 rounds."
                        ,TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "You meant to do that",
                        "Move 10 feet in a random direction provoking opportunity attacks as normal."
                        ,TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Eat dirt",
                        "You fall %STATUS-PRONE=prone% and are %STATUS-BLINDED=blinded% for 1d3 rounds (%SAVE-FUMBLE=Dex saving throw negates%)."
                        ,TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Second thoughts",
                        "You are %STATUS-POISONED=poisoned% for 1d6 rounds."
                        ,TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Attack the darkness",
                        "All your enemies have concealment from you for 1d4 rounds."
                        ,TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Wait! What?",
                        "You are %STATUS-CONFUSED=confused% for 1 round."
                        ,TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Wrong end",
                        "If you're using a slashing weapon, you take 1d6 points of damage and you are %STATUS-EXHAUSTED=exhausted by 1 stage%."
                        ,TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Vibration",
                        "If you're using a bludgeoning weapon, you have %DISADVANTAGE=disadvantage% on attacks and %ABILITY-STR=Str% checks and drop your weapon."
                        ,TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "No way",
                        "Your attack hits the target, but deals minimum damage."
                        ,TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Funny bone",
                        "You drop whatever is in your off hand."
                        ,TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Bent",
                        "You have %DISADVANTAGE=disadvantage% on all attacks with this weapon until it is repaired (Requires Craft for 20% of the item value)."
                        ,TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(), IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "All or nothing",
                        "You take a -1 penalty on attack rolls until you score a critical hit."
                        ,TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Surrounded by foes",
                        "Your attack hits an ally within reach and is a critical hit."
                        ,TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "On the receiving end",
                        "The attack deals damage to you instead of the target."
                        ,TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Bohemian earspoon",
                        "You are %STATUS-DEAFENED=deafened% %UNTIL-HEALED=until healed% (DC 15 Medicine Check)."
                        ,TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Better to give",
                        "You attack damages you instead. Use your target's Str modifier."
                        ,TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Cutter",
                        "You have %DISADVANTAGE=disadvantage% on attacks, %ABILITY-STR=Strength% checks and are %STATUS-EXHAUSTED=exhausted by 1 stage%."
                        ,TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "This is bad",
                        "You are %STATUS-EXHAUSTED=exhausted by 2 stages%."
                        ,TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Armor smash",
                        "Your attack deals %OBJECT-DAMAGE=damage to your armor%."
                        ,TipoAtaqueEnum.CorpoACorpo.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                //endregion

                //region Card Falha Critica Distancia
                new CardCritico(
                        "Mix it up",
                        "You are unable to make ranged attacks for the next 1d6 rounds."
                        ,TipoAtaqueEnum.Distancia.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Aim carefully next time",
                        "For 3 rounds, you must spend a full turn to make a single attack."
                        ,TipoAtaqueEnum.Distancia.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Don't hit me!",
                        "For 3 rounds, you take an additional -2 penalty on ranged attacks for each ally in melee combat with your target."
                        ,TipoAtaqueEnum.Distancia.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Phantom wind",
                        "You compensate for a breeze which isn't there. You take -2 penalty on ranged attack rolls for 3 rounds."
                        ,TipoAtaqueEnum.Distancia.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Recoil",
                        "You move backward 5 feet and fall %STATUS-PRONE=prone%."
                        ,TipoAtaqueEnum.Distancia.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Amazing miss",
                        "You are %STATUS-STUNNED=stunned% for 1 round (%SAVE-FUMBLE=Str saving throw negates%)."
                        ,TipoAtaqueEnum.Distancia.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Not my pony",
                        "Your attack hits the nearest allied animal or mount."
                        ,TipoAtaqueEnum.Distancia.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Double miss",
                        "You use twice as much ammunition on this attack."
                        ,TipoAtaqueEnum.Distancia.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Close to the ear",
                        "You are %STATUS-DEAFENED=deafened% %UNTIL-HEALED=until healed% (DC 15 Medicine Check)."
                        ,TipoAtaqueEnum.Distancia.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Insecure",
                        "You take a -1 penalty on attack rolls for 1d4 rounds or until you score a critical hit."
                        ,TipoAtaqueEnum.Distancia.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "In the line of fire",
                        "Your attack hits the nearest ally and is a critical hit."
                        ,TipoAtaqueEnum.Distancia.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Lowered guard",
                        "You provoke opportunity attacks from all threatening foes."
                        ,TipoAtaqueEnum.Distancia.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Weapon jam",
                        "If using a projectile weapon, it does not function. Spend 1 action to clear."
                        ,TipoAtaqueEnum.Distancia.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Um, oops",
                        "The attack deals damage to you instead of the target."
                        ,TipoAtaqueEnum.Distancia.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "What are the odds?",
                        "If you made a thrown attack, you hit the target, but the weapon ends up in the target's possession."
                        ,TipoAtaqueEnum.Distancia.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Lost grip",
                        "You can only take a move next round."
                        ,TipoAtaqueEnum.Distancia.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Pinch in parts",
                        "You take 1d6 points of damage."
                        ,TipoAtaqueEnum.Distancia.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "So much blood",
                        "You are %STATUS-POISONED=poisoned% for 1d6 rounds."
                        ,TipoAtaqueEnum.Distancia.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Huh?",
                        "You are %STATUS-CONFUSED=confused% for 1 round."
                        ,TipoAtaqueEnum.Distancia.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Seeing double",
                        "All your attacks have a 50% miss chance for 1 round."
                        ,TipoAtaqueEnum.Distancia.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Misjudged the distance",
                        "All attack rolls beyond the first ranged increment have triple the normal distance penalty for 3 rounds."
                        ,TipoAtaqueEnum.Distancia.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Overcompensate",
                        "Attacks against targets with half-cover or better have %DISADVANTAGE=disadvantage% for 3 rounds."
                        ,TipoAtaqueEnum.Distancia.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Friendly fire",
                        "Your attack hits your ally closest to the target."
                        ,TipoAtaqueEnum.Distancia.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Lost the target",
                        "You have %DISADVANTAGE=disadvantage% on all attack rolls for 1 round."
                        ,TipoAtaqueEnum.Distancia.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Shot your foot",
                        "You take 1d2 points of %ABILITY-DEX=Dex% %ABILITY-REDUCTION=ability reduction% and your speed is reduced by half %UNTIL-HEALED=until healed%."
                        ,TipoAtaqueEnum.Distancia.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Overthrow",
                        "If attack was made with a thrown weapon, the weapon travels 5 times its range increment in a random direction."
                        ,TipoAtaqueEnum.Distancia.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Tunnel vision",
                        "For the next 3 rounds, you have a +1 bonus on attack rolls, but you %STATUS-RESTRAINED=restrained%."
                        ,TipoAtaqueEnum.Distancia.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "All thumbs",
                        "You have %DISADVANTAGE=disadvantage% on all attack rolls for 3 round."
                        ,TipoAtaqueEnum.Distancia.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Bull's eye",
                        "Your shot ricochets and hits you near the eye. You are %STATUS-BLINDED=blinded% for 1 round."
                        ,TipoAtaqueEnum.Distancia.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Bad alignment",
                        "You have %DISADVANTAGE=disadvantage% on all attacks with this weapon until repaired (Requires Craft for 20% of the item value)."
                        ,TipoAtaqueEnum.Distancia.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Cracked",
                        "Your weapon (not ammunition) takes 1d6 %OBJECT-DAMAGE=points of damage%."
                        ,TipoAtaqueEnum.Distancia.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Whoops!",
                        "You are knocked %STATUS-PRONE=prone%."
                        ,TipoAtaqueEnum.Distancia.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Tied up",
                        "You become %STATUS-RESTRAINED=restrained% in your gear until you spend an action to free yourself."
                        ,TipoAtaqueEnum.Distancia.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Sprain",
                        "You take 1d4 points of %ABILITY-DEX=Dex% %ABILITY-REDUCTION=ability reduction%."
                        ,TipoAtaqueEnum.Distancia.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Nicked",
                        "You are %STATUS-EXHAUSTED=exhausted by 1 stage%."
                        ,TipoAtaqueEnum.Distancia.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Klutz",
                        "You drop your weapon."
                        ,TipoAtaqueEnum.Distancia.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Spilled ammo",
                        "Your ammunition falls from its container and takes 1d6 rounds to gather up."
                        ,TipoAtaqueEnum.Distancia.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Head rush",
                        "You are %STATUS-POISONED=poisoned% for 1d4 rounds."
                        ,TipoAtaqueEnum.Distancia.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "My spleeny bits!",
                        "You have %DISADVANTAGE=disadvantage% on %ABILITY-CON=Constitution% checks and are %STATUS-EXHAUSTED=exhausted by 1 stage%."
                        ,TipoAtaqueEnum.Distancia.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Notched fingers",
                        "You are %STATUS-EXHAUSTED=exhausted by 1 stage%."
                        ,TipoAtaqueEnum.Distancia.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Torn tendon",
                        "You have %DISADVANTAGE=disadvantage% on ranged attacks, %ABILITY-DEX=Dexterity% checks and are %STATUS-EXHAUSTED=exhausted by 1 stage%."
                        ,TipoAtaqueEnum.Distancia.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Broken",
                        "Your weapon is destroyed (%SAVE-FUMBLE=Dex saving throw negates%). %OBJECT-DAMAGE=Magic weapons take only 2d6 damage%."
                        ,TipoAtaqueEnum.Distancia.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Everything you got",
                        "You are %STATUS-EXHAUSTED=exhausted by 2 stages% (%SAVE-FUMBLE=Con saving throw negates%)."
                        ,TipoAtaqueEnum.Distancia.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Snapped string",
                        "If attack was made with a bow or crossbow, the string breaks and requires 1d3 round to fix."
                        ,TipoAtaqueEnum.Distancia.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Wrong weapon",
                        "If you made a thrown attack, you throw a random object from your gear."
                        ,TipoAtaqueEnum.Distancia.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Archer's elbow",
                        "You take a -2 penalty on all ranged attack rolls for 1d4 minutes."
                        ,TipoAtaqueEnum.Distancia.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Wide open",
                        "You are %STATUS-RESTRAINED=restrained% for 1 round."
                        ,TipoAtaqueEnum.Distancia.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Backfire",
                        "The attack deals damage to you instead of the target."
                        ,TipoAtaqueEnum.Distancia.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Errant aim",
                        "Reroll attack against creature nearest the target (yourself excluded)."
                        ,TipoAtaqueEnum.Distancia.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "You'll shoot your eye out",
                        "The attack hits you and is a critical hit."
                        ,TipoAtaqueEnum.Distancia.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Arching back",
                        "You are %STATUS-EXHAUSTED=exhausted by 1 stage%."
                        ,TipoAtaqueEnum.Distancia.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Awkward attack",
                        "You take -2 penalty to AC for 1d4 rounds."
                        ,TipoAtaqueEnum.Distancia.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                //endregion

                //region Card Falha Critica Natural
                new CardCritico(
                        "Tripped",
                        "You are knocked %STATUS-PRONE=prone%."
                        ,TipoAtaqueEnum.Natural.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Bruised ego",
                        "You can attack no other target for 1d4 rounds (or until the target is dead)."
                        ,TipoAtaqueEnum.Natural.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Awkward attack",
                        "You take a -2 penalty to AC for 1d4 rounds."
                        ,TipoAtaqueEnum.Natural.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Tiring attack",
                        "You are %STATUS-EXHAUSTED=exhausted by 1 stage%."
                        ,TipoAtaqueEnum.Natural.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Upset tummy",
                        "You are %STATUS-POISONED=poisoned% for 1d4 rounds."
                        ,TipoAtaqueEnum.Natural.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "I bit my tug",
                        "You are %STATUS-EXHAUSTED=exhausted by 1 stage%."
                        ,TipoAtaqueEnum.Natural.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Muscle tear",
                        "You take 1d4 points of %ABILITY-STR=Str% %ABILITY-REDUCTION=ability reduction%."
                        ,TipoAtaqueEnum.Natural.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Stinging failure",
                        "You take 1d4 points of slashing damage and a -2 penalty on attack rolls with that attack for 1d4 rounds."
                        ,TipoAtaqueEnum.Natural.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Smash the floor",
                        "You kick up dust that %STATUS-BLINDED=blinds% you for 1d4 rounds (%SAVE-FUMBLE=Dex saving throw negates%)."
                        ,TipoAtaqueEnum.Natural.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "He's sharp",
                        "You take 1d6 points of damage + your Str modifier."
                        ,TipoAtaqueEnum.Natural.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Torn muscle",
                        "You take 1 point of %ABILITY-STR=Str% %ABILITY-REDUCTION=ability reduction% that only be healed with <em>Greater Restoration</em> (%SAVE-FUMBLE=Con saving throw negates%)."
                        ,TipoAtaqueEnum.Natural.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Got too close",
                        "Your attack hits the target but the target may start a grapple against you for free."
                        ,TipoAtaqueEnum.Natural.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Off balance",
                        "You can only take a move next round."
                        ,TipoAtaqueEnum.Natural.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "He bit your fist",
                        "The target deals bite damage to you."
                        ,TipoAtaqueEnum.Natural.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Fist meets face",
                        "The attack hits you and is a critical hit."
                        ,TipoAtaqueEnum.Natural.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Out of position",
                        "You cannot use this attack for 1 round."
                        ,TipoAtaqueEnum.Natural.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Wide open",
                        "You are %STATUS-RESTRAINED=restrained% for 1 round."
                        ,TipoAtaqueEnum.Natural.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Bleeding fist",
                        "You are %STATUS-EXHAUSTED=exhausted by 1 stage%."
                        ,TipoAtaqueEnum.Natural.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Twisted",
                        "You become %STATUS-RESTRAINED=restrained% in your gear until you spend an action to free yourself."
                        ,TipoAtaqueEnum.Natural.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Stop hitting yourself",
                        "The attack deals damage to you instead of the target."
                        ,TipoAtaqueEnum.Natural.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Just a taste",
                        "Your attack hits an ally adjacent to you or the target."
                        ,TipoAtaqueEnum.Natural.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Overextend",
                        "You provoke an opportunity attack from all adjacent opponents."
                        ,TipoAtaqueEnum.Natural.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Frustration",
                        "You have %DISADVANTAGE=disadvantage% on all attack rolls for 1 round."
                        ,TipoAtaqueEnum.Natural.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Broken tooth",
                        "You take a -2 penalty on attack rolls for 1d6 minutes."
                        ,TipoAtaqueEnum.Natural.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Not the weak point",
                        "Your enemy's armor takes 1d6 %OBJECT-DAMAGE=points of damage%. You take 1d6 points of damage and cannot use that attack for 1d3 rounds."
                        ,TipoAtaqueEnum.Natural.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "That tastes awful!",
                        "If this was a bite attack, you are %STATUS-POISONED=poisoned% for 1d6 rounds."
                        ,TipoAtaqueEnum.Natural.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Broke a nail",
                        "You take 1d4 points of damage and you cannot use this attack %UNTIL-HEALED=until healed%."
                        ,TipoAtaqueEnum.Natural.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Sprain",
                        "You have %DISADVANTAGE=disadvantage% on ranged attacks, %ABILITY-DEX=Dexterity% checks and are %STATUS-EXHAUSTED=exhausted by 1 stage%."
                        ,TipoAtaqueEnum.Natural.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Overexertion",
                        "You are %STATUS-EXHAUSTED=exhausted by 2 stages% (%SAVE-FUMBLE=Str saving throw negates%)."
                        ,TipoAtaqueEnum.Natural.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Don't pick at it",
                        "You take 1 point of %ABILITY-CON=Con% %ABILITY-REDUCTION=ability reduction%."
                        ,TipoAtaqueEnum.Natural.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "We have a wiener",
                        "You fall %STATUS-UNCONSCIOUS=unconscious% for 1d6 round (%SAVE-FUMBLE=Str saving throw negates%)."
                        ,TipoAtaqueEnum.Natural.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Whiff",
                        "The attack deals damage to you instead of the target."
                        ,TipoAtaqueEnum.Natural.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Jam a finger",
                        "Your target takes normal damage, you take double damage."
                        ,TipoAtaqueEnum.Natural.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Caught your attack",
                        "The target may attempt to shove (push or knock you prone) or grapple you."
                        ,TipoAtaqueEnum.Natural.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Pins & needles",
                        "You are %STATUS-POISONED=poisoned% for 1d6 rounds."
                        ,TipoAtaqueEnum.Natural.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Great roar",
                        "You are %STATUS-DEAFENED=deafened% %UNTIL-HEALED=until healed% (DC 15 Medicine Check)."
                        ,TipoAtaqueEnum.Natural.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Head, meet wall",
                        "You are %STATUS-INCAPACITATED=incapacitated% for 1d3 rounds."
                        ,TipoAtaqueEnum.Natural.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Ferocious fumble",
                        "Your attack hits an ally within reach and is a critical hit."
                        ,TipoAtaqueEnum.Natural.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Sneeze!",
                        "You are %STATUS-INCAPACITATED=incapacitated% for 1 round."
                        ,TipoAtaqueEnum.Natural.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Ingrown nail",
                        "You take a -1 penalty on attack rolls until you score a critical hit."
                        ,TipoAtaqueEnum.Natural.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Whirlwind of shame",
                        "Your attack deals damage to all targets adjacent to you except the original target."
                        ,TipoAtaqueEnum.Natural.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Battered",
                        "You take a -2 penalty on ability checks and saves for 1d4 hours."
                        ,TipoAtaqueEnum.Natural.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Winds of change",
                        "You don't threaten adjacent enemies for 1d6 rounds."
                        ,TipoAtaqueEnum.Natural.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Unintentional move",
                        "Move 10 feet in a random direction provoking opportunity attacks as normal."
                        ,TipoAtaqueEnum.Natural.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Eye strain",
                        "You are %STATUS-BLINDED=blinded% for 1 round."
                        ,TipoAtaqueEnum.Natural.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Hangnail",
                        "If this was a claw attack, slam or unarmed strike, you cannot use that attack for 1d6 rounds."
                        ,TipoAtaqueEnum.Natural.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Brutal collision",
                        "Your attack hits, but you are %STATUS-STUNNED=stunned% for 2 rounds (%SAVE-FUMBLE=Str saving throw save% reduces the stun to 1 round)."
                        ,TipoAtaqueEnum.Natural.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Pinched nerve",
                        "If you had reach greater than 5 feet, it is reduced to 5 feet for 3 rounds."
                        ,TipoAtaqueEnum.Natural.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Overthink it",
                        "Your target's armor and natural armor bonuses are doubled against you for 3 rounds."
                        ,TipoAtaqueEnum.Natural.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Punctured foot",
                        "You take 1d3 points of damage and your speed is halved %UNTIL-HEALED=until healed%."
                        ,TipoAtaqueEnum.Natural.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Bone bruise",
                        "You take 1d2 point of %ABILITY-CON=Con% %ABILITY-REDUCTION=ability reduction%."
                        ,TipoAtaqueEnum.Natural.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Bad headbutt",
                        "You are %STATUS-STUNNED=stunned% for 1 round (%SAVE-FUMBLE=Con saving throw negates%)."
                        ,TipoAtaqueEnum.Magico.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                //endregion

                //region Card Falha Critica Magico
                new CardCritico(
                        "Wild magic",
                        "Roll twice on the %DESCRIPTION-ROD-OF-WONDER=Rod of Wonder% table."
                        ,TipoAtaqueEnum.Magico.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Magic fatigue",
                        "You cannot cast any spells for 1 round."
                        ,TipoAtaqueEnum.Magico.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "You made him stronger",
                        "The target gains %ADVANTAGE=advantage% on %ABILITY-STR=Str% checks and melee attacks for 1d4 rounds."
                        ,TipoAtaqueEnum.Magico.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Clatto verata necktie",
                        "Your attack hits the nearest ally and is a critical hit."
                        ,TipoAtaqueEnum.Magico.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Hit by the ugly forest",
                        "You take 1d3 point of %ABILITY-CHA=Cha% %ABILITY-REDUCTION=ability reduction%."
                        ,TipoAtaqueEnum.Magico.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "The magic is gone",
                        "You have %DISADVANTAGE=disadvantage% on attack rolls until you score a critical hit."
                        ,TipoAtaqueEnum.Magico.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Can you hear me now?",
                        "You are %STATUS-DEAFENED=deafened% %UNTIL-HEALED=until healed% (DC 15 Medicine check)."
                        ,TipoAtaqueEnum.Magico.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Error!",
                        "The attack deals damage to you instead of the target."
                        ,TipoAtaqueEnum.Magico.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Why me?",
                        "You provoke an opportunity attack from all threatening foes."
                        ,TipoAtaqueEnum.Magico.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Left reeling",
                        "You are %STATUS-STUNNED=stunned% for 1 round (%SAVE-FUMBLE=Str saving throw negates%)."
                        ,TipoAtaqueEnum.Magico.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Nothing to fear",
                        "You are %STATUS-FRIGHTENED=frightened% for 2d4 rounds."
                        ,TipoAtaqueEnum.Magico.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Bleeding eyes",
                        "You are %STATUS-BLINDED=blinded% for 1d4 rounds and %STATUS-EXHAUSTED=exhausted by 1 stage%."
                        ,TipoAtaqueEnum.Magico.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Acidic backlash",
                        "You take 2d6 points of acid damage."
                        ,TipoAtaqueEnum.Magico.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Backblast",
                        "The attack hits you and is a critical hit."
                        ,TipoAtaqueEnum.Magico.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Arcane fire",
                        "You take 2d6 points of fire damage."
                        ,TipoAtaqueEnum.Magico.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Electrical feedback",
                        "You take 2d6 points of electricity damage."
                        ,TipoAtaqueEnum.Magico.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Cursed",
                        "You have %DISADVANTAGE=disadvantage% attack rolls, saves and ability checks. This effect can only be cured with <em>Remove curse</em>."
                        ,TipoAtaqueEnum.Magico.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "You made him faster",
                        "The target is <em>Hasted</em> for 1d4 rounds."
                        ,TipoAtaqueEnum.Magico.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "You made him tougher",
                        "The target gains damage resistance against bludgeoning, piercing and slashing attacks for 1d4 rounds."
                        ,TipoAtaqueEnum.Magico.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Vertigo",
                        "You are %STATUS-POISONED=poisoned% for 1d4 rounds."
                        ,TipoAtaqueEnum.Magico.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Apprentice move",
                        "Reroll attack against creature nearest the target (yourself excluded)."
                        ,TipoAtaqueEnum.Magico.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Not me, you fool!",
                        "Your attack hits your ally closest to the target."
                        ,TipoAtaqueEnum.Magico.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Tiring spell",
                        "You are %STATUS-EXHAUSTED=exhausted by 1 stage%."
                        ,TipoAtaqueEnum.Magico.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Tangled",
                        "You become %STATUS-RESTRAINED=restrained% with your gear until you spend an action to free yourself."
                        ,TipoAtaqueEnum.Magico.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Nose bleed",
                        "You are %STATUS-EXHAUSTED=exhausted by 1 stage%."
                        ,TipoAtaqueEnum.Magico.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Weakened",
                        "You take a -2 penalty to all your Spell DCs for 1d4 minutes."
                        ,TipoAtaqueEnum.Magico.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Poor trade",
                        "The attack hits your intended target but you must lose a spell or slot of the highest available level (your choice)."
                        ,TipoAtaqueEnum.Magico.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Distance rift",
                        "You are teleported the nearest position adjacent to the target."
                        ,TipoAtaqueEnum.Magico.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Mind drain",
                        "You take 1d4 points of %ABILITY-REDUCTION=ability reduction% to %ABILITY-INT=Int%, %ABILITY-WIS=Wis%, or %ABILITY-CHA=Cha% (determined randomly)."
                        ,TipoAtaqueEnum.Magico.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Cold snap",
                        "You take 2d6 points of cold damage."
                        ,TipoAtaqueEnum.Magico.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Caster's block",
                        "You cannot cast this spell for 24 hour."
                        ,TipoAtaqueEnum.Magico.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "You made him bigger",
                        "Target increases one size category for 1d4 rounds."
                        ,TipoAtaqueEnum.Magico.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Weak-minded fool",
                        "You have %DISADVANTAGE=disadvantage% on %ABILITY-WIS=Wisdom% checks and are %STATUS-EXHAUSTED=exhausted by 1 stage%."
                        ,TipoAtaqueEnum.Magico.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Power down",
                        "You have %DISADVANTAGE=disadvantage% on %ABILITY-INT=Intelligence% checks and are %STATUS-EXHAUSTED=exhausted by 1 stage%."
                        ,TipoAtaqueEnum.Magico.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Mental slip",
                        "On his next turn, your target may give you one <em>Suggestion</em>."
                        ,TipoAtaqueEnum.Magico.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Power transfer",
                        "The highest level spell effect on you is transferred to your target."
                        ,TipoAtaqueEnum.Magico.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Magical vacuum",
                        "1d3 spell effects active on you are dispelled (determined randomly)."
                        ,TipoAtaqueEnum.Magico.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Blastoff",
                        "You are thrown 1d6 \u00D7 10 feet into the air (or in a random direction if flying) (%SAVE-FUMBLE=Int saving throw negates%)."
                        ,TipoAtaqueEnum.Magico.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "It's sparkly",
                        "You are %STATUS-BLINDED=blinded% for 1 round."
                        ,TipoAtaqueEnum.Magico.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Now I see you!",
                        "Your target becomes %STATUS-INVISIBLE=invisible% for 1d4 rounds."
                        ,TipoAtaqueEnum.Magico.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Unexpected blast",
                        "The spell affects all targets within 30 feet of you. You are immune to this effect."
                        ,TipoAtaqueEnum.Magico.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Jumbled components",
                        "You can only take a move next round."
                        ,TipoAtaqueEnum.Magico.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Spell shield",
                        "The target gains %ADVANTAGE=advantage% on saving throws against your spells for 1d6 rounds."
                        ,TipoAtaqueEnum.Magico.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Side effect",
                        "One of your magic items permanently gains a %DESCRIPTION-ITEM-DRAWBACKS=random drawback%."
                        ,TipoAtaqueEnum.Magico.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "This is hard",
                        "You have %DISADVANTAGE=disadvantage% on %ABILITY-CON=Constitution% checks and are %STATUS-EXHAUSTED=exhausted by 1 stage%."
                        ,TipoAtaqueEnum.Magico.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Magical smackdown",
                        "You automatically fail your next saving throw."
                        ,TipoAtaqueEnum.Magico.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Reflection",
                        "The spell hits you instead of the target (normal saves apply)."
                        ,TipoAtaqueEnum.Magico.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Monster rift",
                        "Your spell is converted to a <em>Summon monster</em> spell of the same level. The monster attacks you."
                        ,TipoAtaqueEnum.Magico.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Fragmented magic",
                        "1d4+2 <em>Mirror images</em> spring up around your target. These images last for 1 minute or until destroyed."
                        ,TipoAtaqueEnum.Magico.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "How did that happen?",
                        "A <em>Stinking cloud</em> appears, centered on you."
                        ,TipoAtaqueEnum.Magico.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Energy transfer",
                        "Lose one randomly determined spell or spell slot. Your target can cast this spell next round."
                        ,TipoAtaqueEnum.Magico.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Power drain",
                        "You lose one prepared spell or spell slot (determined randomly)."
                        ,TipoAtaqueEnum.Magico.getValor(), TipoCriticoEnum.Falha.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor())
                //endregion
        };
    }
}
