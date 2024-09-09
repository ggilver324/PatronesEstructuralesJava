package adapter;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

public class ZombieAdapter implements Enemy {

    private Zombie zombie;

    public ZombieAdapter(){
        this.zombie = new Zombie();
    }

    @Override
    public void attack() {
        int value = (int) (Math.random()*10);
        if(value % 2 == 0)
           zombie.bite();
        else
            zombie.hit();
    }

    @Override
    public void damage() {
        int value = (int) (Math.random()*10);
        if(value % 2 == 0)
            zombie.headDamange();
        else
            zombie.bodyDamange();
    }
}
