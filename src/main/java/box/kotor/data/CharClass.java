package box.kotor.data;

public enum CharClass {
    ;
    
    // TODO Assign these
    private static CharClass JEDI_APPRENTICE;
    private static CharClass JEDI_MOOK;
    private static CharClass JEDI_BOSS;
    
    private final int index;
    
    CharClass(int index) {
        this.index = index;
    }
    
    public int getIndex() {
        return index;
    }
}
