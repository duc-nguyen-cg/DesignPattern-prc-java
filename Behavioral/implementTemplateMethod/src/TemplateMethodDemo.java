public class TemplateMethodDemo {
    public static void main(String[] args) {
        Meal meal1 = new HamburgerMeal();
        meal1.makeMeal();

        System.out.println();

        Meal meal2 = new TacoMeal();
        meal2.makeMeal();
    }
}
