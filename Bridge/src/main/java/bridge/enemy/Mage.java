package bridge.enemy;

import bridge.fighter.Fighter;
import bridge.fighter.MageFighterImpl;

public class Mage extends Enemy{

    public Mage(){
        setFighter(new MageFighterImpl());
    }

    @Override
    public int getHealth() {
        return super.getHealth();
    }

    @Override
    public Enemy setHealth(int health) {
        return super.setHealth(health);
    }


    public void attack() {
        System.out.println("mage:");
        getFighter().attack();
    }

    public void protect() {
        System.out.println("mage:");
        getFighter().protect();

    }

    @Override
    public Fighter getFighter() {
        return super.getFighter();
    }

    @Override
    public Enemy setFighter(Fighter fighter) {
        return super.setFighter(fighter);
    }
}
