package box.kotor.old;

import box.kotor.twoda.TwodaRecord;
import box.kotor.string.RefString;

public interface NewFeat {
    
    static void standardFeatures(TwodaRecord record, String label, RefString name,
                                 RefString description, Icon icon,
                                 int toolscategories, int pips) {
        
        record.set("label", label);
        record.set("name", name.getStrRef());
        record.set("description", description.getStrRef());
        record.set("icon", icon.toString());
        record.set("toolscategories", toolscategories);
        record.set("pips", pips);
    }
    
    TwodaRecord newRecord();
}
