import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class main {
    public  static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        try{
            //Process p = Runtime.getRuntime().exec("ls -llt");
            Process p = Runtime.getRuntime().exec("./bash/test.bash");
            BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String line = null;

            while ((line = in.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}

