package lab2.pokemon;

import lab2.move.*;
import ru.ifmo.se.pokemon.*;

public class Vullaby extends Pokemon {
    public Vullaby(String name, int level){
        super(name, level);
        setType(Type.FLYING, Type.ELECTRIC);
        int hp = 70;
        int atk = 55;
        int def = 75;
        int spAtk = 45;
        int spDef = 65;
        int speed = 60;
        setStats(hp, atk, def, spAtk, spDef, speed);
        setMove(new ThunderWave(), new FurryAttack(), new BraveBird());
    }
}
