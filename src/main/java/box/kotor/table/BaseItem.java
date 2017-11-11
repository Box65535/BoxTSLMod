package box.kotor.table;

import box.kotor.twoda.TwodaRecord;
import box.kotor.data.CSVReader;

import java.util.Arrays;
import java.util.List;

public interface BaseItem {
    
    int getIndex();
    
    static void adjustRecord(TwodaRecord record, CSVReader reader) {
        
        record.set("label", "BOX_" + reader.readString());
        reader.skip();
        record.set("name", reader.readStrRef());
        record.set("description", reader.readStrRef());
        record.set("equipableslots", reader.readHexInt());
        record.set("canrotateicon", reader.readHexInt());
        record.set("modeltype", reader.readInt());
        record.set("itemclass", reader.readString());
        record.set("genderspecific", reader.readInt());
        record.set("partenvmap", reader.readInt());
        record.set("defaulticon", reader.readString());
        record.set("container", reader.readInt());
        record.set("weaponwield", reader.readInt());
        record.set("weapontype", reader.readInt());
        record.set("damageflags", reader.readInt());
        record.set("weaponsize", reader.readInt());
        record.set("rangedweapon", reader.readInt());
        record.set("maxattackrange", reader.readInt());
        record.set("prefattackdist", reader.readFloat());
        record.set("bloodcolr", reader.readString());
        record.set("numdice", reader.readInt());
        record.set("dietoroll", reader.readInt());
        record.set("critthreat", reader.readInt());
        record.set("crithitmult", reader.readInt());
        record.set("basecost", reader.readFloat());
        record.set("stacking", reader.readInt());
        record.set("itemmultiplier", reader.readInt());
        record.set("invsoundtype", reader.readInt());
        record.set("maxprops", reader.readInt());
        record.set("minprops", reader.readInt());
        record.set("propcolumn", reader.readInt());
        record.set("reqfeat0", reader.readFeat());
        record.set("reqfeat1", reader.readFeat());
        record.set("reqfeat2", reader.readFeat());
        record.set("reqfeat3", reader.readFeat());
        record.set("reqfeat4", reader.readFeat());
        record.set("ac_enchant", reader.readInt());
        record.set("baseac", reader.readInt());
        record.set("dexbonus", reader.readInt());
        record.set("accheck", reader.readInt());
        record.set("armorcheckpen", reader.readInt());
        record.set("baseitemstatref", reader.readString());
        record.set("chargesstarting", reader.readInt());
        record.set("rotateonground", reader.readInt());
        record.set("tenthlbs", reader.readInt());
        record.set("weaponmattype", reader.readInt());
        record.set("ammunitiontype", reader.readInt());
        record.set("powereditem", reader.readInt());
        record.set("powerupsnd", reader.readString());
        record.set("powerdownsnd", reader.readString());
        record.set("poweredsnd", reader.readString());
        record.set("itemtype", reader.readInt());
        record.set("bodyvar", reader.readInt());
        record.set("specfeat", reader.readFeat());
        record.set("focfeat", reader.readFeat());
        record.set("droidorhuman", reader.readInt());
        record.set("denysubrace", reader.readHexInt());
        record.set("armortype", reader.readString());
        record.set("storepanelsort", reader.readInt());
    }
    
    List<String> HEADER = Arrays.asList(
            "name",
            "label",
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
            "itemtype",
            "bodyvar",
            "specfeat",
            "focfeat",
            "droidorhuman",
            "denysubrace",
            "armortype",
            "storepanelsort"
    );
}
