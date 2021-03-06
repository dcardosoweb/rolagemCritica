package br.com.dcardoso.rolagemcritica.repository.carga;
import br.com.dcardoso.rolagemcritica.entity.DicaDeRegra;
import br.com.dcardoso.rolagemcritica.utils.enums.IdiomaEnum;
import br.com.dcardoso.rolagemcritica.utils.enums.TipoSistemaEnum;

public class Dnd5_dica_regra_en {

    public static DicaDeRegra[] populateData() {
        return new DicaDeRegra[]{
                new DicaDeRegra(
                        "ADVANTAGE",
                        "Advantage",
                        "When you have to make the roll, use an additional d20. Use the higher of the two rolls as the result.<ul><li>If two favorable situations grant advantage on it, you still roll only one additional d20.</li><li>If circumstances cause a roll to have both advantage and disadvantage, you are considered to have neither of them, and you roll only one d20.</li></ul>",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "DISADVANTAGE",
                        "Disadvantage",
                        "When you have to make the roll, use an additional d20. Use the lower of the two rolls as the result.<ul><li>If two favorable situations imposes disadvantage on it, you still roll only one additional d20.</li><li>If circumstances cause a roll to have both advantage and disadvantage, you are considered to have neither of them, and you roll only one d20.</li></ul>",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "OBJECT-DAMAGE",
                        "Damaging an object",
                        "Objects are immune to poison and psychic damage, but otherwise they can be affected by physical and magical attacks much like creatures can.<ul><li>The GM determines an object's Armor Class and hit points, and might decide that certain objects have resistance or immunity to certain kinds of attacks (It's hard to cut a rope with a club, for example)</li><li>Objects always fail Strength and Dexterity saving throws, and they are immune to effects that require other saves</li><li>When an object drops to 0 hit points, it breaks</li></ul>",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "ABILITY-REDUCTION",
                        "Ability reduction",
                        "Ability reduction is healed usually after a long rest, but could require the use of spells such as <em>Greater Restoration</em>.",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "ABILITY-STR",
                        "Strength reduction",
                        "The character takes penalties on:<ul><li>Strength checks</li><li>Strength saving throws</li><li>Athletics checks</li><li>Melee attack and damage rolls made with non-finesse weapons</li><li>Carrying capacity</li></ul>",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "ABILITY-DEX",
                        "Dexterity reduction",
                        "The character takes penalties on:<ul><li>Dexterity checks</li><li>Dexterity saving throws</li><li>Acrobatics, Sleight of Hand and Stealth checks</li><li>Ranged attack and weapon damage rolls</li><li>Melee attack and damage rolls made with finesse weapons</li><li>Initiative checks</li><li>Armor Class</li></ul>",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "ABILITY-CON",
                        "Constitution reduction",
                        "The character takes penalties on:<ul><li>Constitution checks</li><li>Constitution saving throws</li><li>Total Hit Points for each Hit Dice</li></ul>A character with a Constitution score of 0 is dead.",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "ABILITY-INT",
                        "Intelligence reduction",
                        "The character takes penalties on:<ul><li>Intelligence checks</li><li>Intelligence saving throws</li><li>Arcana, History, Investigation, Nature and Religion checks</li><li>Spell DCs based on Intelligence</li></ul>",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "ABILITY-WIS",
                        "Wisdom reduction",
                        "The character takes penalties on:<ul><li>Wisdom checks</li><li>Wisdom saving throws</li><li>Animal Handling, Insight, Medicine, Perception and Survival checks</li><li>Will saving throws</li><li>Spell DCs based on Wisdom</li></ul>",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "ABILITY-CHA",
                        "Charisma reduction",
                        "The character takes penalties on:<ul><li>Charisma checks</li><li>Charisma saving throws</li><li>Deception, Intimidation, Performance and Persuasion checks</li><li>Spell DCs based on Charisma</li><li>DC to resist channeled energy</li></ul>",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "SAVE-CRITICAL",
                        "Critical hit DC",
                        "Use the attack roll as the save DC.",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "SAVE-FUMBLE",
                        "Fumble DC",
                        "Use the target's armor as the save DC.",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "UNTIL-HEALED",
                        "Until healed",
                        "This refers to the effect or additional damage done, not the weapon or spell damage.",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "STATUS-BLINDED",
                        "Blinded",
                        "The character cannot see.<ul><li>Fails any ability check that requires sight</li><li>Attack rolls against the character have advantage, and the character's attack rolls have disadvantage</li></ul>",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "STATUS-CHARMED",
                        "Charmed",
                        "The character regards another as a friendly acquaintance.<ul><li>Can't attack the charmer or target the charmer with harmful abilities or magical effects</li><li>The charmer has advantage on any ability check to interact socially with the character</li></ul>",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "STATUS-CONFUSED",
                        "Confused",
                        "The character has its mind twisted and can't act normally or take reactions. Each round, roll 1d10:<ol><li>1: The character uses all its movement to move in a random direction. To determine the direction, roll a d8 and assign a direction to each die face. The character doesn't take an action this turn</li><li>2–6: The character doesn't move or take actions this turn</li><li>7–8: The character uses its action to make a melee attack against a randomly determined character within its reach. If there is no character within its reach, the character does nothing this turn</li><li>9–10: The character can act and move normally</li></ol>",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "STATUS-DEAFENED",
                        "Deafened",
                        "The character cannot hear and automatically fails any ability check that requires hearing.",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "STATUS-DYING",
                        "Dying",
                        "Whenever you start your turn with 0 hit points, you must make a special saving throw, called a death saving throw, to determine whether you creep closer to death or hang onto life. Unlike other saving throws, this one isn't tied to any ability score. You are in the hands of fate now, aided only by spells and features that improve your chances of succeeding on a saving throw. <br><b>Roll a d20:</b> If the roll is 10 or higher, you succeed. Otherwise, you fail. A success or failure has no effect by itself. On your third success, you become <i>stable</i>. On your third failure, you die. The successes and failures don't need to be consecutive; keep track of both until you collect three of a kind. The number of both is reset to zero when you regain any hit points or become stable<br><b>Rolling 1 or 20:</b> When you make a death saving throw and roll a 1 on the d20, it counts as two failures. If you roll a 20 on the d20, you regain 1 hit point. <br><b>Damage at 0 Hit Points:</b> If you take any damage while you have 0 hit points, you suffer a death saving throw failure. If the damage is from a critical hit, you suffer two failures instead. If the damage equals or exceeds your hit point maximum, you suffer instant death.",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "STATUS-EXHAUSTED",
                        "Exhausted",
                        "The character is depleted of energy. Exhaustion is measured in six levels. An effect can give a character one or more levels of exhaustion, as specified in the effect's description.<ol><li>1: Disadvantage on ability checks</li><li>2: Speed halved</li><li>3: Disadvantage on attack rolls and saving throws</li><li>4: Hit point maximum halved</li><li>5: Speed reduced to 0</li><li>6: Death</li></ol><br><ul><li>If it's already exhausted, its current level of exhaustion increases by the amount specified</li><li>Suffers the effect of its current level of exhaustion as well as all lower levels</li><li>An effect that removes exhaustion reduces its level as specified in the effect's description, with all exhaustion effects ending if a character's exhaustion level is reduced below 1</li><li>Finishing a long rest reduces a character's exhaustion level by 1, provided that the character has also ingested some food and drink</li></ul>",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "STATUS-FRIGHTENED",
                        "Frightened",
                        "The character is filled with fear.<ul><li>Has disadvantage on ability checks and attack rolls while the source of its fear is within line of sight</li><li>Can't willingly move closer to the source of its fear</li></ul>",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "STATUS-INCAPACITATED",
                        "Incapacitated",
                        "The character can't take actions or reactions.",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "STATUS-INCORPOREAL",
                        "Incorporeal",
                        "The character doesn't have a physical body and can move through other characters and objects as if they were difficult terrain.",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "STATUS-INVISIBLE",
                        "Invisible",
                        "The character is visually undetectable.<ul><li>An invisible character is impossible to see without the aid of magic or a special sense</li><li>For the purpose of hiding, the character is heavily obscured</li><li>It's location can be detected by any noise it makes or any tracks it leaves</li><li>Attack rolls against it have disadvantage</li><li>It's attack rolls have advantage</li></ul>",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "STATUS-LIFE-DRAIN",
                        "Life Drain",
                        "The character's life essence is consumed.<ul><li>Its hit point maximum is reduced by an amount equal to the damage taken</li><li>This reduction lasts until the character finishes a long rest</li><li>The target dies if this effect reduces its hit point maximum to 0</li></ul>",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "STATUS-PARALYZED",
                        "Paralyzed",
                        "The character is frozen in place and unable to act or speak.<ul> <li>A paralyzed character is incapacitated (see the condition) and can't move or speak</li><li>Automatically fails Strength and Dexterity saving throws</li><li>Attack rolls against the character have advantage</li><li>Any attack that hits the character is a critical hit if the attacker is within 5 feet of the character</li></ul>",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "STATUS-PETRIFIED",
                        "Petrified",
                        "The character is transformed, along with any nonmagical object it is wearing or carrying, into a solid inanimate substance (usually stone).<ul><li>Its weight increases by a factor of ten, and it ceases aging</li><li>Is incapacitated (see the condition), can't move or speak and is unaware of its surroundings</li><li>Attack rolls against the character have advantage</li><li>Attack rolls against it have advantage</li><li>It automatically fails Strength and Dexterity saving throws</li><li>It has resistance to all damage</li><li>It is immune to poison and disease, although a poison or disease already in its system is suspended, not neutralized</li></ul>",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "STATUS-POISONED",
                        "Poisoned",
                        "The character is feeling ill or has a toxic substance in its body. It suffers disadvantage on attack rolls and ability checks.",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "STATUS-PRONE",
                        "Prone",
                        "The character is lying on the ground.<ul><li>Its only movement option is to crawl, unless it stands up and thereby ending the condition</li><li>Has disadvantage on attack rolls</li><li>Attack rolls against the character has advantage if the attacker is within 5 feet of the character. Otherwise, the attack roll has disadvantage</li></ul>",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "STATUS-RESTRAINED",
                        "Restrained",
                        "The character has its movement restricted.<ul><li>Its speed becomes 0, and it can't benefit from any bonus to its speed</li><li>Attack rolls against it have advantage</li><li>Its attack rolls have disadvantage</li><li>It has disadvantage on Dexterity saving throws</li></ul>",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "STATUS-STABLE",
                        "Stable",
                        "The character is no longer dying but still unconscious.<ul><li>Doesn't make death saving throws, even though it has 0 hit points, but it does remain unconscious</li><li>Stops being stable, and must start making death saving throws again, if it takes any damage</li><li>Regains 1 hit point after 1d4 hours if is not healed</li></ul>",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "STATUS-STUNNED",
                        "Stunned",
                        "The character has mental numbness.<ul><li>Is incapacitated (see the condition), can't move, and can speak only falteringly</li><li>Automatically fails Strength and Dexterity saving throws</li><li>Attack rolls against the character have advantage</li></ul>",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "STATUS-UNCONSCIOUS",
                        "Unconscious",
                        "The character is knocked out and helpless.<ul><li>Is incapacitated (see the condition), can't move or speak, and is unaware of its surroundings</li><li>The character drops whatever it's holding and falls prone</li><li>The character automatically fails Strength and Dexterity saving throws</li><li>Attack rolls against the character have advantage</li><li>Any attack that hits the character is a critical hit if the attacker is within 5 feet of the character</li></ul>",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "DESCRIPTION-ROD-OF-WONDER",
                        "Rod of Wonder",
                        "A rod of wonder is a strange and unpredictable device that randomly generates any number of weird effects each time it is used. Roll a d100 and apply its effects:<ul><li>01–05: <em>Slow</em> target for 10 rounds (Wis DC 12 negates).</li><li>06–10: <em>Faerie fire</em> surrounds the target.</li><li>11–15: Deludes wielder for 1 round into believing the rod functions as indicated by a second die roll (no save).</li><li>16–20: <em>Gust of wind</em>, but at windstorm force (Str DC 14 negates).</li><li>21–25: Wielder learns target's surface thoughts (as with <em>detect thoughts</em>) for 1d4 rounds (no save).</li><li>26–30: <em>Stinking cloud</em> appears at 30-ft. range (Con DC 15 negates).</li><li>31–33: Heavy rain falls for 1 round in 60-ft. radius centered on rod wielder.</li><li>34–36: <em>Summon</em> an animal—a rhino (01–25 on d%), elephant (26–50), or mouse (51–100).</li><li>37–46: <em>Lightning bolt</em> (70 ft. long, 5 ft. wide), 6d6 damage (Dex DC 15 half).</li><li>47–49: A stream of 600 large butterflies pours forth and flutters around for 2 rounds, blinding everyone within 25 ft. (Dex DC 14 negates).</li><li>50–53: <em>Enlarge</em> on target if within 60 ft. of rod (Con DC 13 negates).</li><li>54–58: <em>Darkness</em>, 30-ft.-diameter hemisphere, centered 30 ft. away from rod.</li><li>59–62: Grass grows in 160-square-ft. area before the rod, or grass existing there grows to 10 times normal size.</li><li>63–65: Turn ethereal any nonliving object of up to 1000 lbs. mass and up to 30 cubic ft. in size.</li><li>66–69: <em>Reduce</em> wielder two size categories (no save) for 1 day.</li><li>70–79: <em>Fireball</em> at target or 100 ft. straight ahead, 6d6 damage (Dex DC 15 half).</li><li>80–84: <em>Invisibility</em> covers rod wielder.</li><li>85–87: Leaves grow from target if within 60 ft. of rod. These last 24 hours.</li><li>88–90: 10–40 gems, value 1 gp each, shoot forth in a 30-ft.-long stream. Each gem deals 1 point of damage to any creature in its path: roll 5d4 for the number of hits and divide them among the available targets.</li><li>91–95: Shimmering colors dance and play over a 40-ft.-by-30-ft. area in front of rod. Creatures therein are blinded for 1d6 rounds (Con DC 15 negates).</li><li>96–97: Wielder (50% chance) or target (50% chance) turns permanently blue, green, or purple (no save).</li><li>98–100: <em>Flesh to stone</em> (or <em>stone to flesh</em> if target is stone already) if target is within 60 ft. (Con DC 18 negates).</li></ul>",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
                new DicaDeRegra(
                        "DESCRIPTION-ITEM-DRAWBACKS",
                        "Item drawbacks",
                        "Items with drawbacks are usually still beneficial to the possessor but carry some negative aspect. Although sometimes drawbacks occur only when the item is used (or held, in the case of some weapons), usually the drawback remains with the character for as long as she has the item. Unless otherwise indicated, drawbacks remain in effect as long as the item is possessed. Roll a d100:<ul><li>01–04: Character's hair grows 1 inch longer every hour.</li><li>05–09: Character either shrinks 6 inches (01–50 on d%) or grows that much taller (51–100). Only happens once.</li><li>10–13: Temperature around item is 10° F cooler than normal.</li><li>14–17: Temperature around item is 10° F warmer than normal.</li><li>18–21: Character's hair color changes.</li><li>22–25: Character's skin color changes.</li><li>26–29: Character now bears some identifying mark (tattoo, weird glow, or the like).</li><li>30–32: Character's gender changes.</li><li>33–34: Character's race or kind changes.</li><li>35 Character is afflicted with a random disease that cannot be cured.</li><li>36–39: item continually emits a disturbing sound (moaning, weeping, screaming, cursing, insults).</li><li>40 item looks ridiculous (garishly colored, silly shape, glows bright pink).</li><li>41–45: Character becomes selfishly possessive.</li><li>46–49: Character becomes paranoid about losing the item and afraid of damage occurring to it.</li><li>50–51: Character's alignment changes.</li><li>52–54: Character must attack nearest creature (5% chance [01–05 on d%] each day).</li><li>55–57: Character is stunned for 1d4 rounds once item function is finished (or randomly, 1/day).</li><li>58–60: Character's vision is blurry (disadvantage on attack rolls, saves, and ability checks requiring vision).</li><li>61–64: Character gains one negative level.</li><li>65 Character gains two negative levels.</li><li>66–70: Character must make a Wis save each day or take 1 point of Intelligence damage.</li><li>71–75: Character must make a Wis save each day or take 1 point of Wisdom damage.</li><li>76–80: Character must make a Wis save each day or take 1 point of Charisma damage.</li><li>81–85: Character must make a Con save each day or take 1 point of Constitution damage.</li><li>86–90: Character must make a Con save each day or take 1 point of Strength damage.</li><li>91–95: Character must make a Con save each day or take 1 point of Dexterity damage.</li><li>96: Character is <em>polymorphed</em> into a specific creature (5% chance [01–05 on d%] each day).</li><li>97: Character cannot cast arcane spells.</li><li>98: Character cannot cast divine spells.</li><li>99: Character cannot cast any spells.</li><li>100: Either pick one of the above that's appropriate or create a drawback specifically for that item.</li></ul>",
                        TipoSistemaEnum.DungeonsDragons.getValor(),IdiomaEnum.Ingles.getValor()),
        };
    }
}

