public abstract class Meal {

    public abstract void prepareIngredients();

    public abstract void cook();

    public void eat(){
        System.out.println("Mmm, that's good");
    }

    public abstract void cleanUp();

    //template method
    public final void makeMeal(){
        prepareIngredients();
        cook();
        eat();
        cleanUp();
    }
}
