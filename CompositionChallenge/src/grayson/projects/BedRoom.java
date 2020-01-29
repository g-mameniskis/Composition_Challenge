package grayson.projects;

public class BedRoom {

    private Bed bed;
    private Dimensions dimensions;
    private Closet closet;
    private Bookshelf bookshelf;
    private NightStand nightStand;

    public BedRoom(Bed bed, Dimensions dimensions, Closet closet, Bookshelf bookshelf, NightStand nightStand) {
        this.bed = bed;
        this.dimensions = dimensions;
        this.closet = closet;
        this.bookshelf = bookshelf;
        this.nightStand = nightStand;
    }

    public Bed getBed() {
        return bed;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public Closet getCloset() {
        return closet;
    }

    public Bookshelf getBookshelf() {
        return bookshelf;
    }

    public NightStand getNightStand() {
        return nightStand;
    }

    public void readBook(String book) {
        bookshelf.removeBook(book);
    }

    public void getDressed() {
        closet.openCloset();
    }

    public void getUp() {
        nightStand.wakeUp(7.0);
    }
}
