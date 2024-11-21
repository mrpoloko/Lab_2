package lab2.move;

import ru.ifmo.se.pokemon.*;

public final class BoneRush extends PhysicalMove {
    public BoneRush(){
        super (Type.NORMAL, 25, 85, 1, 2);
    }
    @Override
    protected String describe(){
        return "Использует атаку Bone Rush";
    }
}

