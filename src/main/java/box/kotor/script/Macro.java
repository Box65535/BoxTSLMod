package box.kotor.script;

enum Macro {
    ;
    
    private final String macro;
    private final String expansion;
    
    Macro(String macro) {
        this.macro = macro;
        this.expansion = null; // TODO Read from resource
    }
    
    Macro(String macro, String expansion) {
        this.macro = macro;
        this.expansion = expansion;
    }
    
    public String getMacro() {
        return macro;
    }
    
    public String getExpansion() {
        return expansion;
    }
}
