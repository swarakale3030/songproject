import java.util.Scanner;
import java.io.File;
import java.io.IOException; 


public class ReadData{

    public void read () {
        Scanner in;
        int count = 1;
        Song[] song = new Song [28372];
        try
        {
             in = new Scanner(new File("songs 2025-2026 ANSIsc.csv"));
             while (in.hasNext())
             {
                //artist_name;track_name;release_date;genre;len;shake the audience;obscene;danceability;loudness;topic

                String title= in.nextLine().split(";")[1];
                String artist=in.nextLine().split(";")[0];
                String topic=in.nextLine().split(";")[9];
                String genre=in.nextLine().split(";")[3];
                double sta=Double.parseDouble(in.nextLine().split(";")[5]);
                double obscene=Double.parseDouble(in.nextLine().split(";")[6]);
                double loudness=Double.parseDouble(in.nextLine().split(";")[8]);
                int year=Integer.parseInt(in.nextLine().split(";")[2]);
                String danceability=in.nextLine().split(";")[7];
                double len=Double.parseDouble(in.nextLine().split(";")[4]);
                System.out.print(count+ ":");
                System.out.println(in.nextLine());
                
                count++;
                Song[]=(String artist, String title, int year, String genre, double len, double sta, double obscene, double danceability, double loudness, String topic)
             }
             in.close();
        }
        catch ( IOException e){
            System.out.println("error in scanner");
            return;
        }
    


}
}