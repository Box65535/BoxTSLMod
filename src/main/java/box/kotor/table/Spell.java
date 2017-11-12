package box.kotor.table;

import box.kotor.twoda.TwodaRecord;
import box.kotor.data.CSVReader;

import java.util.Arrays;
import java.util.List;

public interface Spell {
    
    int getIndex();
    
    static void adjustRecord(TwodaRecord record, CSVReader reader) {
        
        record.set("label", "BOX_" + reader.readString());
        reader.skip();
        
        record.set("name", reader.readStrRef());
        record.set("spelldesc", reader.readStrRef());
        record.set("forcepoints", reader.readInt());
        record.set("goodevil", reader.readString());
        record.set("usertype", reader.readInt());
        
        Integer prereq1 = reader.readSpell();
        Integer prereq2 = reader.readSpell();
        
        if (prereq1 == null && prereq2 == null)
            record.set("prerequisites", null);
        else if (prereq1 == null)
            record.set("prerequisites", prereq2);
        else if (prereq2 == null)
            record.set("prerequisites", prereq1);
        else
            record.set("prerequisites", prereq1.toString() + "_" + prereq2.toString());
        
        record.set("masterspell", reader.readString());
        int levelreq = reader.readInt();
        record.set("guardian", levelreq);
        record.set("consular", levelreq);
        record.set("sentinel", levelreq);
        record.set("weapmstr", levelreq);
        record.set("jedimaster", levelreq);
        record.set("watchman", levelreq);
        record.set("sithlord", levelreq);
        record.set("assassin", levelreq);
        record.set("inate", levelreq);
        record.set("maxcr", reader.readInt());
        record.set("category", reader.readHexInt());
        record.set("range", reader.readString());
        record.set("iconresref", reader.readString());
        record.set("impactscript", reader.readScript());
        record.set("conjtime", reader.readInt());
        record.set("conjanim", reader.readString());
        record.set("conjheadvisual", reader.readString());
        record.set("conjhandvisual", reader.readString());
        record.set("conjgrndvisual", reader.readString());
        record.set("conjsoundvfx", reader.readString());
        record.set("conjsoundmale", reader.readString());
        record.set("conjsoundfemale", reader.readString());
        record.set("castanim", reader.readString());
        record.set("casttime", reader.readInt());
        record.set("castheadvisual", reader.readString());
        record.set("casthandvisual", reader.readString());
        record.set("castgrndvisual", reader.readString());
        record.set("castsound", reader.readString());
        record.set("catchtime", reader.readInt());
        record.set("catchanim", reader.readString());
        record.set("proj", reader.readInt());
        record.set("projmodel", reader.readString());
        record.set("projtype", reader.readString());
        record.set("projspwnpoint", reader.readString());
        record.set("projsound", reader.readString());
        record.set("projorientation", reader.readString());
        record.set("immunitytype", reader.readString());
        record.set("itemimmunity", reader.readInt());
        record.set("forcehostile", reader.readForceHostile());
        record.set("forcefriendly", reader.readForceFriendly());
        record.set("forcepassive", reader.readInt()); // Good thing we don't use this
        record.set("forcepriority", reader.readInt());
        record.set("dark_recom", null);
        record.set("light_recom", null);
        record.set("exclusion", reader.readHexInt());
        record.set("requireitemmask", reader.readHexInt());
        record.set("forbiditemmask", reader.readHexInt());
        record.set("pips", reader.readInt());
        record.set("itemtargeting", reader.readInt());
        record.set("hostilesetting", reader.readInt());
        record.set("formmask", reader.readHexInt());
    }
    
    static int nextForceHostile() {
        return 0; // TODO
    }
    
    static int nextForceFriendly() {
        return 0; // TODO
    }
    
    List<String> HEADER = Arrays.asList(
            "label",
            "name",
            "spelldesc",
            "forcepoints",
            "goodevil",
            "usertype",
            "prerequisites",
            "masterspell",
            "guardian",
            "consular",
            "sentinel",
            "weapmstr",
            "jedimaster",
            "watchman",
            "sithlord",
            "assassin",
            "inate",
            "maxcr",
            "category",
            "range",
            "iconresref",
            "impactscript",
            "conjtime",
            "conjanim",
            "conjheadvisual",
            "conjhandvisual",
            "conjgrndvisual",
            "conjsoundvfx",
            "conjsoundmale",
            "conjsoundfemale",
            "castanim",
            "casttime",
            "castheadvisual",
            "casthandvisual",
            "castgrndvisual",
            "castsound",
            "catchtime",
            "catchanim",
            "proj",
            "projmodel",
            "projtype",
            "projspwnpoint",
            "projsound",
            "projorientation",
            "immunitytype",
            "itemimmunity",
            "forcehostile",
            "forcefriendly",
            "forcepassive",
            "forcepriority",
            "dark_recom",
            "light_recom",
            "exclusion",
            "requireitemmask",
            "forbiditemmask",
            "pips",
            "itemtargeting",
            "hostilesetting",
            "formask"
    );
}
