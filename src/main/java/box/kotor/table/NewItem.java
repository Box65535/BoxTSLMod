package box.kotor.table;

import box.kotor.twoda.TwodaRecord;
import box.kotor.data.CSVReader;
import org.apache.commons.csv.CSVRecord;

public enum NewItem implements BaseItem {
    SHORT_SWORD_WEAK,
    LONG_SWORD_WEAK,
    QUARTERSTAFF_WEAK,
    DOUBLE_SWORD_WEAK,
    STUN_BATON_WEAK,
    FORCE_PIKE_WEAK,
    GAMMOREAN_AXE_WEAK,
    WOOKIE_WARBLADE_WEAK,
    GHAFFI_STICK_WEAK,
    VIBROBLADE_WEAK,
    VIBROSWORD_WEAK,
    VIBRODOUBLE_WEAK,
    SHORT_SWORD,
    LONG_SWORD,
    QUARTERSTAFF,
    DOUBLE_SWORD,
    STUN_BATON,
    FORCE_PIKE,
    GAMMOREAN_AXE,
    WOOKIE_WARBLADE,
    GHAFFI_STICK,
    VIBROBLADE,
    VIBROSWORD,
    VIBRODOUBLE,
    SHORT_SWORD_STRONG,
    LONG_SWORD_STRONG,
    QUARTERSTAFF_STRONG,
    DOUBLE_SWORD_STRONG,
    STUN_BATON_STRONG,
    FORCE_PIKE_STRONG,
    GAMMOREAN_AXE_STRONG,
    WOOKIE_WARBLADE_STRONG,
    GHAFFI_STICK_STRONG,
    VIBROBLADE_STRONG,
    VIBROSWORD_STRONG,
    VIBRODOUBLE_STRONG,
    MINING_PISTOL,
    MINING_DISRUPTOR,
    BLASTER_PISTOL_WEAK,
    LIGHT_PISTOL_WEAK,
    ION_PISTOL_WEAK,
    DISRUPTOR_PISTOL_WEAK,
    SONIC_PISTOL_WEAK,
    HEAVY_PISTOL_WEAK,
    HEAVY_DISRUPTOR_PISTOL_WEAK,
    BLASTER_RIFLE_WEAK,
    LIGHT_RIFLE_WEAK,
    ION_RIFLE_WEAK,
    DISRUPTOR_RIFLE_WEAK,
    SONIC_RIFLE_WEAK,
    BLASTER_REPEATER_WEAK,
    HVYDSR_REPEATER_WEAK,
    BLASTER_PISTOL,
    LIGHT_PISTOL,
    ION_PISTOL,
    DISRUPTOR_PISTOL,
    SONIC_PISTOL,
    HEAVY_PISTOL,
    HEAVYDSR_PISTOL,
    DARKPISTOL,
    BLASTER_RIFLE,
    LIGHT_RIFLE,
    ION_RIFLE,
    DISRUPTOR_RIFLE,
    SONIC_RIFLE,
    HEAVY_RIFLE,
    HVYDSR_RIFLE,
    BLASTER_REPEATER,
    LIGHT_REPEATER,
    ION_REPEATER,
    DISRUPTOR_REPEATER,
    SONIC_REPEATER,
    HEAVY_REPEATER,
    HVYDSR_REPEATER,
    BOWCASTER,
    ARMOR_1,
    ARMOR_2,
    ARMOR_3,
    ARMOR_4,
    ARMOR_5,
    FLIGHT_ARMOR,
    CLOTHING,
    JEDI_ROBE,
    KNIGHT_ROBE,
    JEDI_ARMOR,
    DROID_LIGHT_ARMOR_1,
    DROID_MEDIUM_ARMOR_1,
    DROID_HEAVY_ARMOR_1,
    DROID_LIGHT_ARMOR_2,
    DROID_MEDIUM_ARMOR_2,
    DROID_HEAVY_ARMOR_2,
    DROID_LIGHT_ARMOR_3,
    DROID_MEDIUM_ARMOR_3,
    DROID_HEAVY_ARMOR_3,
    ENERGY_SHIELD_1,
    ENERGY_SHIELD_2,
    STIMULANT_1,
    STIMULANT_2,
    BELT,
    STEALTH_BELT,
    IMPLANT_1,
    IMPLANT_2,
    IMPLANT_3,
    IMPLANT_UPGRADE_1,
    IMPLANT_UPGRADE_2,
    IMPLANT_UPGRADE_3,
    DROID_SHIELD_1,
    DROID_SHIELD_2,
    DROID_STEALTH,
    ENERGY_WEAPONS_1,
    ENERGY_WEAPONS_2,
    AUXILARY_LAUNCHER,
    GRENADE_LAUNCHER,
    ROCKET_LAUNCHER,
    AMMO_BOX,
    TURRET_CONTROLLER,
    TRAP_KIT,
    MINE_1,
    MINE_2,
    TURRET_1,
    TURRET_2,
    ENEMY_LAUNCHER,
    ENEMY_THROWER,
    ENEMY_SHIELD
    ;
    
    private static final CSVReader reader = new CSVReader();
    
    private final CSVRecord data;
    private int index;
    
    NewItem() {
        data = CSVReader.recordFor(this, CSVReader.BASEITEMS);
    }
    
    public void setIndex(int index) {
        this.index = index;
    }
    
    @Override
    public int getIndex() {
        return index;
    }
    
    public TwodaRecord newRecord() {
        TwodaRecord record = new TwodaRecord(BaseItem.HEADER);
        reader.setRecord(data);
        BaseItem.adjustRecord(record, reader);
        return record;
    }
}
