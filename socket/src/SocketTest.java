import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SocketTest
{
    public static void main(String... args) throws UnknownHostException
    {

        try (Socket s = new Socket("cp01-zhangming12.epc.baidu.com", 8080)) {

            OutputStream output = s.getOutputStream();
            output.write("GET / HTTP/1.1\nHost: www.baidu.com".getBytes());

            InputStream inputStream = s.getInputStream();
            Scanner in = new Scanner(inputStream);

            while (in.hasNextLine()) {
                String line = in.nextLine();
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
