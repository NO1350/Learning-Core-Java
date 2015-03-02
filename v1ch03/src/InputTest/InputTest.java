package InputTest;


import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * User: Magnus
 * Date: 2015/3/2
 * Time: 17:51
 * To change this template use File | Settings | Editor |File and Code Templates.
 */
public class InputTest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //Scanner in = new Scanner(Paths.get("myfile.txt"));

        //get first input
        System.out.println("what is your name?");
        String name = in.nextLine();

        //get second input
        System.out.println("How old are you?");
        int age = in.nextInt();

        //display output on console
        System.out.printf("Hello, "+name+". Next year,you'll be "+(age+1));
    }

}
