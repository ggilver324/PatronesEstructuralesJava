package race;

import decorator.Enemy;

public class Ore implements Enemy {
    @Override
    public void attack() {
        System.out.println("Ore attack!!");
    }
}
