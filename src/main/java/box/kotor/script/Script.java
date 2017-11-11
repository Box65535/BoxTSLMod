package box.kotor.script;

public enum Script {
    ;
    
    private final String text;
    
    Script(Template template, Macro... macros) {
        String text = template.getText();
        for (Macro macro : macros)
            text = text.replace(macro.getMacro(), macro.getExpansion());
        this.text = text;
    }
    
    public String getResRef() {
        return toString();
    }
}
