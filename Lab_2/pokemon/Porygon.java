package lab2.pokemon;

import lab2.move.*;
import ru.ifmo.se.pokemon.*;

public class Porygon extends Pokemon {
    public Porygon(String name, int level){
        super(name, level);
        setType(Type.NORMAL);
        int hp = 65;
        int atk = 60;
        int def = 70;
        int spAtk = 85;
        int spDef = 75;
        int speed = 40;
        setStats(hp, atk, def, spAtk, spDef, speed);
        setMove(new DreamEater(), new ThunderWave());
    }
}
