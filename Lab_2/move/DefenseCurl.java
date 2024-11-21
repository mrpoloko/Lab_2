package lab2.move;

import ru.ifmo.se.pokemon.*;

public final class DefenseCurl extends StatusMove {
    public DefenseCurl() {
        super(Type.NORMAL, 0,0);
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.DEFENSE, 1);
    }
    @Override protected String describe() {
        return "Использует DefenseCurl";
    }
}
