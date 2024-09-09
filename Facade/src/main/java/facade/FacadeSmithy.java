package facade;

public class FacadeSmithy {

    public void work(String name, boolean make){
        if(make){
            Forge forge = new Forge();
            forge.work(name);
            if(Recipes.getRecipes(name, make)){
                if(!forge.search(name))
                    return;
                forge.remove(name);
                forge.working(name);
                System.out.println("the " + name + " have been created!!");
            } else {
                System.out.println("It has not been possible to " + forge.ACTION + " the " + name);
            }
        } else {
            WorkBanch workBanch = new WorkBanch();
            workBanch.work(name);
            if(Recipes.getRecipes(name, make)){
                if(!workBanch.search(name))
                    return;
                workBanch.remove(name);
                workBanch.working(name);
                System.out.println("the " + name + " have been improve!!");
            } else {
                System.out.println("It has not been possible to " + workBanch.ACTION + " the " + name);
            }
        }
    }
}
