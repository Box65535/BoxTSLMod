package box.kotor.table;

import box.kotor.twoda.TwodaRecord;
import box.kotor.data.CSVReader;
import org.apache.commons.csv.CSVRecord;

import java.util.Arrays;
import java.util.List;

public enum Poison {
    POISON_EDGE_1,
    POISON_EDGE_2,
    POISON_EDGE_3,
    POISON_TWILEK,
    POISON_RODIAN,
    POISON_SITH_SWORD_1,
    POISON_MINE_1,
    POISON_MINE_2,
    POISON_MINE_3,
    POISON_MINE_4,
    POISON_MINE_5,
    ;
    
    private static final CSVReader reader = new CSVReader();
    
    private final CSVRecord data;
    private int index;
    
    Poison() {
        data = CSVReader.recordFor(this, CSVReader.POISONS);
    }
    
    public TwodaRecord newRecord() {
        
        TwodaRecord record = new TwodaRecord(HEADER);
        reader.setRecord(data);
        
        record.set("label", "BOX_" + reader.readString());
        record.set("dc_save", reader.readInt());
        record.set("duration", reader.readInt());
        record.set("period", reader.readInt());
        record.set("dam_hp", reader.readInt());
        record.set("dam_fp", reader.readInt());
        record.set("dam_str", reader.readInt());
        record.set("dam_dex", reader.readInt());
        record.set("dam_con", reader.readInt());
        record.set("dam_int", reader.readInt());
        record.set("dam_wis", reader.readInt());
        record.set("dam_chr", reader.readInt());
        record.set("name", reader.readStrRef());
        record.set("abil_dur", reader.readInt());
        
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
            "dc_save",
            "duration",
            "period",
            "dam_hp",
            "dam_fp",
            "dam_str",
            "dam_dex",
            "dam_con",
            "dam_int",
            "dam_wis",
            "dam_chr",
            "name",
            "abil_dur"
    );
}
