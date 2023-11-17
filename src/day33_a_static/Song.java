package day33_a_static;

public class Song {
    String name;
    double length;
    String artist;
    String genre;


    public Song (String name) {
        this.name = name;
    }

    public Song (String name, double length) {
        this (name);
        this.length = length;
    }

    public Song (String name, double length, String artist) {
        this(name, length);
        this.artist = artist;
    }

    public Song(String name, double length, String artist, String genre) {
        this (name, length, artist);
        this.genre = genre;
    }


    @Override
    public String toString() {
        return "Song: " +
                "\n\tname: " + name +
                "\n\tlength: " + (length != 0.0 ? length: "There is not length for this object") +
                "\n\tartist: " + artist +
                "\n\tgenre: " + genre;
    }
}
