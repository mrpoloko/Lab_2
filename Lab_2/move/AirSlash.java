package lab2.move;
import ru.ifmo.se.pokemon.*;

public final class AirSlash extends SpecialMove {
    public AirSlash() {
        super(Type.FLYING, 75, 0.95);
    }
    @Override protected void applyOppEffects(Pokemon p) {
        Effect eff = new Effect().chance(0.3).turns(1);
        eff.flinch(p);
    }
    @Override protected String describe() {
        return "Использует Air Slash";
    }
}