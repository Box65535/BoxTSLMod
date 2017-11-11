package box.kotor.old;

public enum Weapon {
    
    SHORT_SWORD(4, WeaponType.MELEE, 1, 8, 2, 2, DamageType.SLASHING, 0),
    LONG_SWORD(2, WeaponType.MELEE, 1, 10, 2, 2, DamageType.SLASHING, 0),
    ;
    
    Weapon(int copyRow, WeaponType type, int numDice, int dieToRoll,
           int critThreat, int critHitMult, DamageType damageType, int maxAttackRange) {
        
    }
}
