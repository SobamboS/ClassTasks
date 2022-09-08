package Animal;

public class Dog extends Animal {
    public String bark;

    public Dog(String animalColour, String animalName, String animalBreed, String bark) {
        super(animalColour, animalName, animalBreed);
        this.bark = bark;
    }

    public String getBark() {
        return bark;
    }
    @Override
    public String toString(){
        return super.toString() + this.bark;
    }
}

