package box.kotor.item;

enum Property {
    PIERCING_RESIST_2,
    PIERCING_RESIST_4,
    SLASHING_RESIST_2,
    SLASHING_RESIST_4,
    ENERGY_RESIST_2,
    ENERGY_RESIST_4,
    ION_RESIST_2,
    ION_RESIST_4,
    FIRE_RESIST_2,
    FIRE_RESIST_4,
    SONIC_RESIST_2,
    PIERCING_IMMUNITY_20,
    SLASHING_IMMUNITY_20,
    FIRE_IMMUNITY_30,
    COLD_IMMUNITY_30,
    SAVES_BONUS_1,
    MAX_DEX_BONUS_2,
    FEAR_IMMUNITY,
    POISON_SAVE_BONUS_2,
    FIRE_SAVE_BONUS_3,
    COLD_SAVE_BONUS_3,
    ;
    
    public final int property;
    public final int subtype;
    public final int costTable;
    public final int costValue;
    public final int param1;
    public final int param1Value;
    public final int param2;
    public final int param2Value;
    
    Property() {
        this(0, 0);
    }
    
    Property(int property, int subtype) {
        this(property, subtype, -1, -1);
    }
    
    Property(int property, int subtype, int costTable, int costValue) {
        this(property, subtype, costTable, costValue, -1, -1);
    }
    
    Property(int property, int subtype, int costTable, int costValue,
             int param1, int param1Value) {
        this(property, subtype, costTable, costValue, param1, param1Value,  -1, -1);
    }
    
    Property(int property, int subtype, int costTable, int costValue,
             int param1, int param1Value, int param2, int param2Value) {
        
        this.property = property;
        this.subtype = subtype;
        this.costTable = costTable;
        this.costValue = costValue;
        this.param1 = param1;
        this.param1Value = param1Value;
        this.param2 = param2;
        this.param2Value = param2Value;
    }
}
