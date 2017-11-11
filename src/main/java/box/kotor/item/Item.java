package box.kotor.item;

import box.kotor.gff.GffFile;
import box.kotor.data.CSVReader;
import org.apache.commons.csv.CSVRecord;

public enum Item {
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
