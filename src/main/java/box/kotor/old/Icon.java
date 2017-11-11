package box.kotor.old;

public enum Icon {
    if_pattack01,
    if_pattack02,
    if_pattack03,
    if_flurry01,
    if_flurry02,
    if_flurry03,
    if_crtstrk01,
    if_crtstrk02,
    if_crtstrk03,
    if_pshot01,
    if_pshot02,
    if_pshot03,
    if_rshot01,
    if_rshot02,
    if_rshot03,
    if_sshot01,
    if_sshot02,
    if_sshot03,
    if_2weap01,
    if_2weap02,
    if_2weap03,
    if_toughn01,
    if_toughn02,
    if_toughn03,
    if_fortitude,
    if_ironwill,
    if_lreflexes,
    if_jedidef01,
    if_jedidef02,
    if_jedidef03,
    ;
    
    public static Icon forFeat(AdjustFeat feat) {
        switch(feat) {
            case POWER_ATTACK_1: return Icon.if_pattack01;
            case POWER_ATTACK_2: return Icon.if_pattack02;
            case POWER_ATTACK_3: return Icon.if_pattack03;
            case FLURRY_1: return Icon.if_flurry01;
            case FLURRY_2: return Icon.if_flurry02;
            case FLURRY_3: return Icon.if_flurry03;
            case CRITICAL_STRIKE_1: return Icon.if_crtstrk01;
            case CRITICAL_STRIKE_2: return Icon.if_crtstrk02;
            case CRITICAL_STRIKE_3: return Icon.if_crtstrk03;
            case POWER_BLAST_1: return Icon.if_pshot01;
            case POWER_BLAST_2: return Icon.if_pshot02;
            case POWER_BLAST_3: return Icon.if_pshot03;
            case RAPID_SHOT_1: return Icon.if_rshot01;
            case RAPID_SHOT_2: return Icon.if_rshot02;
            case RAPID_SHOT_3: return Icon.if_rshot03;
            case SNIPER_SHOT_1: return Icon.if_sshot01;
            case SNIPER_SHOT_2: return Icon.if_sshot02;
            case SNIPER_SHOT_3: return Icon.if_sshot03;
            case TWO_WEAPON_1: return Icon.if_2weap01;
            case TWO_WEAPON_2: return Icon.if_2weap02;
            case TWO_WEAPON_3: return Icon.if_2weap03;
            case CONDITIONING_1: return Icon.if_fortitude;
            case CONDITIONING_2: return Icon.if_ironwill;
            case CONDITIONING_3: return Icon.if_lreflexes;
            case TOUGHNESS_1: return Icon.if_toughn01;
            case TOUGHNESS_2: return Icon.if_toughn02;
            case TOUGHNESS_3: return Icon.if_toughn03;
            case JEDI_DEFENSE_1: return Icon.if_jedidef01;
            case JEDI_DEFENSE_2: return Icon.if_jedidef02;
            case JEDI_DEFENSE_3: return Icon.if_jedidef03;
            default: throw new IllegalStateException();
        }
    }
}
