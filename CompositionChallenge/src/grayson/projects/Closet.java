package grayson.projects;

public class Closet {

    private Clothing clothing;

    public Closet(Clothing clothing) {
        this.clothing = clothing;
    }

    public Clothing getClothing() {
        return clothing;
    }

    public void openCloset() {
        System.out.println("Let's go in the closet.");
        clothing.pickClothes("turtleneck", "jeans");
    }
}
