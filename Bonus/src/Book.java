public class Book implements Comparable<Book> {
    private String title;
    private String author;

    public Book(String title,  String  author) {
        this.title  =  title;
        this.author =  author;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    @Override
    public String toString() {
        return this.title + " by " + this.author;
    }

    @Override
    public int compareTo(Book o) {
        int valueTitle = this.getTitle().compareTo(o.getTitle());
        if (valueTitle == 0) {
            return this.getAuthor().compareTo(o.getAuthor());
        }
        return valueTitle;
    }
}
