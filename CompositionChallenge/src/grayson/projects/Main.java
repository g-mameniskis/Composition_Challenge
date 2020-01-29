package grayson.projects;

public class Main {

    public static void main(String[] args) {

        Dimensions theDimensions = new Dimensions(12, 10, 15);

        Bed theBed = new Bed("red", "queen", false);

        Bookshelf theBookshelf = new Bookshelf("Moby Dick", 25);

        Clothing clothing = new Clothing(10, 6);

        AlarmClock alarmClock = new AlarmClock("8:00PM");

        Closet theCloset = new Closet(clothing);

        NightStand theNightStand = new NightStand(alarmClock);

        BedRoom theBedRoom = new BedRoom(theBed, theDimensions, theCloset, theBookshelf, theNightStand);

        theBedRoom.getDressed();
        theBedRoom.readBook("Moby Dick");
        theBedRoom.getUp();
    }
}
