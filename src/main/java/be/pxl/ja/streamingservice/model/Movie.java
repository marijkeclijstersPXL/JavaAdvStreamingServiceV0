package be.pxl.ja.streamingservice.model;

import java.time.LocalDate;

public class Movie extends Content implements Playable{
    public static final int LONG_PLAYING_TIME = 2 * 60 + 15;
    private String director;
    private LocalDate releaseDate;
    private int duration;
    private Genre genre;

    public Movie(String title, Rating maturityRating) {
        super (title, maturityRating);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getDuration() {
        return duration;
    }

    public String getPlayingTime() {
        if (duration == 0) {
            return "?";
        }
        if (duration < 60){
            return duration + " min";
        } else {
            int hours = (int) duration / 60;
            int minutes = duration - (hours * 60);
            return hours + " h " + minutes + " min";
        }
    }

    public boolean isLongPlayingTime() {
        return duration >= LONG_PLAYING_TIME;
    }

    @Override
    public void play() {
        System.out.println("Playing: " + this);
    }

    @Override
    public void pause() {
        System.out.println ("Pausing: " + this);
    }


    public void setDuration(int duration) {
        this.duration = Math.abs(duration);
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        if(releaseDate != null) {
            return getTitle() + "(" + releaseDate.getYear() + ")";
        }
        return getTitle() + " " + getMaturityRating().minimumLeeftijd;
    }
}
