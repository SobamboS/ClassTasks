package Animal;

public class Animal {
    String colour;
    String name;
    String breed;

    public Animal(String animalColour, String animalName, String animalBreed) {
        colour = animalColour;
        name = animalName;
        breed = animalBreed;
    }

    public String getColour() {
        return colour;

    }
    public String getBreed(){
        return breed;
    }

    public String getName(){
        return name;
    }
}