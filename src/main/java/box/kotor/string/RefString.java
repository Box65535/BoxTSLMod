package box.kotor.string;

public enum RefString {
    
    
    ;
    
    private final String string;
    private int strRef;
    
    RefString(String string) {
        this.string = string;
    }
    
    public String getString() {
        return string;
    }
    
    public int getStrRef() {
        return strRef;
    }
    
    public void setStrRef(int strRef) {
        this.strRef = strRef;
    }
}
