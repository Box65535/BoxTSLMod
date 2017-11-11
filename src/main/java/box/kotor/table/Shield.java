package box.kotor.table;

import box.kotor.twoda.TwodaRecord;
import box.kotor.data.CSVReader;
import org.apache.commons.csv.CSVRecord;

import java.util.Arrays;
import java.util.List;

public enum Shield {
    PERAGUS_MINING_SHIELD,
    ENERGY_SHIELD,
    ENVIRONMENT_SHIELD,
    SITH_SHIELD,
    MANDALORIAN_SHIELD,
    ECHANI_SHIELD,
    BAODUR_SHIELD,
    DROID_ENERGY_SHIELD,
    DROID_ENVIRONMENT_SHIELD,
    ADVANCED_SHIELD,
    RADIANT_SHIELD,
    UNIVERSAL_SHIELD,
    ;
    
    private static final CSVReader reader = new CSVReader();
    
    private final CSVRecord data;
    private int index;
    
    Shield() {
        data = CSVReader.recordFor(this, CSVReader.SHIELDS);
    }
    
    public TwodaRecord newRecord() {
        
        TwodaRecord record = new TwodaRecord(HEADER);
        reader.setRecord(data);
        
        record.set("label", "BOX_" + reader.readString());
        record.set("visualeffectdef", reader.readString());
        record.set("defaultradius", reader.readInt());
        record.set("damageflags", reader.readInt());
        record.set("vulnerflags", reader.readInt());
        record.set("resistance", reader.readInt());
        record.set("amount", reader.readInt());
        record.set("permanent", reader.readInt());
        record.set("appearance_01", reader.readInt());
        record.set("visualeffect_01", reader.readInt());
        record.set("radius_01", reader.readFloat());
        record.set("appearance_02", reader.readInt());
        record.set("visualeffect_02", reader.readInt());
        record.set("radius_02", reader.readFloat());
        record.set("appearance_03", reader.readInt());
        record.set("visualeffect_03", reader.readInt());
        record.set("radius_03", reader.readFloat());
        record.set("appearance_04", reader.readInt());
        record.set("visualeffect_04", reader.readInt());
        record.set("radius_04", reader.readFloat());
        
        return record;
    }
    
    public void setIndex(int index) {
        this.index = index;
    }
    
    public int getIndex() {
        return index;
    }
    
    public static final List<String> HEADER = Arrays.asList(
            "label",
            "visualeffectdef",
            "defaultradius",
            "damageflags",
            "vulnerflags",
            "resistance",
            "amount",
            "permanent",
            "appearance_01",
            "visualeffect_01",
            "radius_01",
            "appearance_02",
            "visualeffect_02",
            "radius_02",
            "appearance_03",
            "visualeffect_03",
            "radius_03",
            "appearance_04",
            "visualeffect_04",
            "radius_04"
    );
}
