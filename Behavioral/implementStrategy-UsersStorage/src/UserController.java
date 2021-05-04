public class UserController {
    private UserStorage storeStrategy;

    public UserController(UserStorage storeStrategy) {
        this.storeStrategy = storeStrategy;
    }

    public void setStoreStrategy(UserStorage storeStrategy) {
        this.storeStrategy = storeStrategy;
    }

    public void store(User user){
        storeStrategy.store(user);
    }
}
