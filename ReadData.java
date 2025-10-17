import java.util.Scanner;
import java.io.File;
import java.io.IOException; 


public class ReadData{

    public void read () {
        Scanner in;
        int count = 0;
        Song[] song = new Song [28372];
        try
        {
             in = new Scanner(new File("songs 2025-2026 ANSIsc.csv"));
             in.nextLine();
             while (in.hasNext())
             {
                //artist_name;track_name;release_date;genre;len;shake the audience;obscene;danceability;loudness;topic

                String line = in.nextLine();
                String title = line.split(";")[1];
                String artist = line.split(";")[0];
                String topic = line.split(";")[9];
                String genre =line.split(";")[3];
                double sta = Double.parseDouble(line.split(";")[5]);
                double obscene = Double.parseDouble(line.split(";")[6]);
                double loudness = Double.parseDouble(line.split(";")[8]);
                int year = Integer.parseInt(line.split(";")[2]);
                double danceability = Double.parseDouble(line.split(";")[7]);
                double len = Double.parseDouble(line.split(";")[4]);
                System.out.print(count+ ":");
               System.out.println(line);
                
                count++;
                song[count] = new Song (artist, title, year,  genre,  len,  sta,  obscene,  danceability,  loudness,  topic);}
             in.close();
        }
        catch ( IOException e)
        {
            System.out.println("error in scanner");
            return song;
        }

        

        
    


}
}