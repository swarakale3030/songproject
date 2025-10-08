import java.util.Scanner;
import java.io.File;
import java.io.IOException; 

public class ReadData{

    public void read () {
        Scanner in;
        try
        {
             in = new Scanner(new File("songs 2025-2026ANSI.csv"));
             while (in.hasNext())
             {
                System.out.println(in.nextLine());
             }
             in.close();
        }
        catch ( IOException e){
            System.out.println("error in scanner");
            return;
        }
    

    
}
}