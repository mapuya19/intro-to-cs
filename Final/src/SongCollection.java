import java.util.ArrayList;
import java.util.Collections;

public class SongCollection {
    private ArrayList<Album> collection;

    public static void main(String[] args) {
        SongCollection songs = new SongCollection();
        songs.add("Blank Space", "Taylor Swift");
        songs.add("Someone Like You", "Adele");
        songs.add("Purple Rain", "Prince");

        System.out.println(songs);

        songs.sort();
        System.out.println("Sorting song collection!");

        System.out.println(songs);
    }

    public SongCollection() {
        collection = new ArrayList<Album>(10);
    }

    public SongCollection(int length) {
        collection = new ArrayList<Album>(length);
    }

    public void add(String songName, String author) {
        Album newAlbum = new Album(songName, author);
        collection.add(newAlbum);
    }

    public void sort() {
        Collections.sort(collection);
    }

    @Override
    public String toString() {
        return "Song Collection has: " + collection;
    }
}
