public class Client {
    public static void main(String[] args) {
        UserController userController = new UserController(new XMLStorage());
        User person = new User("Saber", "excalibur@knight.com");

        userController.store(person);

        System.out.println();

        userController.setStoreStrategy(new MySQLStorage());
        userController.store(person);

    }

}
