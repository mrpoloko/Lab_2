package lab2;

import lab2.pokemon.Emolga;
import lab2.pokemon.Mandibuzz;
import lab2.pokemon.Porygon;
import lab2.pokemon.Vullaby;
import lab2.pokemon.PorygonZ;
import lab2.pokemon.Porygon2;

import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Emolga("Настя", 1);
        Pokemon p2 = new Vullaby("Лёха", 1);
        Pokemon p3 = new Mandibuzz("Артём", 1);
        Pokemon p4 = new Porygon("Свен", 1);
        Pokemon p5 = new Porygon2("Своё", 1);
        Pokemon p6 = new PorygonZ("Твоё", 1);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
        }
    }
