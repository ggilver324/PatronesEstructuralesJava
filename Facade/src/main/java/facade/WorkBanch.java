package facade;

public class WorkBanch implements Smithy {

    public static final String ACTION = "improve";

    @Override
    public void work(String name) {
        System.out.println("lets " + ACTION + " the " + name + "...");
    }

    @Override
    public boolean search(String name) {
        return Inventory.search(name, false);
    }

    @Override
    public void remove(String name) {
        Inventory.remove(name, false);
    }

    @Override
    public void working(String name) {
        System.out.println("improve " + name);
    }
}
