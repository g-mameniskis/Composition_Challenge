package grayson.projects;

public class Bed {

    private String color;
    private String size;
    private boolean isBedMade;

    public Bed(String color, String size, boolean isBedMade) {
        this.color = color;
        this.size = size;
        this.isBedMade = isBedMade;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public boolean isBedMade() {
        return isBedMade;
    }

    public void makeBed() {
        if(!isBedMade) {
            System.out.println("Time to make the bed.");
            boolean bedMade = true;
            bedMade = isBedMade;
        }
    }
}
