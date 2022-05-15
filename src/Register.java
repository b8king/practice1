import java.util.ArrayList;

import java.util.Random;

public class Register {
    ArrayList<User> registration = new ArrayList<>();

    public void reg(String name,String pass)
    {
        User user = new User();
        user.setName(name);
        user.setPassword(pass);
        registration.add(user);
    }
    public void reg(String name)
    {
        User user = new User();
        user.setName(name);
        int length = 16;
        Random r = new Random();
        String s = r.ints(48, 122)
                .filter(i -> (i < 57 || i > 65) && (i < 90 || i > 97))
                .mapToObj(i -> (char) i)
                .limit(length)
                .collect(StringBuilder :: new, StringBuilder :: append, StringBuilder :: append)
                .toString();
        user.setPassword(s);
        registration.add(user);
    }
    public void del(String name,String pass)
    {
        User user = new User();
        user.setName(name);
        user.setPassword(pass);
        registration.add(user);
        registration.remove(2);
    }
}
