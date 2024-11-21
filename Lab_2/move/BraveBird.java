package lab2.move;

import ru.ifmo.se.pokemon.*;

public final class BraveBird extends PhysicalMove {
    public BraveBird(){
        super(Type.FLYING, 120, 1);
    }
    @Override
    protected void applySelfDamage(Pokemon att, double damage){
        att.setMod(Stat.HP, (int) (damage / 3));
    }
    @Override
    protected String describe() {
        return "Использует Brave Bird";
    }
}
