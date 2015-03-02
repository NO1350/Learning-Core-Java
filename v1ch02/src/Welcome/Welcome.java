package Welcome;

/**
 * Created by Intellij IDEA.
 * User: Magnus
 * Date: 2015/3/2
 * Time: 17:33
 * To change this template use File | Settings | Editor |File and Code Templates.
 */
public class Welcome {
    public static void main(String[] args)
    {
        String[] greeting = new String[3];
        greeting[0] = "Welcome to Core Java";
        greeting[1] = "by Cay Horstmann";
        greeting[2] = "and Gary Cornell";

        for (String g : greeting)
            System.out.println(g);
    }
}

