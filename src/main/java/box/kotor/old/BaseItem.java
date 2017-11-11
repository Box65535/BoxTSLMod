package box.kotor.old;

import box.kotor.twoda.TwodaRecord;
import box.kotor.string.RefString;

import java.util.Arrays;
import java.util.List;

public interface BaseItem {
    
     List<String> HEADER = Arrays.asList(
            "name",
            "label",
            "equipableslots",
            "canrotateicon",
            "modeltype",
            "equipableslots",
            "canrotateicon",
            "modeltype",
            "itemclass",
            "genderspecific",
            "partenvmap",
            "defaultmodel",
            "defaulticon",
            "container",
            "weaponwield",
            "weapontype",
            "damageflags",
            "weaponsize",
            "rangedweapon",
            "maxattackrange",
            "prefattackdist",
            "minrange",
            "maxrange",
            "bloodcolr",
            "numdice",
            "dietoroll",
            "critthreat",
            "crithitmult",
            "basecost",
            "stacking",
            "itemmultiplier",
            "description",
            "invsoundtype",
            "maxprops",
            "minprops",
            "propcolumn",
            "reqfeat0",
            "reqfeat1",
            "reqfeat2",
            "reqfeat3",
            "reqfeat4",
            "ac_enchant",
            "baseac",
            "dexbonus",
            "accheck",
            "armorcheckpen",
            "baseitemstatref",
            "chargesstarting",
            "rotateonground",
            "tenthlbs",
            "weaponmattype",
            "ammunitiontype",
            "powereditem",
            "powerupsnd",
            "powerdownsnd",
            "poweredsnd",
            "itemtype",
            "bodyvar",
            "specfeat",
            "focfeat",
            "droidorhuman",
            "denysubrace",
            "armortype",
            "storepanelsort"
    );
    
    static TwodaRecord defaultRecord(RefString name, String label, String itemClass,
                                     String defaultModel, String defaultIcon,
                                     Integer invSoundType, Integer itemType,
                                     Integer storePanelSort) {
        
        TwodaRecord record = new TwodaRecord(HEADER);
        
        record.set("modeltype", 0);
        record.set("genderspecific", 0);
        record.set("partenvmap", 0);
        record.set("defaultmodel", "I_Null");
        record.set("container", 0);
        record.set("prefattackdist", 0.5f);
        record.set("minrange", 0);
        record.set("basecost", 1);
        record.set("stacking", 99);
        record.set("itemmultiplier", 1);
        record.set("maxprops", 8);
        record.set("minprops", 0);
        record.set("propcolumn", 0);
        record.set("ac_enchant", 0);
        record.set("baseac", 0);
        record.set("dexbonus", -1);
        record.set("accheck", 0);
        record.set("armorcheckpen", 0);
        record.set("chargesstarting", 0);
        record.set("rotateonground", 0);
        record.set("tenthlbs", 1);
        record.set("powereditem", 0);
        record.set("droidorhuman", 0);
        record.set("denysubrace", 0);
    
        record.set("name", name);
        record.set("label", label);
        record.set("itemClass", itemClass);
        record.set("defaultModel", defaultModel);
        record.set("defaultIcon", defaultIcon);
        record.set("invSoundType", invSoundType);
        record.set("itemType", itemType);
        record.set("storePanelSort", storePanelSort);
        
        return record;
    }
    
    void updateRecord(TwodaRecord record);
}
