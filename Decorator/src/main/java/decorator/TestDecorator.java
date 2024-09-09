package decorator;

import decorator.decorator.AssessinEnemyDecorator;
import decorator.decorator.MageEnemyDecorator;
import decorator.decorator.WarriorEnemyDecorator;
import race.Elf;
import race.Human;

public class TestDecorator {

    public static void main(String[] args){

        System.out.println("*********** Human Warrior *************");
        Enemy humanWarrior = new WarriorEnemyDecorator(new Human());
        humanWarrior.attack();
        System.out.println("*********** Human Mage Warrior *************");
        Enemy humanWarriorMage = new WarriorEnemyDecorator(new MageEnemyDecorator(new Human()));
        humanWarriorMage.attack();
        System.out.println("*********** Elf Warrior Mage Assessin *************");
        Enemy elfWarriorMageAssessin = new AssessinEnemyDecorator(new MageEnemyDecorator(new WarriorEnemyDecorator(new Elf())));
        elfWarriorMageAssessin.attack();

    }
}
