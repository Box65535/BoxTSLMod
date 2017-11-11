package box.kotor.item;

import box.kotor.twoda.TwodaRecord;
import box.kotor.data.Skill;

import java.util.stream.Stream;

public enum Craftable {
    ;
    
    private final CraftType type;
    private final Skill skill;
    private final int skillReq;
    private final int levelReq;
    
    Craftable(CraftType type, Skill skill, int skillReq, int levelReq) {
        this.type = type;
        this.skill = skill;
        this.skillReq = skillReq;
        this.levelReq = levelReq;
    }
    
    public TwodaRecord toRecord() {
        return null; // TODO
    }
    
    public static Iterable<Craftable> workbench() {
        return Stream.of(Craftable.values()).filter(c -> c.type.isWorkbench())::iterator;
    }
    
    public static Iterable<Craftable> medbench() {
        return Stream.of(Craftable.values()).filter(c -> c.type.isMedbench())::iterator;
    }
}
