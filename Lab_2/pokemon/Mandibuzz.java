package lab2.pokemon;

import lab2.move.BoneRush;
import lab2.move.BraveBird;
import lab2.move.FurryAttack;
import lab2.move.ThunderWave;
import ru.ifmo.se.pokemon.*;

public final class Mandibuzz extends Vullaby {
    public Mandibuzz(String name, int level){
        super(name, level);
        setType(Type.FLYING, Type.ELECTRIC);
        int hp = 70;
        int atk = 55;
        int def = 75;
        int spAtk = 45;
        int spDef = 65;
        int speed = 60;
        setStats(hp, atk, def, spAtk, spDef, speed);
        setMove(new ThunderWave(), new FurryAttack(), new BraveBird(), new BoneRush());
    }
}
