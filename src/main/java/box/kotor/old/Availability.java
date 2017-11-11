package box.kotor.old;

import box.kotor.twoda.TwodaRecord;

import java.util.function.Consumer;

enum Availability {
    
    NOT_AVAILABLE(Availability::notAvailable),
    GRANTED_ONLY(Availability::grantedOnly),
    ALL_CLASSES(Availability::allClasses),
    NON_DROID(Availability::nonDroid),
    HUMAN_OR_BAODUR(Availability::humanOrBaodur),
    HUMAN_ONLY(Availability::humanOnly),
    DROID_ONLY(Availability::droidOnly),
    JEDI_ONLY(Availability::jediOnly),
    TWO_ARMS_ONLY(Availability::twoArmsOnly),
    ;
    
    private final Consumer<TwodaRecord> adjust;
    
    Availability(Consumer<TwodaRecord> adjust) {
        this.adjust = adjust;
    }
    
    public void adjustRecord(TwodaRecord record) {
        adjust.accept(record);
    }
    
    private static void notAvailable(TwodaRecord record) {
        
        setClassLists(record, 4);
        setCharacters(record, 0);
    }
    
    private static void grantedOnly(TwodaRecord record) {
        
        setClassLists(record, 3);
        setCharacters(record, 0);
    }
    
    private static void allClasses(TwodaRecord record) {
        
        setClassLists(record, 1);
        setCharacters(record, 0);
    }
    
    private static void nonDroid(TwodaRecord record) {
        
        allClasses(record);
        record.set("drx_list", 4);
        record.set("drc_list", 4);
    }
    
    private static void droidOnly(TwodaRecord record) {
        
        notAvailable(record);
        record.set("drx_list", 1);
        record.set("drc_list", 1);
    }
    
    private static void humanOrBaodur(TwodaRecord record) {
        
        nonDroid(record);
        record.set("hanharr", 255);
    }
    
    private static void humanOnly(TwodaRecord record) {
        
        nonDroid(record);
        record.set("hanharr", 255);
        record.set("baodur", 255);
    }
    
    private static void jediOnly(TwodaRecord record) {
    
        record.set("scd_list", 4);
        record.set("sol_list", 4);
        record.set("sct_list", 4);
        record.set("sld_list", 1);
        record.set("sma_list", 1);
        record.set("sas_list", 1);
        record.set("jcn_list", 1);
        record.set("jgd_list", 1);
        record.set("jsn_list", 1);
        record.set("jma_list", 1);
        record.set("jwm_list", 1);
        record.set("jwa_list", 1);
        record.set("drx_list", 4);
        record.set("drc_list", 4);
        record.set("tec_list", 4);
        setCharacters(record, 0);
    }
    
    private static void twoArmsOnly(TwodaRecord record) {
        
        allClasses(record);
        record.set("kriea", 255);
    }
    
    private static void setClassLists(TwodaRecord record, int value) {
        
        record.set("scd_list", value);
        record.set("sol_list", value);
        record.set("sct_list", value);
        record.set("sld_list", value);
        record.set("sma_list", value);
        record.set("sas_list", value);
        record.set("jcn_list", value);
        record.set("jgd_list", value);
        record.set("jsn_list", value);
        record.set("jma_list", value);
        record.set("jwm_list", value);
        record.set("jwa_list", value);
        record.set("drx_list", value);
        record.set("drc_list", value);
        record.set("tec_list", value);
    }
    
    private static void setCharacters(TwodaRecord record, int value) {
        
        record.set("handmaiden", value);
        record.set("baodur", value);
        record.set("hanharr", value);
        record.set("hk47", value);
        record.set("g0t0", value);
        record.set("atton", value);
        record.set("kriea", value);
    }
}
