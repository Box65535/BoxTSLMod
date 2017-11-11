package box.kotor.item;

import box.kotor.gff.GffFile;
import box.kotor.data.Module;

public enum Placeable {
    ;
    
    private final Module module;
    private final Item[] items;
    
    Placeable(Module module, Item... items) {
        this.module = module;
        this.items = items;
    }
    
    public void adjust(GffFile file) {
        // TODO
    }
    
    public Module getModule() {
        return module;
    }
    
    public String getResRef() {
        return toString();
    }
}
