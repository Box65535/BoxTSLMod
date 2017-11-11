package box.kotor.old;

import box.kotor.twoda.TwodaRecord;

import java.util.Arrays;
import java.util.List;

public interface Feat {
    
    List<String> HEADER = Arrays.asList(
           "label",
            "name",
            "description",
            "icon",
            "mincharlevel",
            "minattackbonus",
            "minstr",
            "mindex",
            "minint",
            "minwis",
            "minspelllvl",
            "prereqfeat1",
            "prereqfeat2",
            "gainmultiple",
            "effectsstack",
            "allclassescanuse",
            "category",
            "maxcr",
            "spellid",
            "successor",
            "crvalue",
            "usesperday",
            "masterfeat",
            "targetself",
            "orreqfeat0",
            "orreqfeat1",
            "orreqfeat2",
            "orreqfeat3",
            "orreqfeat4",
            "reqskill",
            "constant",
            "toolscategories",
            "hostilefeat",
            "scd_list",
            "scd_granted",
            "scd_recom",
            "sol_list",
            "sol_granted",
            "sol_recom",
            "sct_list",
            "sct_granted",
            "sct_recom",
            "jcn_list",
            "jcn_granted",
            "jcn_pc_granted",
            "jcn_recom",
            "jgd_list",
            "jgd_granted",
            "jgd_pc_granted",
            "jgd_recom",
            "jsn_list",
            "jsn_granted",
            "jsn_pc_granted",
            "jsn_recom",
            "sas_list",
            "sas_granted",
            "sas_recom",
            "sld_list",
            "sld_granted",
            "sld_recom",
            "sma_list",
            "sma_granted",
            "sma_recom",
            "jwa_list",
            "jwa_granted",
            "jwa_recom",
            "jma_list",
            "jma_granted",
            "jma_recom",
            "jwm_list",
            "jwm_granted",
            "jwm_recom",
            "tec_list",
            "tec_granted",
            "tec_recom",
            "drx_list",
            "drx_granted",
            "drx_recom",
            "drc_list",
            "drc_granted",
            "drc_recom",
            "handmaiden",
            "baodur",
            "hk47",
            "g0t0",
            "atton",
            "kriea",
            "exclusion",
            "usetype",
            "pips"
    );
    
    static TwodaRecord defaultRecord() {
        
        TwodaRecord record = new TwodaRecord(HEADER);
        
        record.set("gainmultiple", 0);
        record.set("effectsstack", 0);
        record.set("allclassescanuse", 1);
        record.set("hostilefeat", 0);
        makeUnused(record);
        
        return record;
    }
    
    static void makeUnused(TwodaRecord record) {
    
        record.set("scd_list", 4);
        record.set("scd_granted", -1);
        record.set("scd_recom", null);
        record.set("sct_list", 4);
        record.set("sct_granted", -1);
        record.set("sct_recom", null);
        record.set("sol_list", 4);
        record.set("sol_granted", -1);
        record.set("sol_recom", null);
        record.set("sma_list", 4);
        record.set("sma_granted", -1);
        record.set("sma_recom", null);
        record.set("sas_list", 4);
        record.set("sas_granted", -1);
        record.set("sas_recom", null);
        record.set("sld_list", 4);
        record.set("sld_granted", -1);
        record.set("sld_recom", null);
        record.set("jma_list", 4);
        record.set("jma_granted", -1);
        record.set("jma_recom", null);
        record.set("jwa_list", 4);
        record.set("jwa_granted", -1);
        record.set("jwa_recom", null);
        record.set("jwm_list", 4);
        record.set("jwm_granted", -1);
        record.set("jwm_recom", null);
        record.set("tec_list", 4);
        record.set("tec_granted", -1);
        record.set("tec_recom", null);
        record.set("drx_list", 4);
        record.set("drx_granted", -1);
        record.set("drx_recom", null);
        record.set("drc_list", 4);
        record.set("drc_granted", -1);
        record.set("drc_recom", null);
        record.set("jcn_list", 4);
        record.set("jcn_granted", -1);
        record.set("jcn_pc_granted", -1);
        record.set("jcn_recom", null);
        record.set("jsn_list", 4);
        record.set("jsn_granted", -1);
        record.set("jsn_pc_granted", -1);
        record.set("jsn_recom", null);
        record.set("jgd_list", 4);
        record.set("jgd_granted", -1);
        record.set("jgd_pc_granted", -1);
        record.set("jgd_recom", null);
        record.set("handmaiden", 0);
        record.set("baodur", 0);
        record.set("hanharr", 0);
        record.set("hk47", 0);
        record.set("g0t0", 0);
        record.set("atton", 0);
        record.set("kriea", 0);
    }
    
    int getIndex();
    
}
