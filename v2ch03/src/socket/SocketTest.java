package socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * User: Magnus
 * Date: 2015/3/3
 * Time: 16:17
 * To change this template use File | Settings | Editor |File and Code Templates.
 */
public class SocketTest
{
    public static void main(String[] args) throws IOException
    {
        try (Socket s = new Socket("time-A.timefreq.bldrdoc.gov", 13))
        {
            InputStream inStream = s.getInputStream();
            Scanner in = new Scanner(inStream);

            while (in.hasNextLine())
            {
                String line = in.nextLine();
                System.out.println(line);
            }
        }
    }
}
