import java.util.Scanner;



/*Define the Animal class's setSpecies()
mutator to set the field
species to inputSpecies and the setColor() mutator
to set the field color to inputColor.

Ex: If the input is:

duck
green

then the output is:

Animal: duck
Color: green

 */

public class AnimalDetails {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Animal animal = new Animal();
        String inputSpecies;
        String inputColor;

        inputSpecies = scnr.next();
        inputColor = scnr.next();
        animal.setSpecies(inputSpecies);
        animal.setColor(inputColor);

        animal.print();
    }
}