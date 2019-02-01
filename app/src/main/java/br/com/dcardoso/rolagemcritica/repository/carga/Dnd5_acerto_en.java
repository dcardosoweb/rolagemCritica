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
                TipoAtaqueEnum.Cortante.getValor(),TipoCriticoEnum.Ataque.getValor(), TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),new CardCritico("Missing digits",
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

                //endregion

                //region Card Ataque Critico Contusao
                //endregion

                //region Card Ataque Critico Magico
                //endregion
        };
    }
}