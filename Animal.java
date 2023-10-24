public class Animal {
    private String species;
    private String color;

    /* Your code goes here */

    public void setSpecies(String _species){
        species = _species;
    }

    public void setColor(String _setColor){
        color = _setColor;
    }


    public void print() {
        System.out.println("Animal: " + species);
        System.out.println("Color: " + color);
    }
}