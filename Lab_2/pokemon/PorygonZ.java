package lab2.pokemon;

import lab2.move.Swagger;
import ru.ifmo.se.pokemon.Type;

public final class PorygonZ extends  Porygon2{
    public PorygonZ(String name, int level){
        super(name, level);
        setType(Type.NORMAL);
        int hp = 85;
        int atk = 80;
        int def = 90;
        int spAtk = 105;
        int spDef = 95;
        int speed = 60;
        setStats(hp, atk, def, spAtk, spDef, speed);
        addMove(new Swagger());
    }
}
