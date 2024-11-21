package lab2.pokemon;

import lab2.move.AerialAce;
import lab2.move.AirSlash;
import lab2.move.Confide;
import lab2.move.TailWhip;
import ru.ifmo.se.pokemon.*;

public final class Emolga extends Pokemon {
    public Emolga (String name, int level){
        super(name, level);
        setType(Type.FLYING, Type.ELECTRIC);
        int hp = 100;
        int atk = 150;
        int def = 120;
        int spAtk = 120;
        int spDef = 100;
        int speed = 90;
        setStats(hp, atk, def, spAtk, spDef, speed);
        setMove(new TailWhip(), new AerialAce(), new AirSlash(), new Confide());
    }
}
