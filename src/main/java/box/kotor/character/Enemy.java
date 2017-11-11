package box.kotor.character;

import box.kotor.gff.GffFile;
import box.kotor.data.Module;
import box.kotor.item.Item;
import box.kotor.data.CSVReader;
import org.apache.commons.csv.CSVRecord;

public enum Enemy {
    ;
    
    private static final CSVReader reader = new CSVReader();
    
    private final CSVRecord data;
    private final Module module;
    private final Item[] loot;
    
    Enemy(Item... loot) {
        this.data = CSVReader.recordFor(this, CSVReader.ENEMIES);
        this.module = Module.valueOf(data.get(1));
        this.loot = loot;
    }
    
    public void adjust(GffFile file) {
        // TODO
    }
    
    public Module getModule() {
        return module;
    }
    
    public String getResRef() {
        return toString();
    }
}
