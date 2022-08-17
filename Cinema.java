import java.util.ArrayList;

public class Cinema {
    private String title;
    private String genre;
    private double duration;

    public static ArrayList<Cinema> cinemaListTotal=new ArrayList<>();

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public double getDuration() {
        return duration;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }



    public Cinema(String title,String genre,double duration){
        setTitle(title);
        setGenre(genre);
        setDuration(duration);

    }

    public Cinema() {}

    @Override
    public String toString(){
        return "фильм: " + this.title+", ;жанр: "+ this.genre+", duration: "+this.getDuration()+ System.lineSeparator();
    }
}
