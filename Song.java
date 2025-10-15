public class Song {
    private String title;
    private String artist;
    private String topic;
    private int year;
    private double danceability;
    private double len;
    private String genre;
    private double obscene;
    private double sta;
    private double loudness;

    public Song (String artist, String title, int year, String genre, double len, double sta, double obscene, double danceability, double loudness, String topic){
        this.title=title;
        this.artist=artist;
        this.topic=topic;
        this.year=year;
        this.danceability=danceability;
        this.len=len;
        this.sta=sta;
        this.obscene=obscene;
        this.loudness=loudness;
        this.genre=genre;
    
    
    }
//artist_name;track_name;release_date;genre;len;shake the audience;obscene;danceability;loudness;topic
 

public String getArtist(){
        return artist;
    }   

public String getTitle()
    {
        return title;
    }

    public double getObscene(){
        return obscene;
    }

    public double getSta(){
        return sta;
    }

    public String getGenre(){
        return genre;
    }

    public double getLoudness(){
        return loudness;
    }



    public int getYear(){
        return year;
    }

    public double getDanceability(){
        return danceability;
    }

    public double getLen(){
        return len;
    }

    public String getTopic(){
        return topic;
    }
    
}
