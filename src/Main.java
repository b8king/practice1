import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        Register register = new Register();
        register.reg("root","1234");
        register.reg("admin");
        register.del("user","qwerty");

        Iterator<User>userIterator = register.registration.iterator();
        while(userIterator.hasNext()) {
            User nextUser = userIterator.next();
            System.out.println(nextUser);
        }
    }
}
