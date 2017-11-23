package box.kotor.item;

import box.kotor.gff.GffFile;
import box.kotor.data.CSVReader;
import org.apache.commons.csv.CSVRecord;

import static box.kotor.item.Property.*;

public enum Item {
    ha_atton(PIERCING_RESIST_2, SLASHING_RESIST_2, SAVES_BONUS_1),
    ha_mira(PIERCING_RESIST_2, SLASHING_RESIST_2, PIERCING_IMMUNITY_20, SLASHING_IMMUNITY_20),
    ha_miner,
    ha_repub1(PIERCING_RESIST_2, SLASHING_RESIST_2, ENERGY_RESIST_2, ION_RESIST_2, FIRE_RESIST_2),
    ha_zabrak1(PIERCING_RESIST_2, SLASHING_RESIST_2, FIRE_RESIST_2, FIRE_SAVE_BONUS_3, COLD_SAVE_BONUS_3),
    ha_echani1(ENERGY_RESIST_2, ION_RESIST_2, FIRE_RESIST_2, SONIC_RESIST_2, MAX_DEX_BONUS_2),
    ha_massas1(ENERGY_RESIST_2, ION_RESIST_2, FEAR_IMMUNITY),
    ha_repub2(PIERCING_RESIST_4, SLASHING_RESIST_4, ENERGY_RESIST_4, ION_RESIST_4, FIRE_RESIST_4),
    ha_zabrak2(PIERCING_RESIST_4, SLASHING_RESIST_4, FIRE_RESIST_4, FIRE_IMMUNITY_30, COLD_IMMUNITY_30, FIRE_SAVE_BONUS_3, COLD_SAVE_BONUS_3),
    ha_sith2(PIERCING_RESIST_2, SLASHING_RESIST_2, ENERGY_RESIST_2, ION_RESIST_2, FIRE_RESIST_2, SONIC_RESIST_2, POISON_SAVE_BONUS_2),
    ;
    
    private static final CSVReader reader = new CSVReader();
    
    private final CSVRecord data;
    private final Property[] properties;
    
    Item(Property... properties) {
        this.data = CSVReader.recordFor(this, CSVReader.ITEMS);
        this.properties = properties;
    }
    
    public GffFile toFile() {
        return null; // TODO
    }
}
