package box.kotor.table;

import box.kotor.twoda.TwodaRecord;
import box.kotor.data.CSVReader;
import org.apache.commons.csv.CSVRecord;

public enum NewFeat implements Feat {
    ARMOR_2,
    ARMOR_3,
    ARMOR_5,
    DROID_ARMOR_2,
    DROID_ARMOR_3,
    BLASTERS_2,
    BLASTERS_3,
    MELEE_2,
    MELEE_3,
    GRENADE_LAUNCHERS,
    ROCKET_LAUNCHERS,
    ENERGY_WEAPONS_2,
    IMPLANTS_2,
    IMPLANTS_3,
    ENERGY_SHIELDS_2,
    STIMULANTS_2,
    TURRETS_2,
    MINES_2,
    FRAG_GRENADE,
    FLASH_GRENADE,
    POISON_GRENADE,
    NERVE_GRENADE,
    SONIC_GRENADE_1,
    SONIC_GRENADE_2,
    COLD_GRENADE,
    ADHESIVE_GRENADE,
    PLASMA_GRENADE,
    ION_GRENADE,
    EXPLOSIVE_ROCKET,
    INDENDIARY_ROCKET,
    BUSTER_ROCKET_1,
    BUSTER_ROCKET_2,
    PLASMA_ROCKET,
    RADIATION_ROCKET,
    COLD_ROCKET,
    ALT_COLD_ROCKET,
    THERMAL_DETONATOR,
    FUSION_ROCKET,
    PERAGUS_FUEL,
    FLAMETHROWER,
    CARBONITE,
    ENERGY_FUEL,
    GRAPPLING_HOOK,
    DARTS
    ;
    
    private static final CSVReader reader = new CSVReader();
    
    private final CSVRecord data;
    private int index;
    
    NewFeat() {
        data = CSVReader.recordFor(this, CSVReader.FEATS);
    }
    
    public void setIndex(int index) {
        this.index = index;
    }
    
    @Override
    public int getIndex() {
        return index;
    }
    
    public TwodaRecord newRecord() {
        TwodaRecord record = new TwodaRecord(Feat.HEADER);
        reader.setRecord(data);
        Feat.adjustRecord(record, reader);
        return record;
    }
}
