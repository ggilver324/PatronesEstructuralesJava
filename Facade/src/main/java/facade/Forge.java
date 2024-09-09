package facade;

public class Forge implements Smithy {

    public static final String ACTION = "make";

    @Override
    public void work(String name) {
        System.out.println("lets meke the " + name + "...");
    }

    @Override
    public boolean search(String name) {
        return Inventory.search(name, true);
    }

    @Override
    public void remove(String name) {
        Inventory.remove(name, true);
    }

    @Override
    public void working(String name) {
        System.out.println("making " + name);
    }
}
