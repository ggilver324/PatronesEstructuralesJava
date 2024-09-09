package decorator.decorator;

import decorator.Enemy;

public class AssessinEnemyDecorator extends EnemyDecorator {

    public AssessinEnemyDecorator(Enemy enemy) {
        super(enemy);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("Assessin attack!!");
    }
}
