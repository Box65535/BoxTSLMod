package box.kotor.data;

public enum Skill {
    ;
    
    private final int index;
    
    Skill(int index) {
        this.index = index;
    }
    
    public int getIndex() {
        return index;
    }
}
