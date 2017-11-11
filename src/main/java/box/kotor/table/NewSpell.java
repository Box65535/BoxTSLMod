package box.kotor.table;

import box.kotor.twoda.TwodaRecord;
import box.kotor.data.CSVReader;
import org.apache.commons.csv.CSVRecord;

public enum NewSpell implements Spell {
    ;
    
    private static final CSVReader reader = new CSVReader();
    
    private final CSVRecord data;
    private int index;
    
    NewSpell() {
        data = CSVReader.recordFor(this, CSVReader.SPELLS);
    }
    
    public void setIndex(int index) {
        this.index = index;
    }
    
    @Override
    public int getIndex() {
        return index;
    }
    
    public TwodaRecord newRecord() {
        TwodaRecord record = new TwodaRecord(Spell.HEADER);
        reader.setRecord(data);
        Spell.adjustRecord(record, reader);
        return record;
    }
}
