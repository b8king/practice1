import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class RegisterTest {
    Register register = new Register();
    User user = new User();
    String name;
    String pass;

    @org.junit.jupiter.api.Test
    void reg()
    {
        user.setName(name);
        user.setPassword(pass);
        register.registration.add(user);
    }

    @org.junit.jupiter.api.Test
    void testReg()
    {
        register.reg("root","1234");
        register.reg("admin");
        register.del("user","qwerty");
    }

    @org.junit.jupiter.api.Test
    void del()
    {
        register.reg("root","1234");
        register.reg("admin","1111");
        register.reg("user");
        register.registration.remove(2);
        Iterator<User> userIterator = register.registration.iterator();
        while(userIterator.hasNext())
        {
            User nextUser = userIterator.next();
            System.out.println(nextUser);
        }
    }
}