package box.kotor.table;

import box.kotor.twoda.TwodaRecord;
import box.kotor.data.CSVReader;
import org.apache.commons.csv.CSVRecord;

public enum AdjustSpell implements Spell {
    ;
    
    private static final CSVReader reader = new CSVReader();
    
    private final CSVRecord data;
    private int index;
    
    AdjustSpell() {
        data = CSVReader.recordFor(this, CSVReader.OLDSPELLS);
        index = Integer.parseInt(data.get(1));
    }
    
    @Override
    public int getIndex() {
        return index;
    }
    
    public void adjustRecord(TwodaRecord record) {
        reader.setRecord(data);
        Spell.adjustRecord(record, reader);
    }
}
