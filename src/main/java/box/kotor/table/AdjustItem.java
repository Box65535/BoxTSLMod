package box.kotor.table;

import box.kotor.twoda.TwodaRecord;
import box.kotor.data.CSVReader;
import org.apache.commons.csv.CSVRecord;

public enum AdjustItem implements BaseItem {
    LIGHTSABER,
    SHORT_LIGHTSABER,
    DOUBLE_LIGHTSABER
    ;
    
    private static final CSVReader reader = new CSVReader();
    
    private final CSVRecord data;
    private int index;
    
    AdjustItem() {
        data = CSVReader.recordFor(this, CSVReader.OLDBASEITEMS);
        index = Integer.parseInt(data.get(1));
    }
    
    @Override
    public int getIndex() {
        return index;
    }
    
    public void adjustRecord(TwodaRecord record) {
        reader.setRecord(data);
        BaseItem.adjustRecord(record, reader);
    }
}
