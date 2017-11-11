package box.kotor.old;

public class Prereqs {
    
    private final Feat prereq1;
    private final Feat prereq2;
    private final Feat successor;
    
    public static Prereqs of(AdjustFeat feat) {
        switch (feat) {
            case POWER_ATTACK_1: return Prereqs.of(null, null, AdjustFeat.POWER_ATTACK_2);
            case POWER_ATTACK_2: return Prereqs.of(AdjustFeat.POWER_ATTACK_1, null, AdjustFeat.POWER_ATTACK_3);
            case POWER_ATTACK_3: return Prereqs.of(AdjustFeat.POWER_ATTACK_1, AdjustFeat.POWER_ATTACK_2, null);
            case FLURRY_1: return Prereqs.of(null, null, AdjustFeat.FLURRY_2);
            case FLURRY_2: return Prereqs.of(AdjustFeat.FLURRY_1, null, AdjustFeat.FLURRY_3);
            case FLURRY_3: return Prereqs.of(AdjustFeat.FLURRY_1, AdjustFeat.FLURRY_2, null);
            case CRITICAL_STRIKE_1: return Prereqs.of(null, null, AdjustFeat.CRITICAL_STRIKE_2);
            case CRITICAL_STRIKE_2: return Prereqs.of(AdjustFeat.CRITICAL_STRIKE_1, null, AdjustFeat.CRITICAL_STRIKE_3);
            case CRITICAL_STRIKE_3: return Prereqs.of(AdjustFeat.CRITICAL_STRIKE_1, AdjustFeat.CRITICAL_STRIKE_2, null);
            case POWER_BLAST_1: return Prereqs.of(null, null, AdjustFeat.POWER_ATTACK_2);
            case POWER_BLAST_2: return Prereqs.of(AdjustFeat.POWER_ATTACK_1, null, AdjustFeat.POWER_ATTACK_3);
            case POWER_BLAST_3: return Prereqs.of(AdjustFeat.POWER_ATTACK_1, AdjustFeat.POWER_ATTACK_2, null);
            case RAPID_SHOT_1: return Prereqs.of(null, null, AdjustFeat.RAPID_SHOT_2);
            case RAPID_SHOT_2: return Prereqs.of(AdjustFeat.RAPID_SHOT_1, null, AdjustFeat.RAPID_SHOT_3);
            case RAPID_SHOT_3: return Prereqs.of(AdjustFeat.RAPID_SHOT_1, AdjustFeat.RAPID_SHOT_2, null);
            case SNIPER_SHOT_1: return Prereqs.of(null, null, AdjustFeat.SNIPER_SHOT_2);
            case SNIPER_SHOT_2: return Prereqs.of(AdjustFeat.SNIPER_SHOT_1, null, AdjustFeat.SNIPER_SHOT_3);
            case SNIPER_SHOT_3: return Prereqs.of(AdjustFeat.SNIPER_SHOT_1, AdjustFeat.SNIPER_SHOT_2, null);
            case TWO_WEAPON_1: return Prereqs.of(null, null, AdjustFeat.TWO_WEAPON_2);
            case TWO_WEAPON_2: return Prereqs.of(AdjustFeat.TWO_WEAPON_1, null, AdjustFeat.TWO_WEAPON_3);
            case TWO_WEAPON_3: return Prereqs.of(AdjustFeat.TWO_WEAPON_1, AdjustFeat.TWO_WEAPON_2, null);
            case CONDITIONING_1: return Prereqs.of(null, null, AdjustFeat.CONDITIONING_2);
            case CONDITIONING_2: return Prereqs.of(AdjustFeat.CONDITIONING_1, null, AdjustFeat.CONDITIONING_3);
            case CONDITIONING_3: return Prereqs.of(AdjustFeat.CONDITIONING_1, AdjustFeat.CONDITIONING_2, null);
            case JEDI_DEFENSE_1: return Prereqs.of(null, null, AdjustFeat.JEDI_DEFENSE_2);
            case JEDI_DEFENSE_2: return Prereqs.of(AdjustFeat.JEDI_DEFENSE_1, null, AdjustFeat.JEDI_DEFENSE_3);
            case JEDI_DEFENSE_3: return Prereqs.of(AdjustFeat.JEDI_DEFENSE_1, AdjustFeat.JEDI_DEFENSE_2, null);
            default: throw new IllegalStateException();
        }
    }
    
    private static Prereqs none() {
        return new Prereqs(null, null, null);
    }
    
    private static Prereqs of(Feat prereq1, Feat prereq2, Feat successor) {
        return new Prereqs(prereq1, prereq2, successor);
    }
    
    private Prereqs(Feat prereq1, Feat prereq2, Feat successor) {
        this.prereq1 = prereq1;
        this.prereq2 = prereq2;
        this.successor = successor;
    }
    
    public Feat getPrereq1() {
        return prereq1;
    }
    
    public Feat getPrereq2() {
        return prereq2;
    }
    
    public Feat getSuccessor() {
        return successor;
    }
}
