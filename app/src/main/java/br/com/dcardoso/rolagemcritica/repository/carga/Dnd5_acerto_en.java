package br.com.dcardoso.rolagemcritica.repository.carga;

import br.com.dcardoso.rolagemcritica.entity.CardCritico;
import br.com.dcardoso.rolagemcritica.utils.enums.IdiomaEnum;
import br.com.dcardoso.rolagemcritica.utils.enums.TipoAtaqueEnum;
import br.com.dcardoso.rolagemcritica.utils.enums.TipoCriticoEnum;
import br.com.dcardoso.rolagemcritica.utils.enums.TipoSistemaEnum;

public class Dnd5_acerto_en {

    public static CardCritico[] populateData() {
        return new CardCritico[]{
                //region Card Ataque Critico Cortante

                new CardCritico("Carve your initials",
                "Normal damage and target suffers from humiliation and may only attack you (%SAVE-CRITICAL=Will negates%).",
                TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),new CardCritico("Missing digits",
                "Normal damage and target loses 1d3 fingers and takes 1 %ABILITY-CON=Con% and %ABILITY-STR=Str% %ABILITY-DRAIN=drain% (%SAVE-CRITICAL=Fort negates%).",
                TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),new CardCritico("Hack and slash",
                "Double damage and all critical threats against target automatically confirm for the next 3 rounds.",
                TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),new CardCritico("Stand aside",
                "Double damage and push target 1 square in any direction.",
                TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),new CardCritico("Severed tendon",
                "Normal damage and 1d6 %ABILITY-DEX=Dex% %ABILITY-DAMAGE=damage%.",
                TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),new CardCritico("Decapitation",
                "Double damage and death (%SAVE-CRITICAL=Fort negates%).",
                TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),new CardCritico("Bewildering display",
                "Double damage and target takes a -2 penalty to AC for 1d4 rounds.",
                TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),new CardCritico("Long gash",
                "Normal damage and 8 %STATUS-BLEED=bleed%. A successful Heal check cuts the bleeding in half, rather than ending it.",
                TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),new CardCritico("Shattered jaw",
                "Normal damage and 1 %ABILITY-CON=Con% %ABILITY-DAMAGE=damage%. Target cannot speak or bite %UNTIL-HEALED=until healed%.",
                TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),new CardCritico("Hamstring",
                "Normal damage and 1d2 %ABILITY-DEX=Dex% %ABILITY-DAMAGE=damage% and target is knocked %STATUS-PRONE=prone%.",
                TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),new CardCritico("Brow to chin",
                "Normal damage and 1 %ABILITY-CON=Con% and %ABILITY-CHA=Cha% %ABILITY-DAMAGE=damage%. -2 penalty on Perception and ranged attacks %UNTIL-HEALED=until healed%.",
                TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),new CardCritico("Gut slash",
                "Double damage and 1d4 %STATUS-BLEED=bleed%. Target cannot swallow whole.",
                TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),new CardCritico("Wing tear",
                "Double damage and target loses flight if it uses wings.",
                TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),new CardCritico("Missing ear",
                "Normal damage and 1 %ABILITY-CHA=Cha% %ABILITY-DRAIN=drain%. -4 penalty on Perception check %UNTIL-HEALED=until healed%.",
                TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),new CardCritico("Wide open",
                "Normal damage and target provokes attacks of opportunity from all threatening opponents.",
                TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),new CardCritico("We've got a bleeder",
                "Normal damage and 2d6 %STATUS-BLEED=bleed%.",
                TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),new CardCritico("Throat slash",
                "Normal damage and 2d6 %STATUS-BLEED=bleed%. Target cannot talk or breathe while bleeding.",
                TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),new CardCritico("Parrying strike",
                "Double damage and +4 to your AC for 1 round.",
                TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),new CardCritico("Lean into the blow",
                "Triple damage, but you drop your weapon.",
                TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),new CardCritico("Flay",
                "Normal damage plus 1d6 %ABILITY-STR=Str% %ABILITY-DAMAGE=damage%.",
                TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),new CardCritico("Paper cut",
                "Normal damage and -4 penalty on attack rolls, skill checks and ability checks for 1d4 rounds.",
                TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),new CardCritico("Severed hand",
                "Normal damage and target loses hand and takes 1d3 %ABILITY-CON=Con% and %ABILITY-STR=Str% %ABILITY-DRAIN=drain% (%SAVE-CRITICAL=Fort negates%).",
                TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),new CardCritico("Flat blade thwack",
                "Triple damage but all %NONLETHAL-DAMAGE=damage is nonlethal%.",
                TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),new CardCritico("Surprise opening",
                "Double damage and one free attack against the target with a -5 penalty.",
                TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),new CardCritico("Broad swipe",
                "Normal damage and 1d8 %STATUS-BLEED=bleed%.",
                TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),new CardCritico("Disembowel",
                "Double damage and 1d4 %ABILITY-CON=Con% %ABILITY-DAMAGE=damage% and 1d6 %STATUS-BLEED=bleed%.",
                TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),new CardCritico("Sapping slash",
                "Double damage and target is %STATUS-FATIGUED=fatigued%.",
                TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),new CardCritico("Rupture abdominal cavity",
                "Double damage and 1 %ABILITY-CON=Con% %STATUS-BLEED=bleed%.",
                TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),new CardCritico("Muscle wound",
                "Double damage and 1d2 %ABILITY-STR=Str% %ABILITY-DAMAGE=damage%.",
                TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),new CardCritico("Fingertipped",
                "Normal damage and 1 %ABILITY-DEX=Dex% %ABILITY-DAMAGE=damage%. Target cannot use one hand %UNTIL-HEALED=until healed%.",
                TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),new CardCritico("Bad parry",
                "Double damage and target has 1 item disarmed.",
                TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),new CardCritico("Nerve slice",
                "Double damage and target can take only one move or standard action next round.",
                TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),new CardCritico("Weapon strike",
                "Double damage and %OBJECT-DAMAGE=normal damage% to target's weapon.",
                TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),new CardCritico("Tangled",
                "Double damage and you may automatically grapple the target.",
                TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),new CardCritico("Momentum",
                "Double damage and +2 on all your attack rolls for 1 round.",
                TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),new CardCritico("Lip cut",
                "Double damage and 1 %STATUS-BLEED=bleed%. Target gains 20% spell failure chance for verbal spells %UNTIL-HEALED=until healed%.",
                TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),new CardCritico("Gory",
                "Normal damage and target is %STATUS-SICKENED=sickened% for 1d6 rounds.",
                TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),new CardCritico("Across the eyes",
                "Normal damage and target permanently %STATUS-BLINDED=blinded% (%SAVE-CRITICAL=Ref negates%).",
                TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),new CardCritico("Ugly wound",
                "Normal damage and 1d3 %ABILITY-CHA=Cha% %ABILITY-DAMAGE=damage% and 1 %ABILITY-CHA=Cha% %ABILITY-DRAIN=drain% (%SAVE-CRITICAL=Fort negates% drain).",
                TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),new CardCritico("Knockback",
                "Double damage and target is pushed 1d6 squares directly away.",
                TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),new CardCritico("Pain and simple",
                "Double damage and 2d6 %NONLETHAL-DAMAGE=nonlethal damage%.",
                TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),new CardCritico("Cut straps",
                "Double damage and double armor check penalty until fixed (DC 15 Craft).",
                TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),new CardCritico("Severed spine",
                "Double damage and 3d6 %ABILITY-DEX=Dex% %ABILITY-DAMAGE=damage% (%SAVE-CRITICAL=Fort halves%).",
                TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),new CardCritico("Overhand chop",
                "Double damage and 1d4 %STATUS-BLEED=bleed%.",
                TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),new CardCritico("Delayed wound",
                "Normal damage and target takes %STATUS-BLEED=bleed% damage equal to your normal damage.",
                TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),new CardCritico("Brow cut",
                "Normal damage and 1d4 %STATUS-BLEED=bleed%. Target %STATUS-BLINDED=blinded% while bleeding.",
                TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),new CardCritico("Leg swipe",
                "Double damage and target is knocked %STATUS-PRONE=prone%.",
                TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),new CardCritico("Terrible gash",
                "Double damage and 1 %ABILITY-CHA=Cha% %ABILITY-DRAIN=drain%.",
                TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),new CardCritico("Shield cleave",
                "Double damage and %OBJECT-DAMAGE=normal damage% to target's shield.",
                TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),new CardCritico("Armor damage",
                "Double damage and %OBJECT-DAMAGE=normal damage% to target's armor.",
                TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),new CardCritico("Swing through",
                "Double damage and one free attack against an adjacent foe at the same bonus.",
                TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),new CardCritico("Spun around",
                "Normal damage and target is %STATUS-FLAT-FOOTED=flat-footed% for 1 round.",TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                //endregion

                //region Card Ataque Critico Perfurante
                new CardCritico(
                        "Leg wound",
                        "Double damage, the target's land speed is halved and can't swim for 1d4 rounds."
                        ,TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Grazing hit",
                        "Normal damage and target is %STATUS-STUNNED=stunned% for 1 round."
                        ,TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Knockback",
                        "Double damage and target is pushed 1d6 \u00D7 5 feet directly away."
                        ,TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Vulnerable spot",
                        "Normal damage and target takes 1d4 %ABILITY-REDUCTION=ability reduction% of your choice."
                        ,TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Bleeder",
                        "Double damage and the target is %STATUS-EXHAUSTED=exhausted by 1 stage%."
                        ,TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Heart shot",
                        "Triple damage and the target is %STATUS-EXHAUSTED=exhausted by 1 stage%."
                        ,TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Deep wound",
                        "Double damage and target is %STATUS-POISONED=poisoned% for 1 minute (%SAVE-CRITICAL=Con saving throw negates%)."
                        ,TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Ragged wound",
                        "Normal damage and the target is %STATUS-EXHAUSTED=exhausted by 2 stages%."
                        ,TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Sucking chest wound",
                        "Double damage and target is %STATUS-EXHAUSTED=exhausted by 2 stages% (%SAVE-CRITICAL=Con saving throw negates%)."
                        ,TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Lodged in the Bone",
                        "Double damage and the target is %STATUS-EXHAUSTED=exhausted by 1 stage%."
                        ,TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Momentum",
                        "Double damage and +2 on all your attack rolls for 1 round."
                        ,TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Pinned arm",
                        "Double damage and one arm cannot move (DC 15 Str or Medicine to be freed)."
                        ,TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Punctured lung",
                        "Double damage and target begins to drown 3 round later. DC 15 Con saving throw save each round to end effect."
                        ,TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Ventilated",
                        "Double damage and 1d6 bludgeoning damage."
                        ,TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Hand wound",
                        "Normal damage and 1d2 %ABILITY-DEX=Dex% %ABILITY-REDUCTION=ability reduction%. The target has %DISADVANTAGE=disadvantage% on all rolls using that hand %UNTIL-HEALED=until healed%."
                        ,TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Pinhole",
                        "Double damage and the target is %STATUS-EXHAUSTED=exhausted by 2 stages%."
                        ,TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Perfect strike",
                        "Triple Damage."
                        ,TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Nerve cluster",
                        "Normal damage and target is %STATUS-STUNNED=stunned% for 1d6 rounds (%SAVE-CRITICAL=Str saving throw save% each round to act)."
                        ,TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Penetrating wound",
                        "Double damage and ignore damage resistance against bludgeoning, piercing and slashing."
                        ,TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Kidney piercing",
                        "Double damage and target %STATUS-POISONED=poisoned% for 2d4 round (%SAVE-CRITICAL=Con saving throw negates%)."
                        ,TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Achilles' heel",
                        "Normal damage and 1d2 %ABILITY-DEX=Dex% %ABILITY-REDUCTION=ability reduction%. Target's speeds are reduced by half %UNTIL-HEALED=until healed%."
                        ,TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Spinal tap",
                        "Normal damage and the target has %DISADVANTAGE=disadvantage% on attack rolls, saves and ability checks for 1d4 rounds."
                        ,TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "In a row",
                        "Double damage to target and normal damage to adjacent target."
                        ,TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Blown back",
                        "Double damage and target is knocked %STATUS-PRONE=prone%."
                        ,TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Appendicitis",
                        "Double damage and target is poisoned (treat as <em>Oil of Taggit</em> - SRD 209)."
                        ,TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Javelin catcher",
                        "Double damage and the target is %STATUS-EXHAUSTED=exhausted by 1 stage% if it was from ranged attack."
                        ,TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Cheek pierced",
                        "Normal damage and the target is %STATUS-EXHAUSTED=exhausted by 1 stage%. For the next 1d4 rounds, when casts a verbal spell rolls 1d20: 1-10: the spell is lost. 11-20 the spell is cast."
                        ,TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Calf hole",
                        "Normal damage and 1d4 %ABILITY-DEX=Dex% %ABILITY-REDUCTION=ability reduction%."
                        ,TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Painful poke",
                        "Double damage, the target can't take reactions and can only perform an action or a move in the next round."
                        ,TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Pierced",
                        "Double damage and target is %STATUS-INCAPACITATED=incapacitated% for 1 round."
                        ,TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Tenacious wound",
                        "Normal damage and 1d2 %ABILITY-CON=Con% %ABILITY-REDUCTION=ability reduction%. Target does not heal this damage naturally."
                        ,TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Muscles severed",
                        "Normal damage and 1d6 %ABILITY-DEX=Dex% and 1d6 %ABILITY-STR=Str% %ABILITY-REDUCTION=ability reduction%."
                        ,TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Infection",
                        "Double damage and target contracts <em>Sewer Plague</em> (%SAVE-CRITICAL=Con saving throw negates%. SRD 204)."
                        ,TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Overreaction",
                        "Normal damage and target provokes opportunity attacks from all threatening opponents."
                        ,TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Spun around",
                        "Normal damage and target is %STATUS-RESTRAINED=restrained% for 1 round."
                        ,TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Eye patch for you",
                        "Triple damage and 1d2 %ABILITY-CON=Con% %ABILITY-REDUCTION=ability reduction% that only be healed with <em>Greater Restoration</em>. The target has %DISADVANTAGE=disadvantage% on Perception and ranged attacks %UNTIL-HEALED=until healed%."
                        ,TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Forearm piercing",
                        "Double damage and target has 1 item disarmed."
                        ,TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Clean through",
                        "Normal damage, the target is %STATUS-EXHAUSTED=exhausted by 1 stage% and 1 %ABILITY-CON=Con% %ABILITY-REDUCTION=ability reduction% that only be healed with <em>Greater Restoration</em>."
                        ,TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Surprise opening",
                        "Double damage and one free attack against the target with %DISADVANTAGE=disadvantage%."
                        ,TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Organ scramble",
                        "Double damage and 1d6 %ABILITY-CON=Con% %ABILITY-REDUCTION=ability reduction%."
                        ,TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Deep hurting",
                        "Double damage and target is %STATUS-EXHAUSTED=exhausted by 1 stage%."
                        ,TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Tongue piercing",
                        "Normal damage and 1 %ABILITY-CON=Con% %ABILITY-REDUCTION=ability reduction%. The next time he casts a verbal spell rolls 1d20: 1-10: the spell is lost. 11-20 the spell is cast."
                        ,TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Shoulder wound",
                        "Double damage and 1d2 %ABILITY-STR=Str% and %ABILITY-DEX=Dex% %ABILITY-REDUCTION=ability reduction%."
                        ,TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Left reeling",
                        "Double damage and target takes a -2 penalty to AC for 1d4 rounds."
                        ,TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Elbow pierced",
                        "Double damage and target drops 1 item being held."
                        ,TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Bicep wound",
                        "Normal damage and 1d4 %ABILITY-STR=Str% %ABILITY-REDUCTION=ability reduction%."
                        ,TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Nailed in place",
                        "Double damage and target cannot move (DC 15 Str check negates)."
                        ,TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Guarded strike",
                        "Double damage and +2 to your AC for 1 round."
                        ,TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Right in the ear",
                        "Normal damage, the target has %DISADVANTAGE=disadvantage% on %ABILITY-INT=Intelligence% checks and are %STATUS-EXHAUSTED=exhausted by 1 stage%."
                        ,TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Chipped bone",
                        "Double damage and 1 %ABILITY-DEX=Dex% %ABILITY-REDUCTION=ability reduction%."
                        ,TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Stinger",
                        "Normal damage and target is %STATUS-POISONED=poisoned% for 1d6 rounds."
                        ,TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Nicked an artery",
                        "Normal damage and 1d4 %ABILITY-DEX=Con% %ABILITY-REDUCTION=ability reduction%."
                        ,TipoAtaqueEnum.Perfurante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                //endregion

                //region Card Ataque Critico Contusao

                new CardCritico(
                        "Shattered hand",
                        "Normal damage and 1d2 %ABILITY-CON=Con% and %ABILITY-STR=Str% %ABILITY-REDUCTION=ability reduction%. Hand useless %UNTIL-HEALED=until healed%."
                        ,TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Rattled",
                        "Normal damage and target is %STATUS-CONFUSED=confused% for 1d3 rounds (%SAVE-CRITICAL=Con saving throw negates%)."
                        ,TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Thunder strike",
                        "Double damage and target is %STATUS-DEAFENED=deafened% for 1d4 rounds."
                        ,TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Lights out",
                        "Normal damage and target is %STATUS-BLINDED=blinded% for 1d3 rounds."
                        ,TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Crushed trachea",
                        "Normal damage and target cannot breathe or speak. DC 13 Medicine check ends the condition."
                        ,TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Split open",
                        "Double damage and the target is %STATUS-EXHAUSTED=exhausted by 1 stage%."
                        ,TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Feeble parry",
                        "Double damage and target has 1 item disarmed."
                        ,TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Surprise opening",
                        "Double damage and one free attack against the target with %DISADVANTAGE=disadvantage%."
                        ,TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Back breaker",
                        "Double damage and 1d6 %ABILITY-DEX=Dex% %ABILITY-REDUCTION=ability reduction%."
                        ,TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Terrible bruise",
                        "Double damage and 1d6 extra damage."
                        ,TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Broken leg",
                        "Normal damage and 1d4 %ABILITY-CON=Con% and %ABILITY-DEX=Dex% %ABILITY-REDUCTION=ability reduction%. Target's speeds are reduced by half %UNTIL-HEALED=until healed%."
                        ,TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Spun around",
                        "Normal damage and target is %STATUS-RESTRAINED=restrained% for 1 round."
                        ,TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Where am I?",
                        "Normal damage and target is %STATUS-STUNNED=stunned% for 1 round."
                        ,TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "To your thinky bits",
                        "Double damage and the target is %STATUS-EXHAUSTED=exhausted by 1 stage% (%SAVE-CRITICAL=Con saving throw negates%)."
                        ,TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Crunch",
                        "Double damage and target is %STATUS-POISONED=poisoned% for 1 round (%SAVE-CRITICAL=Con saving throw negates%)."
                        ,TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Armor dent",
                        "Double damage and 2d6 %OBJECT-DAMAGE=damage to metal armor%."
                        ,TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Breathless",
                        "Normal damage and target is %STATUS-EXHAUSTED=exhausted by 2 stages% for 1d4 rounds."
                        ,TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Mace to da' face",
                        "Normal damage and the target is %STATUS-INCAPACITATED=incapacitated% and %STATUS-BLINDED=blinded% for 1 round."
                        ,TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Tiring blow",
                        "Double damage plus target is %STATUS-EXHAUSTED=exhausted by 1 stage%."
                        ,TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Concussion",
                        "Normal damage and 1d2 %ABILITY-INT=Int% and %ABILITY-WIS=Wis% %ABILITY-REDUCTION=ability reduction%."
                        ,TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Ruptured spleen",
                        "Normal damage and the target is %STATUS-EXHAUSTED=exhausted by 2 stages%."
                        ,TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Solid blow",
                        "Triple damage."
                        ,TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Crumpling blow",
                        "Double damage and target is knocked %STATUS-PRONE=prone%."
                        ,TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Collapsed lung",
                        "Normal damage and the target is %STATUS-INCAPACITATED=incapacitated% for 1d3 rounds (%SAVE-CRITICAL=Con saving throw negates% each round)."
                        ,TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Flat foot",
                        "Double damage and 1 %ABILITY-DEX=Dex% %ABILITY-REDUCTION=ability reduction% and target's speeds are reduced by 5 feet %UNTIL-HEALED=until healed%."
                        ,TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Skull crush",
                        "Double damage and 2d6 %ABILITY-INT=Int% %ABILITY-REDUCTION=ability reduction% that only be healed with <em>Greater Restoration</em> (%SAVE-CRITICAL=Con saving throw halves%)."
                        ,TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "And stay down!",
                        "Normal damage and target is knocked %STATUS-PRONE=prone% and %STATUS-STUNNED=stunned% for 1 round (%SAVE-CRITICAL=Str saving throw negates% stun)."
                        ,TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Bone masher",
                        "Normal damage and either 1d3 %ABILITY-DEX=Dex% %ABILITY-REDUCTION=ability reduction% and halve speed (leg) or 1d3 %ABILITY-STR=Str% %ABILITY-REDUCTION=ability reduction% (arm). Limb useless %UNTIL-HEALED=until healed%."
                        ,TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "2 for 1",
                        "Double damage to target and normal damage to one adjacent target."
                        ,TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Crushed intestines",
                        "Normal damage and the target %STATUS-EXHAUSTED=exhausted by 2 stages% (DC 15 Con saving throw negates)."
                        ,TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Numbing blow",
                        "Normal damage and 1d4 %ABILITY-DEX=Dex% %ABILITY-REDUCTION=ability reduction% and target is disarmed (1 item, %SAVE-CRITICAL=Dex saving throw negates% drop)."
                        ,TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Roundhouse",
                        "Normal damage and a free attack against adjacent foes."
                        ,TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Staggering blow",
                        "Normal damage and the target is %STATUS-INCAPACITATED=incapacitated% for 1 round (%SAVE-CRITICAL=Con saving throw negates%)."
                        ,TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "My teef!",
                        "Normal damage and 1 %ABILITY-CON=Con% %ABILITY-REDUCTION=ability reduction%. %UNTIL-HEALED=Until healed%, the Target loses bite attacks  attacks and the next time he casts a verbal spell rolls 1d20: 1-10: the spell is lost. 11-20 the spell is cast."
                        ,TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Earth rumble",
                        "Normal damage and a free trip attempt versus target and all adjacent enemies."
                        ,TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Pimp slap",
                        "Normal damage and target %STATUS-INCAPACITATED=incapacitated% for 1d2 rounds."
                        ,TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Cracked rib",
                        "Normal damage and 1d3 %ABILITY-CON=Con% %ABILITY-REDUCTION=ability reduction% and target is %STATUS-EXHAUSTED=exhausted by 1 stage%."
                        ,TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Box the ears",
                        "Normal damage and target %STATUS-DEAFENED=deafened% for 1d4 hours."
                        ,TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Bell ringer",
                        "Normal damage and 1d2 %ABILITY-INT=Int% %ABILITY-REDUCTION=ability reduction% and %STATUS-POISONED=poisoned% for 1d4 rounds."
                        ,TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Momentum",
                        "Double damage and %ADVANTAGE=advantage% on all your attack rolls for 1 round."
                        ,TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Broken nose",
                        "Normal damage and 1 %ABILITY-CHA=Cha% %ABILITY-REDUCTION=ability reduction% and the target is %STATUS-EXHAUSTED=exhausted by 1 stage%."
                        ,TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Broken ribs",
                        "Double damage and target cannot heal naturally for 1d4 days."
                        ,TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Knockback",
                        "Double damage and target is pushed 1d6 \u00D7 5 feet directly away."
                        ,TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Low blow",
                        "Normal damage and target is %STATUS-POISONED=poisoned% for 1d6 rounds."
                        ,TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Brained",
                        "Double damage, the target can't take reactions and can only perform an action or a move in the next round."
                        ,TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Shield smack",
                        "Double damage and target's shield is disarmed."
                        ,TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "I see stars",
                        "Normal damage and target takes has %DISADVANTAGE=disadvantage% on attacks for 1d4 rounds."
                        ,TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Nighty night",
                        "Normal damage and target is %STATUS-UNCONSCIOUS=unconscious% for 1d4 rounds (%SAVE-CRITICAL=Con saving throw negates%)."
                        ,TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Cracked knee",
                        "Normal damage and 1d2 %ABILITY-DEX=Dex% %ABILITY-REDUCTION=ability reduction%. Target's base land speed reduced to 10 feet %UNTIL-HEALED=until healed%."
                        ,TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "What's going on?",
                        "Double damage and 1d4 hours of target's memory erased."
                        ,TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Crushed toe",
                        "Normal damage and 1d4 %ABILITY-DEX=Dex% %ABILITY-REDUCTION=ability reduction%. Target's land speed is halved %UNTIL-HEALED=until healed%."
                        ,TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Off balance",
                        "Normal damage and target provokes opportunity attacks from all threatening opponents."
                        ,TipoAtaqueEnum.Contusao.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),

                //endregion

                //region Card Ataque Critico Magico
                new CardCritico(
                        "Time vortex",
                        "Normal damage and target vanishes, reappearing 1d4 rounds later."
                        ,TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Maximum effect",
                        "All spell variables (not dice rolls) are maximized."
                        ,TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Draining spell",
                        "Double damage and target randomly loses one spell or one use of a magic ability."
                        ,TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Wild surge",
                        "Normal damage and normal damage of a random energy type."
                        ,TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Excruciating",
                        "Normal damage and target is %STATUS-POISONED=poisoned% for 1d6 rounds."
                        ,TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Terrifying display",
                        "Normal damage and target %STATUS-FRIGHTENED=frightened% for 1d4 rounds (%SAVE-CRITICAL=Wis saving throw negates%)."
                        ,TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Dispelling aura",
                        "Normal damage and dispel magic on the target."
                        ,TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Concussive spell",
                        "Double damage and the target is %STATUS-EXHAUSTED=exhausted by 1 stage%."
                        ,TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Knockback",
                        "Double damage and target is pushed 1d6 \u00D7 5 feet directly away."
                        ,TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "I love you, man",
                        "Normal damage and target is %STATUS-CHARMED=charmed% for 3 rounds (%SAVE-CRITICAL=Cha saving throw negates%)."
                        ,TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Electrocuted",
                        "Double damage. If the spell does electricity damage, the target %STATUS-STUNNED=stunned% for 1d4 rounds."
                        ,TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Hypnotic link",
                        "Double damage and you may give the target 1 <em>Suggestion</em> (as the spell. %SAVE-CRITICAL=Cha saving throw negates%)."
                        ,TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Frozen",
                        "Double damage. If the spell does cold damage, target takes 1d4 %ABILITY-DEX=Dex% %ABILITY-REDUCTION=ability reduction%."
                        ,TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Side effect",
                        "Double damage and you become %STATUS-INVISIBLE=invisible% as the invisibility spell for 1d4 rounds."
                        ,TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Turned around",
                        "Double damage and the target is %STATUS-INCAPACITATED=incapacitated% for one round."
                        ,TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Stunned",
                        "Normal damage and target is %STATUS-STUNNED=stunned% for 1 round."
                        ,TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Call of the wind",
                        "Double damage or triple damage to beasts and fey."
                        ,TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Petrified",
                        "Normal damage and target is %STATUS-PETRIFIED=petrified% for 1d4 hours (%SAVE-CRITICAL=Con saving throw negates%)."
                        ,TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Pretty colors",
                        "Double damage and target is %STATUS-BLINDED=blinded% for 1d4 rounds."
                        ,TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Nerve damage",
                        "Normal damage and target is affected by the <em>Slow</em> spell for 1d6 rounds."
                        ,TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Arcane blast",
                        "Double damage and 2d6 random energy damage (%SAVE-CRITICAL=Dex saving throw halves%)."
                        ,TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Planar rift",
                        "Normal damage and target sent to a random plane (%SAVE-CRITICAL=Int saving throw negates%)."
                        ,TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Eyeburn",
                        "Normal damage and target %STATUS-BLINDED=blinded% for 1d4 rounds (%SAVE-CRITICAL=Con saving throw negates%)."
                        ,TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Intense strike",
                        "Double damage and ignore energy resistance (but not immunity)."
                        ,TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Transposition",
                        "Double damage and you and target switch places."
                        ,TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Light blast",
                        "Double damage and target is %STATUS-BLINDED=blinded% for 1 round."
                        ,TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Conduit",
                        "Double damage and target has %DISADVANTAGE=disadvantage% on saves vs. your spells for 1d6 rounds."
                        ,TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Lingering magic",
                        "Normal damage this round and half damage each round for 1d4 rounds."
                        ,TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Allergic reaction",
                        "Double damage and 1d4 %ABILITY-REDUCTION=ability reduction% to a random ability score."
                        ,TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Arcane glow",
                        "Double damage and target glows like <em>Faerie fire</em> for 1d6 rounds."
                        ,TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Combustion",
                        "Double damage. If fire spell, target catches fire, taking 2d6 fire damage per round until extinguished."
                        ,TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Unnatural selection",
                        "Double damage or triple damage to aberrations, fiends, celestials and monstrosities."
                        ,TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Corrosive",
                        "Double damage. If acid spell, target takes 2d6 acid damage for 1d4 rounds."
                        ,TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Funny bone",
                        "Double damage and target spends 1 round laughing (as <em>Hideous laughter</em> spell, %SAVE-CRITICAL=Wis saving throw negates%)."
                        ,TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Phased",
                        "Double damage and target is %STATUS-INCORPOREAL=incorporeal% for 1d3 rounds (%SAVE-CRITICAL=Int saving throw negates%)."
                        ,TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Life leech",
                        "Normal damage and 2d6 necrotic damage as %STATUS-LIFE-DRAIN=life drain%, like a <em>Specter</em> attack (%SAVE-CRITICAL=Con saving throw negates% after 1 day)."
                        ,TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Siren song",
                        "Double damage or triple damage to giants and humanoids."
                        ,TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Distraction",
                        "Double damage and an illusion appears to attack foe, flanking him for you for 1d6 rounds."
                        ,TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Arcane goo",
                        "Normal damage and target is %STATUS-RESTRAINED=restrained% (DC 20 Str or Dex to be freed)."
                        ,TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Hoarder's wrath",
                        "Double damage or triple damage to dragons."
                        ,TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Mind cloud",
                        "Double damage and target is %STATUS-INCAPACITATED=incapacitated% for 1 round."
                        ,TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Elemental call",
                        "Normal damage. If the spell does elemental damage, an appropriate level elemental appears to serve for 1d4 rounds."
                        ,TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Splash spell",
                        "Normal damage and half damage to all adjacent targets."
                        ,TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Olfactory overload",
                        "Double damage and target loses any <em>scent</em> and <em>blindsight</em> for 1 day."
                        ,TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Cut off from magic",
                        "Normal damage and target cannot cast spells or use abilities for 1d4 rounds."
                        ,TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Aura of protection",
                        "Double damage and +4 to your AC for 1 round."
                        ,TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Vulnerability",
                        "Double damage and if the spell did elemental damage the target is now vulnerable to that element for 3 rounds."
                        ,TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Roaring spell",
                        "Double damage and target is %STATUS-DEAFENED=deafened% for 1d4 rounds."
                        ,TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Returning spell",
                        "Double damage and spell is not lost."
                        ,TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Power surge",
                        "Triple damage."
                        ,TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Vampiric magic",
                        "Normal damage. You are healed the same amount."
                        ,TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new CardCritico(
                        "Shrink ray",
                        "Normal damage and target is reduced for 3 rounds (as <em>Reduce</em>, %SAVE-CRITICAL=Wis saving throw negates%)."
                        ,TipoAtaqueEnum.Magico.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor())
                //endregion
        };
    }
}