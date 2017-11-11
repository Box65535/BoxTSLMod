package box.kotor.table;

import box.kotor.twoda.TwodaRecord;
import box.kotor.data.CSVReader;

import java.util.Arrays;
import java.util.List;

public interface Feat {
    
    int getIndex();
    
    static void adjustRecord(TwodaRecord record, CSVReader reader) {
        
        record.set("label", "BOX_" + reader.readString());
        
        reader.skip();
        
        record.set("name", reader.readStrRef());
        record.set("description", reader.readStrRef());
        record.set("icon", reader.readString());
        record.set("mincharlevel", reader.readInt());
        record.set("minattackbonus", reader.readInt());
        record.set("minstr", reader.readInt());
        record.set("mindex", reader.readInt());
        record.set("minint", reader.readInt());
        record.set("minwis", reader.readInt());
        record.set("minspelllvl", reader.readInt());
        record.set("prereqfeat1", reader.readFeat());
        record.set("prereqfeat2", reader.readFeat());
        record.set("gainmultiple", reader.readInt());
        record.set("effectsstack", reader.readInt());
        record.set("allclassescanuse", reader.readInt());
        record.set("category", reader.readHexInt());
        record.set("maxcr", reader.readInt());
        record.set("spellid", reader.readInt());
        record.set("successor", reader.readFeat());
        record.set("crvalue", reader.readInt());
        record.set("usesperday", reader.readInt());
        record.set("masterfeat", reader.readInt());
        record.set("targetself", reader.readInt());
        record.set("orreqfeat0", reader.readFeat());
        record.set("orreqfeat1", reader.readFeat());
        record.set("orreqfeat2", reader.readFeat());
        record.set("orreqfeat3", reader.readFeat());
        record.set("orreqfeat4", reader.readFeat());
        record.set("reqskill", reader.readInt());
        record.set("toolscategories", reader.readInt());
        record.set("hostilefeat", reader.readInt());
        reader.skip();
        record.set("scd_list", reader.readInt());
        record.set("sol_list", reader.readInt());
        record.set("sct_list", reader.readInt());
        record.set("tec_list", reader.readInt());
        record.set("drx_list", reader.readInt());
        record.set("drc_list", reader.readInt());
        record.set("jcn_list", reader.readInt());
        record.set("jgd_list", reader.readInt());
        record.set("jsn_list", reader.readInt());
        record.set("sas_list", reader.readInt());
        record.set("sld_list", reader.readInt());
        record.set("sma_list", reader.readInt());
        record.set("jwa_list", reader.readInt());
        record.set("jma_list", reader.readInt());
        record.set("jwm_list", reader.readInt());
        reader.skip();
        record.set("jcn_pc_granted", reader.readInt());
        record.set("jgd_pc_granted", reader.readInt());
        record.set("jsn_pc_granted", reader.readInt());
        record.set("scd_granted", reader.readInt());
        record.set("sol_granted", reader.readInt());
        record.set("sct_granted", reader.readInt());
        record.set("tec_granted", reader.readInt());
        record.set("drx_granted", reader.readInt());
        record.set("drc_granted", reader.readInt());
        record.set("jcn_granted", reader.readInt());
        record.set("jgd_granted", reader.readInt());
        record.set("jsn_granted", reader.readInt());
        record.set("sas_granted", reader.readInt());
        record.set("sld_granted", reader.readInt());
        record.set("sma_granted", reader.readInt());
        record.set("jwa_granted", reader.readInt());
        record.set("jma_granted", reader.readInt());
        record.set("jwm_granted", reader.readInt());
        reader.skip();
        record.set("handmaiden", reader.readInt());
        record.set("baodur", reader.readInt());
        record.set("hanharr", reader.readInt());
        record.set("hk47", reader.readInt());
        record.set("g0t0", reader.readInt());
        record.set("atton", reader.readInt());
        record.set("kriea", reader.readInt());
        record.set("exclusion", reader.readHexInt());
        record.set("usetype", reader.readInt());
        record.set("pips", reader.readInt());
        
        record.set("scd_recom", null);
        record.set("sol_recom", null);
        record.set("sct_recom", null);
        record.set("tec_recom", null);
        record.set("drx_recom", null);
        record.set("drc_recom", null);
        record.set("jcn_recom", null);
        record.set("jgd_recom", null);
        record.set("jsn_recom", null);
        record.set("sas_recom", null);
        record.set("sld_recom", null);
        record.set("sma_recom", null);
        record.set("jwa_recom", null);
        record.set("jma_recom", null);
        record.set("jwm_recom", null);
    }
    
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
}
