package lab2.move;

import ru.ifmo.se.pokemon.*;

public final class TailWhip extends StatusMove {
    public TailWhip() {
        super(Type.NORMAL, 0, 1);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.DEFENSE, -1);
    }
    @Override
    protected String describe() {
        return "Использует атаку Tail Whip";
    }
}

