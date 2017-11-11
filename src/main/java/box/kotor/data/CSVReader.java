package box.kotor.data;

import box.kotor.script.Script;
import box.kotor.string.RefString;
import box.kotor.table.AdjustFeat;
import box.kotor.table.AdjustItem;
import box.kotor.table.AdjustSpell;
import box.kotor.table.BaseItem;
import box.kotor.table.Feat;
import box.kotor.table.NewFeat;
import box.kotor.table.NewItem;
import box.kotor.table.NewSpell;
import box.kotor.table.Spell;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Collections;
import java.util.List;

public class CSVReader {
    
    private CSVRecord record;
    private int index;
    
    public void setRecord(CSVRecord record) {
        this.record = record;
        this.index = 0;
    }
    
    public void skip() {
        index++;
    }
    
    public String readString() {
        String string = record.get(index++);
        return (string.isEmpty() || string.equals("****")) ? null : string;
    }
    
    public Integer readInt() {
        String string = readString();
        return (string == null) ? null : Integer.parseInt(string);
    }
    
    public Float readFloat() {
        String string = readString();
        return (string == null) ? null : Float.parseFloat(string);
    }
    
    public Integer readStrRef() {
        String string = readString();
        return (string == null) ? null : RefString.valueOf(string).getStrRef();
    }
    
    public String readScript() {
        String string = readString();
        return (string == null) ? null : Script.valueOf(string).getResRef();
    }
    
    public Integer readFeat() {
        
        String string = readString();
        
        if (string == null)
            return null;
        for (Feat value : AdjustFeat.values())
            if (value.toString().equals(string))
                return value.getIndex();
        for (Feat value : NewFeat.values())
            if (value.toString().equals(string))
                return value.getIndex();
        
        throw new IllegalArgumentException();
    }
    
    public Integer readBaseItem() {
        
        String string = readString();
        
        if (string == null)
            return null;
        for (BaseItem value : AdjustItem.values())
            if (value.toString().equals(string))
                return value.getIndex();
        for (BaseItem value : NewItem.values())
            if (value.toString().equals(string))
                return value.getIndex();
        
        throw new IllegalArgumentException();
    }
    
    public Integer readSpell() {
        
        String string = readString();
        
        if (string == null)
            return null;
        for (Spell value : AdjustSpell.values())
            if (value.toString().equals(string))
                return value.getIndex();
        for (Spell value : NewSpell.values())
            if (value.toString().equals(string))
                return value.getIndex();
        
        throw new IllegalArgumentException();
    }
    
    public String readHexInt() {
        return readString();
    }
    
    public Integer readForceHostile() {
        
        String string = readString();
        if (string == null)
            return null;
        if (string.equals("NEW"))
            return Spell.nextForceHostile();
        else
            return Integer.parseInt(string);
    }
    
    public Integer readForceFriendly() {
        
        String string = readString();
        if (string == null)
            return null;
        if (string.equals("NEW"))
            return Spell.nextForceFriendly();
        else
            return Integer.parseInt(string);
    }
    
    public static final List<CSVRecord> FEATS = CSVReader.readResource("feats.csv");
    public static final List<CSVRecord> OLDFEATS = CSVReader.readResource("oldfeats.csv");
    public static final List<CSVRecord> BASEITEMS = CSVReader.readResource("baseitems.csv");
    public static final List<CSVRecord> OLDBASEITEMS = CSVReader.readResource("oldbaseitems.csv");
    public static final List<CSVRecord> SPELLS = CSVReader.readResource("spells.csv");
    public static final List<CSVRecord> OLDSPELLS = CSVReader.readResource("oldspells.csv");
    public static final List<CSVRecord> ITEMS = CSVReader.readResource("items.csv");
    public static final List<CSVRecord> ENEMIES = CSVReader.readResource("enemies.csv");
    public static final List<CSVRecord> CRAFTABLES = CSVReader.readResource("craftables.csv");
    public static final List<CSVRecord> SHIELDS = CSVReader.readResource("shields.csv");
    public static final List<CSVRecord> POISONS = CSVReader.readResource("poisons.csv");
    
    private static List<CSVRecord> readResource(String resource) {
        try {
            InputStream stream = ClassLoader.getSystemResourceAsStream(resource);
            Reader reader = new BufferedReader(new InputStreamReader(stream));
            List<CSVRecord> records = CSVFormat.DEFAULT.withHeader().parse(reader).getRecords();
            return Collections.unmodifiableList(records);
        }
        catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
    
    public static CSVRecord recordFor(Object object, List<CSVRecord> table) {
        
        String name = object.toString();
        
        for (CSVRecord record : table) {
            if (record.get(0).equals(name)) {
                return record;
            }
        }
        
        throw new IllegalArgumentException();
    }
}
