public class XMLStorage implements UserStorage{
    @Override
    public void store(User user){
        System.out.println("Saved "+user+" to XML file");
    }
}
