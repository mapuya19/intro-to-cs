public class Album implements Comparable<Album>{
    private String author;
    private String songName;

    public Album(String songName, String author) {
        this.songName = songName;
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getSongName() {
        return this.songName;
    }

    @Override
    public String toString() {
        return this.songName + " by " + this.author;
    }

    // Sort by song title, then artist name
    @Override
    public int compareTo(Album o) {
        int valueTitle = this.getSongName().compareTo(o.getSongName());
        if (valueTitle == 0) {
            return this.getAuthor().compareTo(o.getAuthor());
        }
        return valueTitle;
    }
}
