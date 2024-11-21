package lab2.move;

import ru.ifmo.se.pokemon.*;

public final class FurryAttack extends PhysicalMove {
    public FurryAttack(){
        super (Type.NORMAL, 15, 85, 1, 2);
    }
    @Override
    protected String describe(){
        return "Использует атаку FurryAttack";
    }
}
