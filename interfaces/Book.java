public class Book implements IRelatable {
    public int pages = 0;
    public String title = "";
    public String author = "";

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    // a method required to implement
    // the Relatable interface
    public int isLargerThan(IRelatable other) {
        Book otherBook = (Book)other;
        if (this.pages < otherBook.pages)
            return -1;
        else if (this.pages > otherBook.pages)
            return 1;
        else
            return 0;
    }
}