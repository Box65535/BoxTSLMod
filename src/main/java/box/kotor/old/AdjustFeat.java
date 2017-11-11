package box.kotor.old;

import box.kotor.twoda.TwodaRecord;
import box.kotor.string.RefString;

public enum AdjustFeat implements ReplaceFeat {
    
    POWER_ATTACK_1(28, null, null, 0, if_pattack01, null, null, NON_DROID, 1, 2),
    POWER_ATTACK_2(17, null, null, 3, if_pattack02, POWER_ATTACK_1, null, NON_DROID, 2, 2),
    POWER_ATTACK_3(83, null, null, 7, if_pattack03, POWER_ATTACK_1, POWER_ATTACK_2, NON_DROID, 3, 2),
    FLURRY_1(11, null, null, 0, if_flurry01, null, null, NON_DROID, 1, 2),
    FLURRY_2(91, null, null, 3, if_flurry02, FLURRY_1, null, NON_DROID, 2, 2),
    FLURRY_3(53, null, null, 7, if_flurry03, FLURRY_1, FLURRY_2, NON_DROID, 3, 2),
    CRITICAL_STRIKE_1(11, null, null, 0, if_crtstrk01, null, null, NON_DROID, 1, 2),
    CRITICAL_STRIKE_2(19, null, null, 3, if_crtstrk02, CRITICAL_STRIKE_1, null, NON_DROID, 2, 2),
    CRITICAL_STRIKE_3(81, null, null, 7, if_crtstrk03, CRITICAL_STRIKE_1, CRITICAL_STRIKE_2, NON_DROID, 3, 2),
    POWER_BLAST_1(29, null, null, 0, if_pshot01, null, null, ALL_CLASSES, 1, 2),
    POWER_BLAST_2(18, null, null, 3, if_pshot02, POWER_BLAST_1, null, ALL_CLASSES, 2, 2),
    POWER_BLAST_3(82, null, null, 7, if_pshot03, POWER_BLAST_1, POWER_BLAST_2, ALL_CLASSES, 3, 2),
    RAPID_SHOT_1(30, null, null, 0, if_rshot01, null, null, ALL_CLASSES, 1, 2),
    RAPID_SHOT_2(92, null, null, 3, if_rshot02, RAPID_SHOT_1, null, ALL_CLASSES, 2, 2),
    RAPID_SHOT_3(26, null, null, 7, if_rshot03, RAPID_SHOT_1, RAPID_SHOT_2, ALL_CLASSES, 3, 2),
    SNIPER_SHOT_1(31, null, null, 0, if_sshot01, null, null, ALL_CLASSES, 1, 2),
    SNIPER_SHOT_2(20, null, null, 3, if_sshot02, SNIPER_SHOT_1, null, ALL_CLASSES, 2, 2),
    SNIPER_SHOT_3(77, null, null, 7, if_sshot03, SNIPER_SHOT_1, SNIPER_SHOT_2, ALL_CLASSES, 3, 2),
    TWO_WEAPON_1(3, null, null, 0, if_2weap01, null, null, TWO_ARMS_ONLY, 1, 1),
    TWO_WEAPON_2(9, null, null, 3, if_2weap02, TWO_WEAPON_1, null, TWO_ARMS_ONLY, 2, 1),
    TWO_WEAPON_3(85, null, null, 7, if_2weap03, TWO_WEAPON_1, TWO_WEAPON_2, TWO_ARMS_ONLY, 3, 1),
    TOUGHNESS_1(169, null, null, 0, if_toughn01, null, null, ALL_CLASSES, 1, 6),
    TOUGHNESS_2(170, null, null, 3, if_toughn02, TOUGHNESS_1, null, ALL_CLASSES, 2, 6),
    TOUGHNESS_3(171, null, null, 7, if_toughn03, TOUGHNESS_1, TOUGHNESS_2, ALL_CLASSES, 3, 6),
    CONDITIONING_1(13, null, null, 0, if_fortitude, null, null, ALL_CLASSES, 1, 6),
    CONDITIONING_2(21, null, null, 3, if_ironwill, CONDITIONING_1, null, ALL_CLASSES, 2, 6),
    CONDITIONING_3(22, null, null, 7, if_lreflexes, CONDITIONING_1, CONDITIONING_2, ALL_CLASSES, 3, 6),
    JEDI_DEFENSE_1(55, null, null, 0, if_jedidef01, null, null, JEDI_ONLY, 1, 3),
    JEDI_DEFENSE_2(1, null, null, 3, if_jedidef02, JEDI_DEFENSE_1, null, JEDI_ONLY, 2, 3),
    JEDI_DEFENSE_3(24, null, null, 7, if_jedidef03, JEDI_DEFENSE_1, JEDI_DEFENSE_2, JEDI_ONLY, 3, 3),
    ;
    
    private final int index;
    private final RefString name;
    private final RefString description;
    private final int minLevel;
    private final Feat prereq1;
    private final Feat prereq2;
    private final Availability availability;
    private final int pips;
    private final int toolscategories;
    
    AdjustFeat(int index, RefString name, RefString description, int minLevel,
               Feat prereq1, Feat prereq2, Availability availability, int pips,
               int toolscategories) {
        
        this.index = index;
        this.name = name;
        this.description = description;
        this.minLevel = minLevel;
        this.prereq1 = prereq1;
        this.prereq2 = prereq2;
        this.availability = availability;
        this.pips = pips;
        this.toolscategories = toolscategories;
    }
    
    @Override
    public void updateRecord(TwodaRecord record) {
        
        NewFeat.standardFeatures(record, toString(), name, description, Icon.forFeat(this),
                toolscategories, pips);
        
        availability.adjustRecord(record);
        
        record.set("mincharlevel", (minLevel < 1) ? null : minLevel);
        record.set("prereqfeat1", (prereq1 == null) ? null : prereq1.getIndex());
        record.set("prereqfeat2", (prereq2 == null) ? null : prereq2.getIndex());
        
        for (AdjustFeat other : AdjustFeat.values()) {
            
            if (other.prereq2 == this) {
                record.set("successor", other.getIndex());
                break;
            }
            else if (other.prereq2 == null && other.prereq1 == this) {
                record.set("successor", other.getIndex());
                break;
            }
        }
    }
    
    @Override
    public int getIndex() {
        switch(this) {
            case POWER_ATTACK_1: return 28;
            case POWER_ATTACK_2: return 17;
            case POWER_ATTACK_3: return 83;
            case FLURRY_1: return 11;
            case FLURRY_2: return 91;
            case FLURRY_3: return 53;
            case CRITICAL_STRIKE_1: return 11;
            case CRITICAL_STRIKE_2: return 19;
            case CRITICAL_STRIKE_3: return 81;
            case POWER_BLAST_1: return 29;
            case POWER_BLAST_2: return 18;
            case POWER_BLAST_3: return 92;
            case RAPID_SHOT_1: return 30;
            case RAPID_SHOT_2: return 92;
            case RAPID_SHOT_3: return 26;
            case SNIPER_SHOT_1: return 31;
            case SNIPER_SHOT_2: return 20;
            case SNIPER_SHOT_3: return 77;
            case TWO_WEAPON_1: return 3;
            case TWO_WEAPON_2: return 9;
            case TWO_WEAPON_3: return 85;
            case CONDITIONING_1: return 13;
            case CONDITIONING_2: return 21;
            case CONDITIONING_3: return 22;
            case JEDI_DEFENSE_1: return 55;
            case JEDI_DEFENSE_2: return 1;
            case JEDI_DEFENSE_3: return 24;
            default: throw new IllegalStateException();
        }
    }
}
