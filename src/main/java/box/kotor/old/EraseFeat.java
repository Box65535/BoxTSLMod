package box.kotor.old;

import box.kotor.twoda.TwodaRecord;

public enum EraseFeat implements ReplaceFeat {
    
    ;
    
    private final int index;
    
    EraseFeat(int index) {
        this.index = index;
    }
    
    @Override
    public void updateRecord(TwodaRecord record) {
        Feat.makeUnused(record);
    }
    
    @Override
    public int getIndex() {
        return index;
    }
}
