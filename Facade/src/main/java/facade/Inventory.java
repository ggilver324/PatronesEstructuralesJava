package facade;

public interface Inventory {

    static boolean search(String name, boolean make){
        String action = make ? "make" : "improve";
        if(Math.random() > 0.5){
            System.out.println("you have the necessary materials to " + action + " to " + name);
            return true;
        } else {
            System.out.println("you dont have the necessary materials to " + action + " to " + name);
            return false;
        }
    }

    static void remove(String name, boolean make){
        String action = make ? "make" : "improve";
        System.out.println("removing from your inventary the materials to " + action + " to " + name);
    }
}
