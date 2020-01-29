package grayson.projects;

public class Clothing {

    private int numberOfShirts;
    private int numberOfPants;

    public Clothing(int numberOfShirts, int numberOfPants) {
        this.numberOfShirts = numberOfShirts;
        this.numberOfPants = numberOfPants;
    }

    public int getNumberOfShirts() {
        return numberOfShirts;
    }

    public int getNumberOfPants() {
        return numberOfPants;
    }

    public void pickClothes(String shirt, String pants) {
        System.out.println("Time to get dressed. I have "
                + numberOfPants + " pants and " + numberOfShirts + " shirts to pick from.");
        System.out.println("I'll wear a " + shirt + " with a pair of " + pants);

    }
}
